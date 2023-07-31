package week3day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWritingDemo {

	public static void main(String[] args) {
		
		FileOutputStream file = null;
		PrintWriter pw = null;
		
		try {
			file = new FileOutputStream("data/data.txt");
			// Use a different constructor if you want to append
//			file = new FileOutputStream("data/data.txt", true);
			pw = new PrintWriter(file);
			
			pw.println("67890");
			pw.printf("Name: %20s | Age: %4d\n", "Bill Gates", 70);
//			pw.flush(); // force the buffered contents to be written to file.
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				pw.close(); // close the print writer first.
				file.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
