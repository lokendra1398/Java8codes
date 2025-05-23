package ArrayQuestions;

public class SecLargest {

	public static void main(String[]  args) {
		
		
		int arr[] = {12,7,8,66,29,102,17,41,5};
		int sol = Findsecondmax(arr);
		System.out.println(sol);
		
		
		
		
		
	}

	private static int Findsecondmax( int a[]) {
		// TODO Auto-generated method stub
		
		int l=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;;
		for(int i=0;i<a.length;i++)
		{
			if(l<a[i])
			{
				 
				sl =l;
				l=a[i];
				}
				
				else if(sl<a[i]&&a[i]!=l){
					sl=a[i];
				}
					
				
				
			}
			
			
			
			
		
		
		
		return sl;
	}
	
	
	
	
	
	
	
	
	
	
	
}
