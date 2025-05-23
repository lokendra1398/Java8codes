package ArrayQuestions;

public class MergedArray {

	
	
	public static void main(String [] args) {
		
		
		
		
		
		int [] arr1 = {1,5,7,12,24,51,61};
		
		int[]  arr2 = {13,17,18,30,44,52,56,70,99};
		
		
	     
	     
	      int mergedarr[] =   sortedarray(arr1,arr2);
		
               for(int i : mergedarr)		
               {
            	   System.out.println(i);
               }
		
		
		
		
		
		
		
	}
	//pdf questions
	

	private static int[] sortedarray(int[] arr1, int[] arr2) {
		
		int resultarr[]  = new int[arr1.length + arr2.length];
		
		int i=0,j=0,k=0;
	while(i<arr1.length && j<arr2.length)
	{
		  if(arr1[i]<arr2[j])
		  {
			  resultarr[k++] = arr1[i++];
			  
		  }
		  else
			  resultarr[k++] = arr2[j++];
		  
		
		
	}
		while(i<arr1.length)
			
		{

			  resultarr[k++] = arr1[i++];
		}
		while(j<arr2.length) {
			
			

			  resultarr[k++] = arr2[j++];
			
		}
		
		
		
		
		
		
		return resultarr;
	}

		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

