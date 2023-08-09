package week4day3;

import java.util.Arrays;

public class BinarySearchDemo {
	
	public static void main(String[] args) {
		int[] ary = {1, 3, 6, 9, 10, 13, 15, 27, 28, 30, 32, 35, 37, 39, 41, 42, 44};
		int target = 7;
		
		int indexOfTarget = binarySearch(ary, target);
		
		System.out.println(indexOfTarget);
		
		System.out.println("====================================");
		String[] names = {"Alex", "Brian", "Carry", "David", "Elizabeth", "Fred", "Goergia", "Henry", "Ivan",
				"Kilos"};
		String name = "Bill";
		int indexOfName = binarySearch(names, name);
		System.out.println(indexOfName);
	}
	
	public static int binarySearch(int[] ary, int target) {
	/*
	 * 1. find the middle index
	 * 2. compare the value at middle index with target
	 * 3. if they are equal: return the middle index
	 *    if value > target: search the target in the first half
	 *    if value < target: search the target in the second half
	 *    
	 * Base case: if the array is empty, return -1.
	 */
		return binarySearchHelper(ary, target, 0, ary.length-1);
		
	}

	private static int binarySearchHelper(int[] ary, int target, int startIndex, int endIndex) {
	// Find the index of the first occurrence of target in range [startIndex, endIndex].
	// Print statements are optional.
		if (startIndex > endIndex) {// Base case: empty range
			System.out.println("Base case is reached. The target is not found.");
			return -1;
		} else {
			int middleIndex = (startIndex + endIndex) / 2;
			System.out.println("Examining value at index: " + middleIndex);
			if (ary[middleIndex] == target) {
				System.out.println("Target is found. Result: " + middleIndex);
				return middleIndex;
			} else if (ary[middleIndex] > target) {
				System.out.println("Target is too small, continue looking in the first half:");
				System.out.println(Arrays.toString(Arrays.copyOfRange(ary, startIndex, middleIndex)));
				return binarySearchHelper(ary, target, startIndex, middleIndex-1);
			} else {
				System.out.println("Target is too large, continue looking in the second half:");
				System.out.println(Arrays.toString(Arrays.copyOfRange(ary, middleIndex+1, endIndex+1)));
				return binarySearchHelper(ary, target, middleIndex+1, endIndex);
			}
		}
	}
	
	public static int binarySearch(String[] ary, String target) {
		return binarySearchHelper(ary, target, 0, ary.length-1);
	}
	
	private static int binarySearchHelper(String[] ary, String target, int startIndex, int endIndex) {
		if (startIndex > endIndex) {
			return -1;
		} else {
			int middleIndex = (startIndex + endIndex) / 2;
			if (ary[middleIndex].equals(target)) {
				return middleIndex;
			} else if (ary[middleIndex].compareTo(target) > 0) {
				return binarySearchHelper(ary, target, startIndex, middleIndex-1);
			} else {
				return binarySearchHelper(ary, target, middleIndex+1, endIndex);
			}
		}
	}
}
