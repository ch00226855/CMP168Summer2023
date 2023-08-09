package week4day2;

public class CountUp {

	public static void main(String[] args) {
	
		countUp(4);

	}
	
	public static void countUp(int countInt) {
		
		if (countInt <= 0) {
			System.out.println("Go!");
		} else {
			countUp(countInt - 1);
			System.out.println(countInt);
		}
		
	}

}
