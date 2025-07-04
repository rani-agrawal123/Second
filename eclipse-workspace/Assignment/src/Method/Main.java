package Method;

public class Main {

	public static void main(String[] args) {
		
		MathOperations result = new MathOperations();
		
		System.out.println("Multiply : "+result.multiply(4, 5));
//		System.out.println("Divide : "+result.divide(14, 0));
		System.out.println("Divide : "+result.divide(14, 2));
		System.out.println("Multiply double : "+result.multiply(2, 3));
//		when we Overloading the value
		
		
		
//		with static method
		System.out.println("Square : "+ MathOperations.square(5));
		System.out.println("Cube : "+ MathOperations.cube(5));
		
		
		
//		Constructor
		Person p1 = new Person();
		Person p2 = new Person("Rani",21);
		Person p3 = new Person("raj");
		
	}
}
