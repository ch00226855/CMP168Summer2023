package week1day4;

public class RestaurantDriver {

	public static void main(String[] args) {
		
		Restaurant r1 = new Restaurant();
		r1.setName("Shake n' Shack");
		r1.setAddress("123 4th Ave");
		r1.setRating(8);
		System.out.println(r1.getDescription());
		System.out.println(r1.getClass());
		System.out.println(r1.toString());
		System.out.println(r1.equals(r1));
		
		//////////////////////////////
		Restaurant r2 = new Restaurant();
		System.out.println(r2.getDescription());
		System.out.println(r2.getRating());
		r2.printInfo();
		
		////////////////////////////////
		Restaurant r3 = new Restaurant();
		r3.setName("Shake n' Shack");
		r3.setAddress("123 4th Ave");
		r3.setRating(8);
		System.out.println(r3.getDescription());
		System.out.println("r1.equals(r3): " + r1.equals(r3));
		System.out.println("r1.toString(): " + r1.toString());
		
		///////////////////////////////////////
		// Can we retrieve the method that has been overriden?
		r3.temp();
		
		///////////////////////////////////
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		
		//////////////////////////////////
		Business b1 = new Business();
		b1.setName("Walmart");
		b1.setAddress("234 5th Ave");
		
		Business b2 = new Business();
		b2.setName("Costco");
		b2.setAddress("345 6th Ave");
		
		Business b3 = new Business();
		b3.setName("Walmart");
		b3.setAddress("234 5th Ave");
		
		System.out.println("b1.equals(b1): " + b1.equals(b1));
		System.out.println("b1.equals(b2): " + b1.equals(b2));
		System.out.println("b1.equals(b3): " + b1.equals(b3));
		System.out.println("b1.equals(r1): " + b1.equals(r1));
		String s1 = "ABCDE";
		System.out.println("b1.equals(s1): " + b1.equals(s1));
	}

}
