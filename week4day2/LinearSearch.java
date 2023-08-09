package week4day2;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {

	public static void main(String[] args) {
		
		// Generate a random array.
//		int[] ary = new int[1000];
//		Random rng = new Random(); // Random number generator
//		
//		for (int i = 0; i < ary.length; i++) {
//			ary[i] = rng.nextInt(0, 1000);
//		}
		
		int[] ary = {534, 423, 635, 41, 525, 1, 234, 567, 789};
		
		System.out.println(Arrays.toString(ary));
		
		// Use line search to find a particular value.
		int target = 525;
//		int indexOfTarget = linearSearch(ary, target);
		int indexOfTarget = linearSearchRecurrsion(ary, target);
		System.out.println(indexOfTarget);
	}
	
	public static int linearSearch(int[] ary, int target) {
		
		for (int i = 0; i < ary.length; i++) {
			if (target == ary[i]) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static int linearSearchRecurrsion(int[] ary, int target) {
		return linearSearchHelper(ary, target, 0, ary.length-1);
	}
	
	public static int linearSearchHelper(int[] ary, int target,
								int startIndex, int endIndex) {
		// searches the target between startIndex and endIndex.
		if (startIndex > endIndex) {// base case
			return -1;
		} else {
			if (ary[startIndex] == target) {
				return startIndex;
			} else {
				return linearSearchHelper(ary, target, 
						startIndex+1, endIndex);
			}
		}
	}

}
