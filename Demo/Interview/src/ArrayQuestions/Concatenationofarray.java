package ArrayQuestions;

import java.util.Arrays;

public class Concatenationofarray {

	public static void main(String[] args) {
		
		int [] nums = {1,2,1};
		int[] ans = getConcatenation(nums);
		
		for (int k: ans) {
			System.out.println(k);
		}
	}
	    public static int[] getConcatenation(int[] nums) {
	        
	    int[] ans = new int[(nums.length*2)];
	   int i=0;
	   int j=0;
	    for ( i=0;i<=nums.length-1; i++)
	   { 
	      ans[j++] = nums[i];



	  }
	    for (j=nums.length,i=0;j<=ans.length-1;j++)
		   { 
		      ans[j] = nums[i++];



		  }
	 
   return ans;
	}
}
