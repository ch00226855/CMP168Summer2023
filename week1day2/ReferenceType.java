package week1day2;

import java.util.Arrays;

public class ReferenceType {

	public static void main(String[] args) {
	
		// a primitive type variable will not be affected by
		// a method
		int x = 100;
		modifyInt(x);
		System.out.println("x = " + x);
		
		// a reference type variable can be affected by methods
		int[] ary = {1, 2, 3, 4, 5};
		modifyArray(ary);
		System.out.println(Arrays.toString(ary));
		
		// If I don't want the reference type variable to be modified,
		// I should pass a copy of it to any method.
		int[] ary2 = {5, 4, 3, 2, 1};
		modifyArray(ary2.clone());
		System.out.println(Arrays.toString(ary2));
	}
	
	public static void modifyInt(int x) {
		x = 200;
	}
	
	public static void modifyArray(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			ary[i] = ary[i] * 2;
		}
	}

}
