package week4day2;

public class FactorialWithLoop {

	public static void main(String[] args) {
		
		long result = factorial(20L); // An integer type can only support values up to 2 billion.
		System.out.println(result);

	}
	
//	public static int factorial(int startInt) {
//		int product = 1;
//		
//		for (int i = 1; i <= startInt; i++) {
//			product *= i; // product = product * i
//		}
//		
//		return product;
//	}
	
	public static long factorial(long startInt) {
		long product = 1;
		
		for (int i = 1; i <= startInt; i++) {
			product *= i; // product = product * i
		}
		
		return product;
	}

}
