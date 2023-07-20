package week1day3;

import java.util.Arrays;

public class Restaurant {
	
	private String name;
	private int rating;
	private String[] employees;
	private int numEmployees;
	
	// Create a constructor without a rating
		public Restaurant(String restaurantName) {
			name = restaurantName;
			rating = -1; // -1 means that the rating hasn't been assigned
			employees = new String[5];
			numEmployees = 0;
		}
	
	// Constructor (do not use a return type for constructors)
	public Restaurant(String restaurantName,
						int restaurantRating) {
//		name = restaurantName;
//		rating = restaurantRating;
//		employees = new String[5];
//		numEmployees = 0;
		this(restaurantName); // use the first constructor first
		rating = restaurantRating;
	}
	
	

	public void printInfo() {
		System.out.println(this.name + " - " + this.rating);
	}
	
	// Accessor methods and modifier methods
	// getter methods and setter methods
	public String getName() {
		return name;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
	// if newRating is between 0 and 10, then 
	// update the restaurant rating.
		if ((rating >= 0) && (rating <= 10)) {
			this.rating = rating;
		} else {
			System.err.println("ERROR: invalid new rating: " +
							rating);
		}
	}
	
	public void addEmployee(String newEmpolyee) {
		if (numEmployees >= employees.length) {
			System.err.println("ERROR: No more employee can be accepted.");
		} else {
			employees[numEmployees] = newEmpolyee;
			numEmployees++;
		}
	}
	
	public void printEmployees() {
		System.out.println(Arrays.toString(employees));
	}
}
