package week3day1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TheFileClassDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("data/numbers.txt");
		Scanner scnr = new Scanner(file);
		
		while(scnr.hasNextInt()) {
			System.out.println(scnr.nextInt());
		}
		
		scnr.close();

	}

}
