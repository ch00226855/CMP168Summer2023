package week2day1;

public class Food {
	
	public String name;
	public int calories;
	public int weight;
	
	public Food(String name, int calories, int weight) {
		this.name = name;
		this.calories = calories;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getCalories() {
		return calories;
	}

	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %10s | Calories: %4d | Weight: %4d",
					this.name, this.calories, this.weight);
	}

}
