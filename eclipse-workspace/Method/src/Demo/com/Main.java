package Demo.com;

public class Main {

	
	void fun1(A str) {
		System.out.println("the vaue of a1 is : "+str);
		str.funA();
	}
	public static void main(String[] args) {
		
		Main m1 = new Main();
		m1.fun1(new A());
	}
}
