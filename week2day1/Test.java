package week2day1;

public class Test {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.accelerate();
		car1.brake();
		car1.honk();
		car1.setName("Flash");
		System.out.println("Car name:" + car1.getName());
		System.out.println("Car ID: " + car1.getID());
		
		Car car2 = new Car();
		System.out.println("Car ID: " + car2.getID());
		
		Car car3 = new Car("Highlander");
		System.out.println("Car ID: " + car3.getID());
		Car car4 = new Car("Tundra");
		System.out.println("Car ID: " + car4.getID());
		
		Boat boat1 = new Boat();
		boat1.accelerate();
		boat1.brake();
		boat1.honk();
		
		Motorcycle m1 = new Motorcycle();
		m1.accelerate();
		m1.brake();
		m1.honk();
//		
		// We cannot create an object from Vehicle directly.
//		Vehicle v1 = new Vehicle();
		
		// How can we put all these vehicle objects in an array?
		Vehicle[] ary = {car1, car2, car3, car4, boat1, m1};
		for (int i = 0; i < ary.length; i++) {
			System.out.println("Vehicle Name: " + ary[i].getName() +
					" - Vehicle Class: " + ary[i].getClass());
		}
	}

}
