package ArrayQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {
	  
	public static void main(String[] args) {
		
		int [] nums = {1,2,5,6,7,8,9,4,3};
		
		int res[] = twoSum(nums,10);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> map = new HashMap<>(); // num -> index

	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];  // 9

	            if (map.containsKey(complement)) {
	                return new int[] { map.get(complement), i };
	            }

	            map.put(nums[i], i);
	        }

	        return new int[] {};
	    }
	
}
