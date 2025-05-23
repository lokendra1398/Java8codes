package ArrayQuestions;

public class Removeduplicate {
	
	public static void main(String[] args) {
		
	int[] arr = {0,1,1,2,2,3,3,4,4};
	int length = removeDuplicates(arr);
	for (int k=0;k<length;k++)
	{
		System.out.println(arr[k]);
		
	}
		
		
	
	
	
	
	
	
	}
	 public static int removeDuplicates(int[] nums) {


	        int i = 0;
	        for (int j = 1; j <= nums.length - 1; j++) {

	            if (nums[i] != nums[j]) {
	                i++;
	                nums[i] = nums[j];
	            }

	        }
	        return i + 1;

	    }

	}
