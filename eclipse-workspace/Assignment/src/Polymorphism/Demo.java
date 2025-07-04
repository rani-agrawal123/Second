package Polymorphism;

public class Demo {
	
public static void main(String[] args) {
	
//	Method Overloading
	Calculator obj = new Calculator();
	obj.add(2, 4);
	obj.add(332.5,222.7);
	obj.add(3,6,2);
	
//	Method Overriding
	Dog d = new Dog();
	d.makeSound();
	
	Cat c = new Cat();
	c.makeSound();
	
	
//	Task:-2
	System.out.println("Task:-2");
	 Bike b = new Bike();
	 b.startEngine();
	 b.stopEngine();
	 
	 
	 Car ca = new Car();
	 ca.startEngine();
	 ca.stopEngine();
}
}
