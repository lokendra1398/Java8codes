package StringQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Repeatingcharacter {

	
	public static void main(String[] args) {
		
	
	String s1 = "lokendrasingh";
//	List<String> l =   List.of(s1.split(""));
//    String s =  l.stream().filter(a->Collections.frequency(l,a)>1).findFirst().get();
//    System.out.println(s);
    
    
    
    HashMap<Character, Integer> mp = new HashMap<>();
    for(char c : s1.toCharArray()) {
    	
    	if(!mp.containsKey(c))
    	{
    		mp.put(c, 1);
    	}
    	else
    		mp.put(c, mp.get(c)+1);
    }
	
    for(char c : mp.keySet())
    {
    	if(mp.get(c)>1)
    		System.out.println(c);
    }
	
	
	
	}
}
