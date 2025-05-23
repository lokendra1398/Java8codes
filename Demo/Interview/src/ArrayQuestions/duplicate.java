package ArrayQuestions;

import java.util.*;

public class duplicate {

	
	
public static void main(String[] args) {
	
	
	
	Scanner sc = new Scanner(System.in);
	
     int arr[] = new int[10];
   
     for(int i=0;i<arr.length-1;i++)
     {
    	 
    	 arr[i] = sc.nextInt();
    	 
    	 
    	 
     }
     
     duplicatelement(arr);
	
	
	
	
	
	
	
	
	
	
	
	
}

private static void duplicatelement(int[] arr) {
	// TODO Auto-generated method stub
	int temp = 0;
//  HashMap<Integer,Integer> mp = new HashMap<>();
//  
//  for (int i : arr)
//  {
//	  if(!mp.containsKey(i)) 
//		 
//		 mp.put(i, 1);
//		 
//	  else
//			 mp.put(i,mp.get(i)+1 );
//	 
//		 
//	  }
//  for(int j :mp.keySet()) {
//	  
//	  if(mp.get(j)>1)
//		  System.out.println(j);
//  }

  
  for (int i = 0; i < arr.length; i++) {
	    for (int j = i + 1; j < arr.length; j++) {
	        if (arr[i] == arr[j]) {
	          System.out.println("duplicate are :" + arr[j]); 	        }
	    }
	}
  
}
}
