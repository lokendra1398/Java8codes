package ArrayQuestions;

public class Reverse {

	     public static void main(String[] args) {
			
	    	 
	    	 
	    	 int[] arr = {12,55,9,5,51,23,89,56,70};
	    	 
	    	 
	    	 
	    	 Reverse(arr);
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
		}

		private static void Reverse(int[] arr) {
			// TODO Auto-generated method stub
//			int[] revarr = new int[arr.length];
//			for(int i=arr.length-1,j=0;i>=0;i--,j++)
//			{
//				
//			     revarr[j] = arr[i];
//				
//				
////			}
//			for (int i =0;i<=revarr.length-1;i++)
//			System.out.println(revarr[i]);
			int temp =0 ;
			//2nd way
			for (int i=0;i<arr.length/2;i++)
			{
				temp = arr[i];
				arr[i] = arr[arr.length-1-i];
				arr[arr.length -1 -i ]=temp;
				
			}

		for (int i =0;i<=arr.length-1;i++){
	System.out.println(arr[i]);}
		}
	
	
}
