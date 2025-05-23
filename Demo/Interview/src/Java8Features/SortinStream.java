package Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SortinStream {

	public static void main(String args[])
	
	
	{
		
		List<Integer> l1 =   Arrays.asList(12,43,56,71,80,22,55,66,80,12,30);
		
		  List <Integer>  I = l1.stream().sorted(Comparator.reverseOrder()).toList(); //using comparator
		  List<Integer> l2 = l1.stream().distinct().sorted((a,b) -> b.compareTo(a)).toList(); //Using comparable
		  
		  
		  
		  List<String> list = List.of("A", "AACCD" , "AABBCD",  "ABAED" , "ABEDE");
		  
		  
		  List<String> sortedlist  = list.stream().sorted(Comparator.comparingInt(String::length).reversed()).toList();
		  List<String> sortedlisst  = list.stream().sorted((a,b) -> Integer.compare( b.length() ,a.length())).toList();
		  
		  
		  
		  System.out.println(I);
		  System.out.println(l2);
		  System.out.println(sortedlist);
		  System.out.println(sortedlisst);
		  
		  //Using min max function
		  
		 Integer n =  l1.stream().max((a,b) -> a.compareTo(b)).get();
		 System.out.println(n);
		 

//	        Optional<Employee> maxage = employees.stream().max(Comparator.comparingInt(Employee::getAge));
//	        System.out.println(maxage.get().age);  //is case me employess ek puri class thi na ki sirf normal list
		  
		  
		
		
		
		
	}
	
	
}
