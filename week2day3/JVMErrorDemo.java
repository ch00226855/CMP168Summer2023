package week2day3;

import java.util.Scanner;

public class JVMErrorDemo {

	public static void main(String[] args) {
		
		// Out of memory error
//		int veryLargeNum = 1000_000;
//		Scanner[] ary = new Scanner[veryLargeNum];
//		for (int i = 0; i < ary.length; i++) {
//			ary[i] = new Scanner(System.in);
//		}
		
		// Stack Overflow error
//		simpleMethod();
//
//		System.out.println("Done.");
	}
	
	public static void simpleMethod() {
		System.out.println("The simple method is being called.");
		simpleMethod();
	}

}
