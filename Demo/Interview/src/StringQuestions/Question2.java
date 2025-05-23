package StringQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class Question2 {


	//Map and Collect:
	//
	//Given a list of integers, create a new list of squares of each integer.
	public static void main(String args[])
{
		  //using var
		 var l1 = List.of(1,5,8,12,3,4,8,17);
                 
		 List<Integer> l2 =  squarenumber(l1);
  if(l2.isEmpty())
System.out.println("No list is returned");
  
  else
	  System.out.println(l2);
  
}

	private static List<Integer> squarenumber(List<Integer> l1) {
		
		
		var list = l1.stream().map(i->i*i).collect(Collectors.toList());
		
		return list;
	}
}
