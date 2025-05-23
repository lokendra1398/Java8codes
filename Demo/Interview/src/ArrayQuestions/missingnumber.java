package ArrayQuestions;

public class missingnumber {

	
	
	public static void main(String[] args) {
		
	
int [] arr = {1,2,3,4,5,6,7,9};


misnumber(arr);


	
	
	
	
	
	
	
	
	
	}

	private static void misnumber(int[] arr) {
		
		int n = arr.length +1 ;
		int total = (n*(n+1))/2;
		int sum = 0;
		
		for(int j=0;j<=arr.length-1;j++)
		{
			
			 sum += arr[j];
			
			
			
		}
		int result = total - sum;
		System.out.println(result);
		// TODO Auto-generated method stub
		
	}
}
