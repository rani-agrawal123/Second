package Method;

public class MathOperations{

	int multiply(int a, int b) {
		return a*b;
	}
	int divide(int a,int b){
		 if (b == 0) {
	            throw new IllegalArgumentException("Division by zero is not allowed.");
	        }
	        return a / b;
	}
	
	static int square(int a) {
		return a*a;
	}
	static int cube(int a) {
		return a*a*a;
	}
	
	double multiply(double a, double b) {
		return a*b;
	}
}

