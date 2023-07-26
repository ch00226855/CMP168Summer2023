package week2day1;

public class Dog extends Pet implements FoodEater {
	
	private String favorateToy;
	
	public Dog(String name,
				String favorateFood,
				String favorateToy) {
		super(name, favorateFood, true);
		this.favorateToy = favorateToy;
	}
	
	@Override
	public void play() {
		System.out.println(this.getName() + " plays with " + 
					this.getFavorateToy() + ".");
	}
	
	@Override
	public String toString() {
		
		return (super.toString() + " | Favorate Toy: " 
					+ this.favorateToy);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Dog)) {
			return false;
		} else {
			Dog dObj = (Dog) obj;
			if (super.equals(dObj) && 
				this.favorateToy.equals(dObj.getFavorateToy())) {
				return true;
			} else {
				return false;
			}
		}
		
	}

	public String getFavorateToy() {
		return favorateToy;
	}

	public void setFavorateToy(String favorateToy) {
		this.favorateToy = favorateToy;
	}

	@Override
	public void eat() {
		
		System.out.println(this.getName() + " is eating.");
		
	}

	@Override
	public void eat(Food food) {
		
		System.out.println(this.getName() + " is eating " + food.getName()
						+ ".");
		
	}

	@Override
	public double metablizeFood(Food food) {
		System.out.println(this.getName() + " eats " + food.getName() + ", gaining "
				 + food.getCalories() + " calories.");
		return 0;
	}
	
	public void test() {
//		FoodEater.someNumber += 2;
		System.out.println("Variable inherited from FoodEater: " +
						FoodEater.someNumber);
		FoodEater.print();
		FoodEater.someClass obj = new FoodEater.someClass();
		obj.print();
	}
	

}
