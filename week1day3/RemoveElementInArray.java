package week1day3;
import java.util.Arrays;

public class RemoveElementInArray {
	
	public static void removeElement(String[] ary,
							int numElements, int target) {
		for (int i = target; i < numElements; i++) {
			if (i != numElements - 1) {
				ary[i] = ary[i+1];
			} else {
				ary[i] = null;
			}
		}
	}

	public static void main(String[] args) {
		
		// Create an oversized array
		String[] ary = new String[10];
		int numElements = 5;
		ary[0] = "a";
		ary[1] = "b";
		ary[2] = "c";
		ary[3] = "d";
		ary[4] = "e";
		
		System.out.println(Arrays.toString(ary));
		
		// Let's remove the element at index target
		int target = 3;
		if (target >= numElements) {
			System.out.println("There is nothing at index " + target);
		} else {
			removeElement(ary, numElements, target);
			
		}

		System.out.println(Arrays.toString(ary));
	}

}
