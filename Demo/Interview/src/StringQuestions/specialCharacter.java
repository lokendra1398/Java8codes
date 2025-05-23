package StringQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class specialCharacter {
	
	public static void main(String[] args) {
		
	
		
		
		  int[] arr = {8,5,1,3,17,9,6,12,13};
		  
		  List<Integer> odd = new ArrayList<>();

		  List<Integer> even = new ArrayList<>();
		  
		  
		  for(int i = 0; i <=arr.length -1;i++) {
			  
			  if (arr[i]%2!=0)
			  {
				  odd.add(arr[i])
;
				  
			  }
			  else 
				  even.add(arr[i]);
			  
			  
		  }
		  
		  
		  Collections.sort(odd);
		  Collections.sort(even);
		  
		  int j =0;
		  int k =0;
		  
		  for(int i=0;i<=arr.length -1 ;i++ )
		  {
			  
			  
			  if (arr[i]%2!=0)
			  {
				  arr[i] = odd.get(j++);
				  
			  }
			  else 

				  arr[i] = even.get(k++);
			  
		  }
			  
		  
		  System.out.println(Arrays.toString(arr));
			  
		  

          maxsubstring(arr);
	
		  }
	
	public static void maxsubstring(int[] a) {
	    if (a.length == 0) return;
	    int maxLen = 1, currLen = 1;
	    int maxStart = 0, currStart = 0;

	    for (int i = 1; i < a.length; i++) {
	        if (a[i] >= a[i - 1]) {
	            currLen++;
	            if (currLen > maxLen) {
	                maxLen = currLen;
	                maxStart = currStart;
	            }
	        } else {
	            currLen = 1;
	            currStart = i;
	        }
	    }

	    // print result
	    System.out.println("Length = " + maxLen);
	    System.out.print("Subarray = ");
	    for (int i = maxStart; i < maxStart + maxLen; i++) {
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
	}

}


		
		
//		
	


//String str = "My name is Ravi Teja @";
//char special =  FindspecialChar(str);
//if(special != '\0')
//  System.out.println("Special character is :" + special);
//else {
//    System.out.println("No special characters found in the string.");
//}
//
//}
//
//private static char FindspecialChar(String str) {
//// TODO Auto-generated method stub
//Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s]");
//Matcher matcher = pattern.matcher(str);
//
//if (matcher.find()) {
//    // Return the first special character found
//    return str.charAt(matcher.start());
//} else {
//    // Return '\0' (null character) if no special character is found
//    return '\0';
//}