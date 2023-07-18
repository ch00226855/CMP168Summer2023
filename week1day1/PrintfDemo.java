package week1day1;

public class PrintfDemo {

	public static void main(String[] args) {
		
		double x = 1.0 / 3.0;
		System.out.println("x: " + x);
		
		// What if I only want to show 2 decimal digits?
		System.out.printf("x: %.2f\n", x);
		System.out.printf("x: %.5f\n", x);
		System.out.printf("x: %20.5f\n", x);

	}

}
