package week2day3;

public class Person {
	
	private String name;
	private int birthYear;
	private double weight;
	private double height;
	private char gender;
	
	public Person() {
		this.name = "Unspecified";
		this.birthYear = 1900;
		this.weight = 0.0;
		this.height = 0.0;
	}
	
	public Person(String name, 
				int birthYear,
				double weight,
				double height){
//		this.name = name;
//		this.birthYear = birthYear;
//		
//		if (weight > 0.0) {
//			this.weight = weight;
//		} else {
//			throw new Exception("Invalid weight: " + weight);
//		}
//		
//		if (height > 0.0) {
//			this.height = height;
//		} else {
//			throw new Exception("Invalid height: " + height);
		
		// Add "throws Exception at the end of method signature"
//		if (weight <= 0.0) {
//			throw new Exception("Invalid weight: " + weight);
//		} else if (height <= 0.0) {
//			throw new Exception("Invalid height: " + height);
//		}
		
		try {
			System.out.println(name.charAt(0));
			System.out.println(1 / 0);
			if (weight <= 0.0) {
				throw new InvalidWeightException(weight);
			} else if (height <= 0.0) {
				throw new InvalidHeightException(height);
			}
		} 
//		catch (Exception e) {
//			System.out.println("Invalid input. Calling the default"
//					+ " constructor instead.");
//			this.name = "Unspecified";
//			this.birthYear = 1900;
//			this.weight = 0.0;
//			this.height = 0.0;
//		}
		
		catch (InvalidWeightException e) {
			System.out.println(e.getMessage());
		} catch (InvalidHeightException e) {
			e.printStackTrace();
		}
		
		finally {// Will be executed no matter what happens.
			System.out.println("This statement will always be displayed.");
		}
		
		this.name = name;
		this.birthYear = birthYear;
		this.weight = weight;
		this.height = height;
		System.out.println("Construction completed.");
	}

}
