package Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class lokistream {
	
	public static void main(String args[])
	{
		
		//if we use array list then it is mutable otherwise not
		List<Integer> l1 = new ArrayList<Integer>(List.of(2, 12, 45, 32,  66, 6, 12 ));
		
		
		int thirdlargestno =    largestnumber(l1);
		
		System.out.println("Largest third number"  +  thirdlargestno);
		
		
		List<Integer> l2 = new ArrayList<Integer>(List.of(2, 12, 45, 32,  66, 6, 12 ));
		
		List<Integer> l3 = l2.stream().distinct().sorted(Collections.reverseOrder())
        .collect(Collectors.toList());
		System.out.println(l3.get(2));
		
		//finding minimum number in list .max((a, b) -> a.compareTo(b));
		
		Optional<Integer> minimumnumber = l2.stream().max((i1,i2) -> i1.compareTo(i2));
		
		System.out.println(minimumnumber);
		
	}

	private static int largestnumber(List<Integer> l1) {
		// TODO Auto-generated method stub
		
		
		
				
	if(l1== null || l1.size()<3)
	{
		
		throw new IllegalArgumentException("List should contain at least three numbers");
	}
				
	int first = Integer.MIN_VALUE;
	int second	=   Integer.MIN_VALUE;
	int third =   Integer.MIN_VALUE;
	                         // 2 12 45 32  66 6 12 
	for(int n1 : l1)	
	{
		if(n1>first)
		{ third = second;  //   
		second = first;    //
		first = n1;            //   2
		}
		else if(n1>second) {
			third = second;   //  
			second = n1;}    //
	   else if(n1>third) 
		   third = n1;     //
	}
	
	return third;
	}
}
