package week1day4;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		Restaurant r1 = new Restaurant();
		r1.setName("Wendy's");
		r1.setAddress("*****");
		r1.setRating(7);
		
		System.out.println("Is r1 a Restaurant object? " + 
					(r1 instanceof Restaurant));
		System.out.println("Is r1 a Business object? " + 
				(r1 instanceof Business));
		System.out.println("Is r1 a Object object? " + 
				(r1 instanceof Object));
		
		Restaurant r2 = new Restaurant();
		r2.setName("KFC");
		r2.setAddress("------");
		r2.setRating(6);
		
		Business b1 = new Business();
		b1.setName("Whole Foods");
		b1.setAddress("^^^^^^^^^^");
		
		// Polymorphism allows r1 and r2 to be added to a Business array.
		Business[] ary = {r1, r2, b1}; 
		for (int i = 0; i < ary.length; i++) {
			// For r1 and r2, the restaurant getDescription() was used.
			// For b1, the business getDescription() was used.
			System.out.println(ary[i].getDescription());
		}
			

	}

}
