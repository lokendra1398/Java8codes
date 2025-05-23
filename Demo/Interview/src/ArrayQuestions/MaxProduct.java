package ArrayQuestions;

public class MaxProduct {

	public static void main(String[]  args) {
		
		
		int arr[] = {12,-7,8,66,-29,100,200,300,17,41,-5};
		int sol = Findsecondmax(arr);
		System.out.println(sol);
		
		
		
		
		
	}

	private static int Findsecondmax( int a[]) {
		// TODO Auto-generated method stub
		
		int l=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		int tl=Integer.MIN_VALUE;
		int minA = Integer.MAX_VALUE;
		int minB = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(l<a[i])
			{
				tl=sl;
				sl =l;
				l=a[i];
				}
				
				else if(sl<a[i]&&a[i]!=l){
					tl=sl;
					sl=a[i];
				}
				else if(tl<a[i]&&a[i]!=sl)
				{
					tl=a[i];
				}
				
				
			
			if(minA>a[i])
			{
				minB=minA;
				minA=a[i];
				
			}
			else if (minB>a[i] && minB!=a[i])
			{
				minB=a[i];
			}
			
			
			}
			
			
			
			
		
		
		
		return  Math.max(minA* minB*l,l*sl*tl);
	}
	
	
	
	
	
	
	
	
	
	
	
}
