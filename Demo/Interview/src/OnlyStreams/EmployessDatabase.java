package OnlyStreams;

import java.util.Arrays;
import java.util.List;

public class EmployessDatabase {
	



	    public static List<Employees> getAllEmployeess() {
	        Project p1 = new Project("P001", "Alpha", "ABC Corp", "Alice");
	        Project p2 = new Project("P002", "Beta", "XYZ Ltd", "Bob");
	        Project p3 = new Project("P003", "Gamma", "ABC Corp", "Alice");
	        Project p4 = new Project("P004", "Delta", "TechWorld", "Charlie");
	        Project p5 = new Project("P005", "Epsilon", "MoneyMatters", "Daniel");
	        Project p6 = new Project("P006", "Zeta", "SmartTech", "Eva");
	        Project p7 = new Project("P007", "Eta", "BrandBoost", "George");
	        Project p8 = new Project("P008", "Theta", "InnoSoft", "Hannah");
	        Project p9 = new Project("P009", "Iota", "FastTrack", "Ian");
	        Project p10 = new Project("P010", "Kappa", "DigitalWave", "Jessica");

	        // Employees instances
	        Employees e1 = new Employees(1, "John Doe", "Development", Arrays.asList(p1, p2), 80000, "Male");
	        Employees e2 = new Employees(2, "Jane Smith", "Development", Arrays.asList(p3), 80000, "Female");
	        Employees e3 = new Employees(3, "Robert Brown", "Sales", Arrays.asList(p4), 60000, "Male");
	        Employees e4 = new Employees(4, "Lisa White", "HR", Arrays.asList(p1), 55000, "Female");
	        Employees e5 = new Employees(5, "Michael Green", "Finance", Arrays.asList(p5), 90000, "Male");
	        Employees e6 = new Employees(6, "Sophia Brown", "Development", Arrays.asList(p6), 85000, "Female");
	        Employees e7 = new Employees(7, "James Wilson", "Marketing", Arrays.asList(p7), 72000, "Male");
	        Employees e8 = new Employees(8, "Olivia Harris", "Development", Arrays.asList(p8), 88000, "Female");
	        Employees e9 = new Employees(9, "William Lee", "Sales", Arrays.asList(p9), 78000, "Male");
	        Employees e10 = new Employees(10, "Emily Clark", "Development", Arrays.asList(p10), 95000, "Female");

	        // Print Employees details (just for testing)
	        return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
	    }
	}


