package week2day3;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
//		try {
//			Person p2 = new Person("Bill", 1980, 160.0, -175.0);
//		} catch (Exception exception) {
//			System.err.println(exception.getMessage());
//			exception.printStackTrace();
//			Person p2 = new Person();
//		}
		
		Person p2 = new Person("Bill", 1980, 160.0, -175.0);
		
		System.out.println("Done.");
	}

}
