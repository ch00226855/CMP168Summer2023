package week4day3;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortDemo {

	public static void main(String[] args) {
		
		Random rng = new Random();
		int[] ary = new int[20];
		for (int i = 0; i < ary.length; i++) {
			ary[i] = rng.nextInt(0, 100);
		}
		selectionSort(ary);
		System.out.println(Arrays.toString(ary));
	}
	
	public static void selectionSort(int[] ary) {
	// repeated select the smallest element, and put it in the front.
		selectionSortHelper(ary, 0, ary.length-1);
	}
	
	private static void selectionSortHelper(int[] ary, int startIndex, int endIndex) {
	// Apply selection sort on ary between startIndex and endIndex
		if (startIndex >= endIndex) {// base case
			return;
		} else {
			int minSoFar = ary[startIndex];
			int minIndex = startIndex;
			for (int i = startIndex + 1; i <= endIndex; i++) {
				if (minSoFar > ary[i]) {
					minSoFar = ary[i];
					minIndex = i;
				}
			}
			ary[minIndex] = ary[startIndex];
			ary[startIndex] = minSoFar;
			selectionSortHelper(ary, startIndex+1, endIndex);
		}
	}

}
