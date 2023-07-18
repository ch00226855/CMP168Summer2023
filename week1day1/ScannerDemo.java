package week1day1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter something:");
		
		int num1 = keyboard.nextInt();
		String str1 = keyboard.nextLine();
		String str2 = keyboard.next();
		String str3 = keyboard.nextLine();
		
		System.out.println("num1: " + num1);
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
	}

}
