package week2day1;

public class PetDriver {

	public static void main(String[] args) {
		
		// Create a Pet object. An error message will occur.
		// Error message: Cannot instantiate the type Pet
//		Pet p1 = new Pet("Honey", "Honey", true);
		
		Dog d1 = new Dog("Chihuahua", "Crunchy Dog Treats", "Chew Toy");
		Dog d2 = new Dog("Golden Retriever", "Beef", "Food Puzzles");
		
		d1.play();
		d2.play();
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		
		System.out.println("d1.equals(d1): " + d1.equals(d1));
		System.out.println("d1.equals(d2): " + d1.equals(d2));

		Cat c1 = new Cat("Siamese", "Chicken treats", "Sunny");
		
		c1.play();
		
		System.out.println(c1.toString());
		System.out.println(c1.equals(d1));
		System.out.println(c1.equals(c1));
	}

}
