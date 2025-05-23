package Java8Features;

import java.util.stream.Collectors;

public class java11features{

	public static void main(String[] args ) {
		
    //lines() method		
	String str = "my\n name \nis \nlokendra \nsingh"; 	
	System.out.println(str.lines().collect(Collectors.toList()));
	
	
	
	//strip() feature
	str = "   uabcd  ";
	System.out.println(str.stripTrailing());//sirf backward space gaya strip se pura jayega stripleading se sirf phleka jayega
	}
}
