package Java8Features;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

import java.util.List;
import java.util.Optional;


public class Streaminterview {

	
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        // Creating Employee objects with parsed dates
        Employee emp1 = new Employee("Alice", "Female", 28, sdf.parse("15-06-2020"));
        Employee emp2 = new Employee("Bob", "Male", 30, sdf.parse("10-03-2018"));
        Employee emp3 = new Employee("Charlie", "Male", 25, sdf.parse("05-09-2022"));

        // Creating an ArrayList and adding employees
        List<Employee> employees = new ArrayList<>(Arrays.asList(emp1, emp2, emp3));
		
		
        //max age
        Optional<Employee> maxage = employees.stream().max(Comparator.comparingInt(Employee::getAge));
        System.out.println(maxage.get().age);
        
        // second highest salary                            //ab yha compareto use nhi krsakte kyuki wo Integer k sath work krta h int k sath nhi
       Employee secondhighestage =  employees.stream().sorted((a,b) ->Integer.compare(b.getAge(), a.getAge())).distinct().skip(1).findFirst().get() ;                 
	   System.out.println(secondhighestage.getAge());
	   
//	   oldest EMployee
	   
	     List<Employee> l =            employees.stream().min(Comparator.comparing(Employee::getJoiningdate)).stream().toList();
	     System.out.println(l);
	}
}
 