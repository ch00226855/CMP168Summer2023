package week1day3;

public class RestaurantDriver {

	public static void main(String[] args) {
		
		RestaurantSimple r1 = new RestaurantSimple();
		r1.name = "Mc Donald's";
		r1.rating = 1000;
		r1.employees[0] = "Alex";
		r1.employees[1] = "Bob";
		r1.employees[2] = "Clare";
		
		r1.printInfo();
		r1.printEmployees();
		
		r1.employees = new String[] {};
		r1.printEmployees();
		
		
		RestaurantSimple r2 = new RestaurantSimple();
		r2.name = "Chipotle";
		r2.rating = 9;
		r2.printInfo();
		
		//////////////////////////////////////////
		Restaurant r3 = new Restaurant("Burger King", 10);
		// We can no longer modify member variables directly
//		r3.name = "Burger King";
		
		r3.printInfo();
		
		r3.setRating(-10);
		
		System.out.println("The rating of " + r3.getName() +
					" is: " + r3.getRating());
		
		r3.addEmployee("Alice");
		r3.addEmployee("Bob");
		r3.addEmployee("Clare");
		r3.addEmployee("Doug");
		r3.addEmployee("Eva");
		r3.addEmployee("Fiola");
		r3.printEmployees();
		
		

	}

}
