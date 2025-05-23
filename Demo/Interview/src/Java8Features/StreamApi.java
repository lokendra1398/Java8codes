package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	
	public static void main(String args[])
	
	
	{
		
		List<Integer> l1 =  new ArrayList<>(); 
		
		for(int i = 0;i<=10;i++)
		{
			l1.add(i);
		}
		//with stream api
		System.out.println(l1);
		//yha niche humne l1.stream() likhdia warna hume pura define karna padta STream<Integer> = stream =l1.stream();  
		List<Integer> l2  = l1.stream().filter(i ->  i%2 == 0).collect(Collectors.toList());
				System.out.println(l2);
				
			l2.stream().forEach(name-> System.out.println(name));
				
				//without stream api
			List<Integer> l3 =	new ArrayList<>();
	     for(int j :  l1)			
	     {
	    	 if(j%2!=0)
	    	 {
	    		l3.add(j);
	    	 }
	    	
	     }
	     
	     System.out.println(l3);
	}
	
	
	
	
	
}
