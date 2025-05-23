package StringQuestions;

public class StringPailndrome {
	
	public static void main (String[] args)
	{
		
		
		String s1 = "Hello world";
		String rev = "";
		String[]  arr = s1.split(" ");
		
		for(String s : arr)
			
		{
			for (int i= s.length()-1 ;i>=0;  i--)
			{
				if(i==0)
				
					
				{
					rev += Character.toUpperCase(s.charAt(i));
					
					
				}
				else
					rev +=s.charAt(i);
			}
			
			rev+=" ";
			
			
		}
				
	 	System.out.println(rev);
	 	
	 	//palindrom
	 	
	 	String S ="theeht";
	 	
	 	String reversed = "";
	
	 	
	 	
	 	for(int i=S.length()-1;i>=0;i--) {
	 		
	 		reversed+=S.charAt(i);
	 	}
	 	
	 	if(reversed.equals(S))
	 	{
	 		System.out.println("String is a palindrom");
	 	}
		
		
	}
	
	
	
	
	
	

}
