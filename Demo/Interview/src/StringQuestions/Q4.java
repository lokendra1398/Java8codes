package StringQuestions;

import java.util.List;
import java.util.stream.Collectors;

import Java8Features.Intersum;

//Reduce:
//
//Calculate the product of all numbers in a list.
//Distinct and Limit:
public class Q4 {

	
	public static void main(String[ ] args)
	
	{
		var l1 = List.of(4,22,15,7,9,11,12,2);
	
		//here i have used limit and distinct method to 
		int i =  l1.stream().distinct().limit(3).reduce(1,(a,b)->a*b);
		
		
		
		System.out.println(i);
		//converting result into list of integers
		
		var distinctresult = String.valueOf(i).chars().distinct().limit(3).mapToObj(Character::getNumericValue).toList();  //instead of box we could have used mapToObj(Character::getNumericValue)
		System.out.println(distinctresult );
	}

	
}
