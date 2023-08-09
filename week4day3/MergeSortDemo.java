package week4day3;

import java.util.Arrays;
import java.util.Random;

public class MergeSortDemo {

	public static void main(String[] args) {
		
		Random rng = new Random();
		int[] ary = new int[20];
		for (int i = 0; i < ary.length; i++) {
			ary[i] = rng.nextInt(0, 100);
		}
		mergeSort(ary);
		System.out.println(Arrays.toString(ary));

	}
	
	public static void mergeSort(int[] ary) {
		mergeSortHelper(ary, 0, ary.length-1);
	}
	
	private static void mergeSortHelper(int[] ary, int startIndex, int endIndex) {
	// Base case: there is 0 or 1 elements in the rage - Do nothing.
	// General case: 
		// 1. split the range in two half.
		// 2. apply merge sort on each half.
		// 3. merge them together.
		if (startIndex >= endIndex) {
			return;
		} else {
			int middleIndex = (startIndex + endIndex) / 2;
			mergeSortHelper(ary, startIndex, middleIndex);
			mergeSortHelper(ary, middleIndex+1, endIndex);
			
			// For merging, we need three indices:
			// i: the index that receives the next smallest value
			// j: the index in the first half.
			// k: the index in the second half.
			int[] firstHalf = Arrays.copyOfRange(ary, startIndex, middleIndex+1);
			int[] secondHalf = Arrays.copyOfRange(ary, middleIndex+1, endIndex+1);
			
			int i = startIndex;
			int j = 0;
			int k = 0;
			while(i <= endIndex) {
				if (j > middleIndex - startIndex) {
					ary[i] = secondHalf[k];
					k++;
					i++;
				} else if (k > endIndex - middleIndex - 1) {
					ary[i] = firstHalf[j];
					j++;
					i++;
				} else if (firstHalf[j] > secondHalf[k] ) {
					ary[i] = secondHalf[k];
					k++;
					i++;
				} else {
					ary[i] = firstHalf[j];
					j++;
					i++;
				}
			}
		}
	}

}
