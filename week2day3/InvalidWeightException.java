package week2day3;

public class InvalidWeightException extends Exception {
	
	public InvalidWeightException(double weight) {
		super("Invalid weight: " + weight);
	}

}
