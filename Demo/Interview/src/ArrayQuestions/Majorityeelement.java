package ArrayQuestions;

public class Majorityeelement {
	
	
	
public static void main(String[] args) {
	
	
	
	int arr[] = {1,2,3,4,5,6,2,2,6};
	
	
   Integer cand = 	majorityElement(arr);
   System.out.println(cand);
}

private static Integer majorityElement(int[] arr) {
	// TODO Auto-generated method stub
	int count = 0 ;
	Integer candidate = 0;
	for(int i =0 ; i<=arr.length-1;i++) {
		
		if(count==0)
		{
			candidate = arr[i];
		}
		
		if (arr[i] == candidate) {
		    count = count + 1;
		} else {
		    count = count - 1;
		}
		
		
	}  
	return candidate;
}

}
