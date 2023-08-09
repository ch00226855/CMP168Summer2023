package week4day2;

public class FactorialRecursion {

	public static void main(String[] args) {
		
		long result = factorial(20L);
//		int result = factorial(10);
		System.out.println(result);
		
	}
	
	public static long factorial(long startInt) {
		
		if (startInt == 0L || startInt == 1L) {// base case (no recursion needed)
			return 1;
		} else {
			// do something with factorial(startInt - 1)
			return startInt * factorial(startInt - 1);
		}
		
	}
	
//	public static int factorial(int startInt) {
//		
//		if (startInt == 0 || startInt == 1) {// base case (no recursion needed)
//			return 1;
//		} else {
//			// do something with factorial(startInt - 1)
//			return startInt * factorial(startInt - 1);
//		}
//		
//	}

}
