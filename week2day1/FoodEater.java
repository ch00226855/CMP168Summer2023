package week2day1;

public interface FoodEater {
	
	public static int someNumber = 0; // This variable cannot be modified.
	
	public void eat();
	public void eat(Food food);
	public double metablizeFood(Food food);
	
	public static void print() {
		System.out.println("Printing from the FoodEater interface.");
	}
	
	public class someClass {
		public void print() {
			System.out.println("Printing from someClass defined in"
					+ " FoodEater.");
		}
	}

}
