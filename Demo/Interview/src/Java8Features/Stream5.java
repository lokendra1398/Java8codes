package Java8Features;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream5 {
	
	
	public static void main(String[] args) {
		
		
		
	int arr[]  = {10,20,30,33,41,56,71,12};
	Arrays.stream(arr).forEach(i -> System.out.println(i));
	Stream<?>  item = Stream.of( 9, 8, 12, 32, 55, 77 ,88, "a" , "baa" , "nam");
	item.map(i -> i + " :s").forEach(System.out::println);
	
	//
	
	
		
		
		
		
	}

}
