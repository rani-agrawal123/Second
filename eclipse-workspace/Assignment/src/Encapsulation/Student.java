package Encapsulation;

public class Student {

	private String name;
	private int age;
	private String grade;
	
	public void setName(String name) {
		if(name != null) {			
			this.name = name;
		}
		else {
			System.out.println("Don't print null value");
		}
	}
	public String getName() {
		return name;
	}
	
	
	public void setAge(int age) {
		if(age >= 0) {
			this.age = age;
		}
		else {
			System.out.println("put valid age");
		}
	}	
	public int getAge() {
		return age;
	
	}
	
		
	public void setGrade(String grade) {
		if(grade != null) {
			this.grade = grade;
		}
		else {
			System.out.println("Not valid data");
		}		
	}
	public String getGrade() {
		return grade;
	}
} 
