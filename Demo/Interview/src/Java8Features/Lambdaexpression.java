package Java8Features;

public class Lambdaexpression {

	public static void main(String args[])
	{
		
//	
//		 Intersum s1 = (a, b) ->  a + b; //it act as datatype for function
//	
//		System.out.println(s1.sum(5,7));
		
		Intersum s1 = ()->"Lokendra";
		System.out.println(s1.getname());

		
		Comparision c1 =  (a, b)-> a > b ?  true  : false;
		// (a, b) -> a > b ? true : false;
		System.out.println(c1.compare(6, 9));
		
		
	}
	
	
	
}
