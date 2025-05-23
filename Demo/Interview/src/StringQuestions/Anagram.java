package StringQuestions;

import java.util.HashMap;

public class Anagram {

	
	public static void main(String[] args) {
		
		String sample ="lokendra";
		String sample2 = "kendralo";
		
	Boolean s =	AnagramchecK(sample,sample2);
		
		System.out.println(s);
		
			}

	private static boolean AnagramchecK(String sample, String sample2) {
		// TODO Auto-generated method stub
		  if (sample.length() != sample2.length()) {
	            return false;
	        }
		
	HashMap<Character ,Integer> mp = new HashMap<>();	
	
	for(char c :sample.toCharArray()) {
		
		
		if(!mp.containsKey(c)) {
			
			mp.put(c, 1);}
			
	   else
		    mp.put(c, mp.get(c)+1 );}
				
		for(char c1 :sample2.toCharArray())	
		{
			if(!mp.containsKey(c1) || mp.get(c1)==0) {
				
				return false;}
				
		   else
			    mp.put(c1, mp.get(c1)-1 );
		
		}

		boolean value = true;
		for(char k: mp.keySet())
		{
			if(mp.get(k)>0) {
				
				 value = false;
			}
			
			
			
		}
		return value;
		
		
		
	}
		
		
		

	}
	
	
	
	
	
