package Java8Features;

import java.util.function.Predicate;

public class PredicateDemo {
	
	
	public static void main(String args[])
	{
		
		Predicate<Integer> p  = x-> x>100;
		System.out.println( p.test(2));
		
		Predicate<String> namestartwithv = a -> a.toLowerCase().charAt(0)=='v' ;

		Predicate<String> nameendwithl = a -> a.toLowerCase().charAt(a.length()-1)=='l' ;
		Predicate<String> result = namestartwithv.and(nameendwithl);
		   System.out.println(result.test("Vikral"));
		   
		   
		   student s1= new student("BBS",23);
		   student s2= new student("Sophia",2);
		   
		   Predicate<student> sc = x -> x.getId() >5;
		   
		   Predicate<Object> p1 = Predicate.isEqual("Vipul");
		  boolean t1 = p1.test("Vipul");
		   
		   
		   System.out.println(sc.test(s2));
		   
		   System.out.println(t1);
		   
	}
		   
		   
		   private static class student{
			   
			   String name;
			   int id;
			   
			   public student(String name, int id) {
			        this.name = name; // Assign values properly
			        this.id = id;

			        
			        
			
			}

//			public String getName() {
//				return name;
//			}
//
//			public void setName(String name) {
//				this.name = name;
//			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}
			
			   
		   }
		
		
		
		
	
}
