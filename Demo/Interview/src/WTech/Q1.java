package WTech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
	
	
	public static void main(String[] args) {
//	--Creating nested list
		
		List<Object> nestedList = Arrays.asList(
				
				7,
				Arrays.asList(1,3,5),
				Arrays.asList(2,7,9),
				2);
		
		List<Integer> result = Flatten(nestedList);
		System.out.println(result);
				
				
		
	  //2nd way through stream
		int [][] arr = {{1,2,13},{4,11,6},{8,1,55}};
		  int [] resultarr = Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();//Arrays::stream does not work with Integer[][] because 
		  //it expects intstream not a stream<integer>
		  
		  List<Integer> l1 = Arrays.stream(arr).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());
		  
		  System.out.println(Arrays.toString(resultarr));
		
		
				
				
				
	}

	public static List<Integer> Flatten(Object obj) {
		// TODO Auto-generated method stub
		
		
		List<Integer>  result  = new ArrayList<>();
		
		
		if(obj instanceof Integer) {
			
			result.add((Integer)obj);
			
		}
			
			else if (obj instanceof  List<?>)	
			
			for(Object element : (List<?>)obj) {
				
				result.addAll(Flatten(element));
				
				
			}
		
		
		
		
		
		
		
		
		
		
		return result;
		
		
		
	}}