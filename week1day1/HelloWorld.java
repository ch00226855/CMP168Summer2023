package week1day1;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		// Division by zero
//		System.out.println(5 / 0);
		
		// Scientific notation
		double x = 7.2e-4;
		System.out.printf("x: %f\n", x);
		
		// Sometimes we encounter scientific notations unexpectedly.

		System.out.println(1 - 1.0 / 5777 * 5777);
		// Why don't we get a 0.0?
		// The acutal result, 1.11e-16 is actually very close to 0.
		// It is not precisely 0 because computer doesn't work 
		// with infinite precision.

		// Implicit type conversion
		System.out.println(1.0 / 3); // -> 1.0 / 3.0 -> 0.33333
		// Type casting
		double y = 1.0 / 3.0;
		System.out.println("Before casting: " + y);
		System.out.println("After casting to int: " + (int)y);
	}

}
