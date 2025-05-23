package OnlyStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class java8Streams {

	
	
	public static void main(String[] args) {
		
		
		
		
		String S ="Lokendra  singh Shekhawat";
		
		// highest length of worlds
		List<String> s = Arrays.asList(S.split(" "));
		
		System.out.println(s.stream().max((a,b) -> Integer.compare(a.length(), b.length())));

		
		//find no of vowels in given sentence
	String l = "My name is gokul";
	 List<String>  sl =  Arrays.asList(l.split(" "));
		
	sl.stream()
	   .forEach(word -> {
	       int vowelCount = word.replaceAll("[^aeiouAEIOU]", "").length();
	       System.out.println(word + " -> " + vowelCount + " vowels");
	   });
	
	System.out.println("*****************************************");
	
	
	String name ="Lokendra";
	List<String> s1 = Arrays.asList(name.split(""));
	Map<String,Long> mp = s1.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
	System.out.println(mp);
	

	System.out.println("*****************************************");
	
	//Sum of unique elements
	
	int[] arr = { 3,5,6,6,7,8,7,5,9,2};
	  System.out.println(Arrays.stream(arr).distinct().sum());
	  
	  System.out.println("**************************************");
	 
	  
	  String nm = "Varshinia";
	  List<String> l1 = Arrays.asList(nm.split(""));
	  System.out.println(l1.stream().filter(i->Collections.frequency(l1, i)<2).findFirst().get());

	  System.out.println(l1.stream().filter(i->Collections.frequency(l1, i)>1).findFirst().get());
	  
	  System.out.println("************************");
	  //Categorising array elements on basis of number
	  int[] Samplearr = {5,4,11,22,77,8,9,12,46,9};
	     List<Integer> list = Arrays.asList(12,20,31,44,56,5,8);
	    System.out.println(list.stream().collect(Collectors.groupingBy(x->x/10*10, Collectors.toList())));
	     
	     
	     
	   //2nd way by calling a different function
//	  Map<Object, Long> mapes = Arrays.stream(Samplearr).boxed().
//	  collect(Collectors.groupingBy(a->Filter(a),Collectors.counting()));
//	  System.out.println(mapes);
//	  
//	}
//	  public static String Filter(int num) {
//		  
//		  
//		  if(num%10!=0 && num<=10)
//		  { return "Zerototen";}
//		  
//		  else if(num%10!=0 && num <=20 && num>=10) 
//		  {
//			  return "tentotwenty";
//		  }
//		  else
//		  { return "others";
//	  }
		 
	  
	//Q)You have been given a list of string and you need to make a list of integers only
	
	String inputs[] = {"abc" , "456" ,"123" , "xyz"};
	List<String> raw = Arrays.stream(inputs).collect(Collectors.toList());
	  System.out.println( raw.stream().filter(x->x.matches("^[1-9]\\d*$")).toList());
	   
	//Q) Find the product of the first two elements from the array using list
	// reduce(initial,operation)   ---> initial=0 for sum ,1 for product
	List<Integer> list1 = Arrays.asList(14,2,5,7,8);
	System.out.println(list1.stream().limit(2).reduce(1,(a,b)->a*b));
	
	System.out.println("***************");
	
	StringBuffer b = new StringBuffer("Lokendra");
	 System.out.println(b.reverse());
	
//to find a anagram
    List<String> listanagram = Arrays.asList("team","meat","rajput","ajrput");
   System.out.println(listanagram.stream().collect(Collectors.groupingBy(a->Arrays.stream(a.toString().split("")).sorted().toList())));
    
    //given a list of names and we need to find words whose second character will be 0;
      List<String> names =  Arrays.asList("lokendra" ,"Varsha", "Singh", "Shekhawat");
      System.out.println(names.stream().filter(a->a.length()>=2 && a.charAt(1)=='a').toList());
   
      System.out.println("********");
  
   
   
   
   
  
	  
}
}
