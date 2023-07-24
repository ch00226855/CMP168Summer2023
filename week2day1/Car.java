package week2day1;

public class Car extends Vehicle {
	
	public Car() {// We need to explicitly define the default 
				// constructor as long as there is another constructor.
		
	}
	
	public Car(String name) {
		// A constructor in the extended class automatically
		// call the default constructor from the base class.
		super.setName(name);
	}
	
	public void accelerate() {
		System.out.println("Accelerating.");
	}
	
	public void brake() {
		System.out.println("Braking.");
	}
	
	public void honk() {
		System.out.println("Bee~~~~~~");
	}

}
