package week1day3;

import java.util.Arrays;

public class RestaurantSimple {
	
	String name;
	int rating;
	String[] employees = new String[3];
	
	public void printInfo() {
		System.out.println(name + " - " + rating);
	}
	
	public void printEmployees() {
		System.out.println(Arrays.toString(employees));
	}

}
