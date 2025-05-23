package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamApi2 {

	
	public static void main(String args[])
	{
		
		List<String>  names = List.of("Ram","Shiv","Lokendra","trivendra","homendra");
		List<String> l1= names.stream().filter(e->e.endsWith("a")).collect(Collectors.toList());
		System.out.println(l1);
		
		
		List<Integer>  num = List.of(1,4,16,7,9,12,44,12,5,8);
		List<Integer> n1 = num.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(n1);
		
		List<Integer> result = num.stream().filter(i->i%2==0).map(j->j*j).sorted().collect(Collectors.toList());
		System.out.println(result);
		
		List<String> List =  Arrays.asList("apple","banana","cherry");
		String result1 = List.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(result1);

//		//Defining Streams
//		List<String> List =  Arrays.asList("apple","banana","cherry");
//		Stream<String> l11 = List.stream();
//		
//		String[]  array ={"Apple", "Banana" , "grapes"};	
//		Stream<String> names1 = Arrays.stream(array);
//		
//		  Stream<Integer> integer = Stream.of(1,2,4);
		
		
	}
	
	
	
	
	
	
	
	
}
