package OnlyStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InterviewStreams {

	
	public static void main(String[] args) {
		
		//word having highest length
		String s =" I am lokendra singh shekhawat";
		
	String s1=    Arrays.asList(s.split(" ")).stream().max(Comparator.comparingInt(a->a.length())).get();
		
	//2nd Highest
	
		//removing duplicates from string and return in same order
	System.out.println(s1);
	
	String Demo ="abcdaghdbk";
	//two methods
	//System.out.println(Arrays.asList(Demo.split("")).stream().distinct().collect(Collectors.joining()));
		
	System.out.println(
			
		String.join("", Arrays.asList(Demo.split("")).stream().distinct().toList()));
	
	
	//Array to stream or list when array is of primitive type
	int [] arr = {3,5,8,12,9,8};
	
	List<Integer> a = Arrays.stream(arr).boxed().toList();
	 System.out.println(a.toString());
	 
	 //Array to list when array is of Wrapper(Integer) type
	 Integer[] arr1 = {3,5,8,12,9,8};//agar yha address lete to
	System.out.println(Arrays.asList(arr1));
	
	System.out.println("**********************");
	
	//String to list
	
	String name ="Lokendra";
	 System.out.println(List.of(name));
	 
	 System.out.println("**********************");
	//flatMap Example
	 int[][] arrraay = {
			    {1, 2, 3},
			    {3, 6, 7},
			    {9, 11, 17}
			};

			List<Integer> flatList = Arrays.stream(arrraay)
			    .flatMapToInt(Arrays::stream) // flatten 2D to 1D IntStream
			    .boxed()                      // convert int to Integer
			    .collect(Collectors.toList());

			System.out.println(flatList);
			
			System.out.println("**********************");
	 
		
		
			
		
		
		
		
		
		
		
		
		
	}
}
