package StringQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {

	
	public static void main(String args[])
	{
		//Filter and Collect:
		//
		//Given a list of strings, create a new list that contains only the strings starting with the letter "A".
		
		List<String>  str = List.of("lokendra" ,  "Arjun" , "Amar" ,"Anirudh" , "tejashvi");
		List<String>  str1  = new ArrayList<String>();
		for(String s : str)
		{
			
			if(s.startsWith("A"))
			 str1.add(s);
			
		}
		System.out.println(str1);
	//2nd way
		List<String> str2 = str.stream().filter(s-> s.startsWith("A")).collect(Collectors.toList()); 
		System.out.println(str2);
 	}
}
