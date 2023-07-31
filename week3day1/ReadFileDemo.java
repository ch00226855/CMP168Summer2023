package week3day1;

// 1. import classes for file reading
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {
		
		// What is the default working directory?
//		System.out.println("The default working directory: ");
//		System.out.println(System.getProperty("user.dir"));
		
		// 2. declare the file object and the scanner object
		
		FileInputStream file = null;
		Scanner scnr = null;
		
		try {
		// 3. Create the file object and the scanner object in a try-catch block
//			file = new FileInputStream("data/numbers.txt");
//			file = new FileInputStream("./data/numbers.txt"); // Use "." to represent the default folder
			file = new FileInputStream("C:/Users/Liang Zhao/eclipse-workspace/cmp168summer2023/data/numbers.txt");
			scnr = new Scanner(file);
			
			// 3. use methods from the scanner object to read from file.
			while(scnr.hasNext()) {
				if (scnr.hasNextInt()) {
					System.out.println(scnr.nextInt());
				} else {
					scnr.next(); // exhaust the next value
				}
			}
		} catch (IOException e) {
			System.err.println("File not found.");
		} finally {
			// 4. close the file object before exiting.
			if (file != null) {
				try {
					file.close(); // a second try-catch block is required for file.close();
					scnr.close();
				} catch (IOException e) {
					System.out.println("File not found.");
				}
			}
		}
	}

}
