package Java8Features;

import java.util.Arrays;
import java.util.List;

public class Streams {
	
	
	
	public static void main(String args[]) {
		
		
		List<Integer> marks = Arrays.asList(34,14,26,55,12,20,55,30,60,70,80);
		 List<Integer>  l1 =   marks.stream().filter(a -> a<30).map(y -> y+5) // added 5 marks to students whose marks < 30 and count the no
		 .toList();
		 System.out.println(l1);
		 
		 //for counting
		 
		 long res =   marks.stream().filter(a -> a<30).map(y -> y+5) // added 5 marks to students whose marks < 30 and count the no
				 .count();
		 
		 System.out.println(res);
		 
		
		
		
		
		
		
	}

}
