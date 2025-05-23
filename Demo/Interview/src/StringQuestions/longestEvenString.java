package StringQuestions;

public class longestEvenString {

	
	  public static void main(String[] args) {
		
		  
		  
		  
		  String s1= "Lokendra is singh shekhawat";
				  
				String[] words= s1.split(" ");
				
				String longestword ="";
				
				
				for(String word : words)
				{
					if((word.length())%2==0 && word.length()>longestword.length()) {
						
						
						
						longestword = word;
						
					}
				}	
					System.out.println(longestword);
				
	  } 
}
