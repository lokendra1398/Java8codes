package ArrayQuestions;

public class Shiftzerosandones {
	
	
	public static void main(String[] args) {
		
		int []sa = {12,3,0,4,6,0,9,33,0,18,44} ;

		shifting(sa);
		
	for(int i :sa) {
			
			
			System.out.println(i);
		}
		int aarr[] = {0,0,1,1,1,1,0,1,1,0,1,0,0,0,1,1,1,1,1,0,0,0,0,1,1};
		
		sorting(aarr);
		
//		for(int i : aarr) {
//			
//			
//			System.out.println(i);
//		}
		}

	private static void shifting(int[] sa) {
		// TODO Auto-generated method stub
		int temp =0;
		for(int i=0;i<=sa.length-1;i++) {
			
			
			if(sa[i]==0)
			{
				  int t = sa[temp];
		            sa[temp] = sa[i];
		            sa[i] = t;
		            temp++;
			}
		}
		
	}

	private static void sorting(int[] aarr) {
		// TODO Auto-generated method stub
		
	int countz=0,countone =0;
		for(int j=0;j<=aarr.length-1;j++)
		{
			
			
			if(aarr[j]==0) 
				countz++;
		}
		for(int i =0 ;i<countz;i++)
		{
			aarr[i]=0;
		}
		for( int i = countz;i<=aarr.length-1;i++) {
			aarr[i]=1;
		}
	}

}
