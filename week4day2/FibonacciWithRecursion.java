package week4day2;

public class FibonacciWithRecursion {

	public static void main(String[] args) {
		
		int result = fib(40);
		System.out.println(result);
		
	}
	
	public static int fib(int n) {
		if (n == 0) {// base case 1
			return 0;
		} else if (n == 1) {// base case 2
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}

}
