package StringQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class Q5 {

	
	//Given a list of strings, create a new list that contains only the distinct strings and limit the result to the first three.
	
	public static void main(String args[])
	{
		
		
		List<String>  str = List.of("lokendra","ram","amit","pradeep","ram","amit","Shubham");
		
		var l1=str.stream().distinct().limit(3).collect(Collectors.toList());
		System.out.println(l1);
		
	}
	
	
	
	
	
	
}
