package ArrayQuestions;

public class MaxCount {

	public static void main(String[]  args) {
		
		
		int arr[] = {0,0,1,1,1,1,0,1,1,0,1,0,0,0,1,1,1,1,1,0,0,0,0,1,1};
		int sol = MaxCount(arr);
		System.out.println(sol);
		
		
		
		
		
	}

	
	
	private static int MaxCount(int a[]) {
		// TODO Auto-generated method stub
		
		int Countmaxones= Integer.MIN_VALUE;
		int count=0;
		int counts=0;
		int Countmaxzeros =0;

		int sl=Integer.MIN_VALUE;;
		for(int i=0;i<a.length;i++)
		{
			 
			if(a[i]==1)
			{
				 count++;
			    Countmaxones = Math.max(Countmaxones, count)	;
			    counts=0;
			
			}
			
			else {
	
				count=0;
				counts++;
				Countmaxzeros = Math.max(Countmaxzeros, counts);
	           
	            
			}
			
				
				
			
			
			
		}
		
		System.out.println(Countmaxones);
		System.out.println(Countmaxzeros);
		
		
		
		return Countmaxzeros;// returning consecutive 0's
	
	
	
	
		
	
	
	
	
	
	}
}
