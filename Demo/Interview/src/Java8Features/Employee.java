package Java8Features;

import java.util.Date;

public class Employee {
	
	
	String name;
	String gender;
	int  age;
	Date joiningdate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getJoiningdate() {
		return joiningdate;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", age=" + age + ", joiningdate=" + joiningdate + "]";
	}
	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
	public Employee(String name, String gender, int age, Date joiningdate) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.joiningdate = joiningdate;
	}
	
	
	
	
	
}
