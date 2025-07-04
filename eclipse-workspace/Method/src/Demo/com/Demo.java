package Demo.com;

public class Demo {

	void fun1(int i) {
		System.out.println("inside fun1 method "+ i);
	}
	public static void main(String[] arg) {
		
		Demo d1 = new Demo();
		d1.fun1(20);
		
		byte x = 20;
		d1.fun1(x);
	}
}


