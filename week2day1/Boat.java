package week2day1;

public class Boat extends Vehicle {
	
	public void accelerate() {
		System.out.println("Full speed ahead!");
	}
	
	public void brake(int degree) {
		if (degree == 1) {
			System.out.println("Braking gently.");
		}
		
		if (degree == 2) {
			System.out.println("Braking hard.");
		}
	}

	@Override
	public void brake() {

		System.out.println("Decelerating");
	}

	@Override
	public void honk() {

		System.out.println("Muu~~~~~~~");
		
	}


	
	

}
