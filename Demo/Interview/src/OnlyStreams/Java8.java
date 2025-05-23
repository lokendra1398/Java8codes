package OnlyStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8 {

	
	
	public static void main(String[] args) {
		

	List<Employees> employee = EmployessDatabase.getAllEmployeess();
	
	//foreach example 
	
	//employee.stream().forEach(a-> System.out.println(a));
	   //othermethod    
	//employee.stream().forEach(System.out::println);
	
//filter and collect ---- Q) no of employees having salary greater than 800000 and department should be development
	
	  List<Employees> l1 =  employee.stream().filter(a->a.getDept().equals("Development") &&  a.getSalary()>80000 ).collect(Collectors.toList());
	    //instead of collecting in list we can also collect in map like collection.tomap(employyee::getid ,employee::getdepartment)  
	  l1.stream().forEach(a->System.out.println(a));
	  
	  System.out.println("******&&");
	  //map---Q) we want department names in employee 
//we r using constructor reference intead of lambda func.Both r same way:->e->e.getDept(
	      List<String> l2department = employee.stream()       //stream<employee> 
	    		                    .map(Employees::getDept). //stream<string>
	    		                    distinct().toList();
	      System.out.println(l2department);
	      

		  System.out.println("******&&");
	 //We can use map to get the single attribute but we cannot use to get nested attributes.for that 
	     // we'll use   --FLATMAP--- 
	
	      
	    List<String> s =   employee.stream().
	    		          flatMap(e->e.getProjects().stream())//converting list into stream
	    		          .map(a->a.getName()).distinct().toList();
	System.out.println(s);
	
	//one more example of flatmap
	int[][] arr = {
		    {1, 2, 3},
		    {3, 6, 7},
		    {9, 11, 17}
		};

		List<Integer> flatList = Arrays.stream(arr)
		    .flatMapToInt(Arrays::stream) // flatten 2D to 1D IntStream
		    .boxed()                      // convert int to Integer
		    .collect(Collectors.toList());

		System.out.println(flatList); // Output: [1, 2, 3, 3, 6, 7, 9, 11, 17]
	
	
	
	//sorting
	                                                                //here we can write Employee::getSalary  
	  List<Employees> SalariedEmployee =  employee.stream().sorted(Comparator.comparing(e->e.getSalary(),Comparator.reverseOrder())).toList();
	  System.out.println(SalariedEmployee);
	  
	  
	  
	  //Min&Max
	  
	   Optional<Employees> max =   employee.stream().max(Comparator.comparingDouble(Employees::getSalary));
//	  
	   
	   
//	   System.out.println(max);
//	   System.out.println(max.get().getName());//we can use get method to get full name also
	   
	   //Grouping by
	   //when we want to group using gender and give the count
	  Map<String, Long> mp =  employee.stream().collect(Collectors.groupingBy(Employees::getGender,Collectors.counting()));
	  System.out.println(mp);
	  //when we want to group using gender and we want only employee names
	  System.out.println("^^^^^^^^^^^^");
	 Map<String , List<String>> str = employee.stream().collect(Collectors.groupingBy(Employees::getGender,Collectors.mapping(Employees::getName,Collectors.toList())));
	  System.out.println(str);
	  
	  System.out.println("*************");
	  
	  //Findfirst
	  
	  Optional<Employees> findfirst  = employee.stream().filter(e->e.getDept().equals("Development")).findFirst();
	  
	   findfirst.ifPresent(a->System.out.println(a.getName()));
	 
	   //we can also throw exception if we are searching for any different keyword
		  Employees first  = employee.stream().filter(e->e.getDept().equals("Development")).findAny().orElseThrow(()
				                       ->new IllegalArgumentException("Employee not found"));
		  System.out.println(first);
		  
		  //anymatch, allmatch(),nonematch -these methods will take predicate as argument
		  
		  Boolean anymatch = employee.stream().anyMatch(e->e.getDept().equals("Development"));
		  System.out.println(anymatch);
		  
		  Boolean nonematch = employee.stream().noneMatch(e->e.getDept().equals("Sports"));
		  System.out.println(nonematch);
		  
		  System.out.println("**************************8");
		  // Limit 
		  
		List<Employees> topthreesalary=  employee.stream().sorted(Comparator.comparing(Employees::getSalary).reversed()).limit(3).collect(Collectors.toList());
		  System.out.println(topthreesalary);
		  
		  
		  //skip(it will take long value)
		  
		 System.out.println(employee.stream().skip(5).collect((Collectors.toList())));
		 System.out.println("**************************8");
		 //Finding duplicate values in array
		 
		 int[]  arr1 = {23,12,55,2,71,50,91,88,14,1,2,12,}; //here Collectors.grouping by worked only with integer objects not int
		Map<Integer,Long> mp1 =  Arrays.stream(arr1).boxed().collect((Collectors.groupingBy(Function.identity(),Collectors.counting())));
		  
		  
	   for(Integer key:mp1.keySet())
	   {
		   if(mp1.get(key)>1)
		   {
			   System.out.println(key + " " + mp1.get(key) );
		   }
	   }
	
	  //Converting arr into even and odd
	   System.out.println(  Arrays.stream(arr1).boxed().collect(Collectors.groupingBy( x -> x%2==0,Collectors.counting())
			   ));//
	   
	   System.out.println("**********");
	   //frequency
	   //Finding first repeating character
	   String demo = "Success";
	  List<String> r1= Arrays.asList(demo.split(""));
      	   String resultt = r1.stream().filter(a->Collections.frequency(r1,a)>1).findFirst().get();
	   
	   System.out.println(resultt);
	   
	   //finding prime number using int stream
	   
	   int [] arr2 = {12,2,3,4,66,17,81,22,90};
   System.out.println( Arrays.stream(arr1).filter(a->a>1).filter( a-> IntStream.range(2,a/2+1).allMatch(b->(a%b!=0))).boxed().collect(Collectors.toList()));
	   
//   Even number
//   Arrays.stream(arr1).filter(a->a%2==0).boxed().collect(Collectors.toList());
   
   
     //write a method to get Average salary  ']
//   OptionalDouble avg = employees.stream()
//		    .map(e -> e.getSalary())        // Stream<Double>
//		    .mapToDouble(Double::doubleValue)  // convert to DoubleStream
//		    .average();
   
   
   
   
}}
