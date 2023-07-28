package week2day3;

public class InvalidHeightException extends Exception {
	
	public InvalidHeightException(double height) {
		super("Invalid height: " + height);
	}

}
