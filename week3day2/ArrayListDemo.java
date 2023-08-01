package week3day2;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Use an array to maintain student names
		String[] names = new String[10]; // We have to predict the proper length of the array
		names[0] = "Alice";
		names[1] = "Bob";
		names[2] = "Charlie";
		names[3] = "David";
		names[4] = "Eva";
		
		// Charlie dropped this class.
		names[2] = names[3]; // move David to index 2
		names[3] = names[4]; // move Eva to index 3
		names[4] = null; // remove Eva in index 4
		
		// Use an array list to maintain student names
		ArrayList<String> names2 = new ArrayList<String>(); // the size of an array list starts with 0.
		System.out.println("The initial size of array list: " + names2.size());
		names2.add("Alice");
		names2.add("Bob");
		names2.add("Charlie");
		names2.add("David");
		names2.add("Eva");
		System.out.println("The index of Alice: " + names2.indexOf("Alice"));
		// Charlie dropped this class.
		names2.remove(2);
		System.out.println("Verify that Charlie is no long in the array list: ");
		System.out.println(names2.toString());
	}

}
