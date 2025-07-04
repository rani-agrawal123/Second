package Polymorphism;

public abstract class Vehicle {

	abstract void startEngine();
	
	void stopEngine() {
		System.out.println("Engine stopped");
	}
}
