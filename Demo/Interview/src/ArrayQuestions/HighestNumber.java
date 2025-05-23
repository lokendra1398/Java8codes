package ArrayQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestNumber {
 public static void main(String[] args) {
	

	
	 //make a largest number from array;
    
	   List<Integer> array  = new ArrayList<>(List.of(5,6,3,4,7,1,2,8,123,541));

	   List<Integer> digits = new ArrayList<>() ;

	   for (int num : array) {
	       for (char ch : String.valueOf(num).toCharArray()) //     String.valueOf(num) – converts the number to a string (e.g., 123 → "123").
	       {                                                  //    	   .toCharArray() – gives you each character of that string (e.g., '1', '2', '3').
	           digits.add(Character.getNumericValue(ch));     //character.getnumericValue will convert char values into integer
	       }
	   }
	   
	   Collections.sort(digits); //we have to create a list otherwise it will throw a unsupported java lang exception
	System.out.println(digits);
	   
	   StringBuffer bf = new StringBuffer(" ");
	   
	   
	   for(int i=digits.size()-1;i>=0;i--)
	   {

		   
		   bf.append(digits.get(i));
		   
		   
	   }
	   
	   System.out.println(bf);
	   
	   
} 
}
