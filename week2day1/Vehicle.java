package week2day1;

// Use keyword "abstract" to define an abstract class.
public abstract class Vehicle {
	
	// An abstract class can have static member variables
	private static int counter = 0;
	
	// non-static member variables
	private String name;
	private int iD;
	
	// constructor
	public Vehicle() {
		this.name = "Undeclared"; // default value is null.
		
		// Create a unique ID for each vehicle.
		this.iD = counter;
		counter++;
	}
	
	// concrete methods
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getID() {
		return this.iD;
	}
	
	// incomplete methods: use keyword "abstract".
	public abstract void accelerate();
	public abstract void brake();
	public abstract void honk();
	
	

}
