package week3day2;

public class Strange2DArrayDemo {

	public static void main(String[] args) {
		
		int[][] strangeArray = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
		
		System.out.println("Number of rows: " + strangeArray.length);
		System.out.println("Length of Row 0: " + strangeArray[0].length);
		System.out.println("Length of Row 1: " + strangeArray[1].length);
		System.out.println("Length of Row 2: " + strangeArray[2].length);
		
		char[] row1 = {'a', 'b', 'c', 'd'};
		char[] row2 = {'e', 'f', 'g'};
		char[] row3 = {'x', 'y', 'z', 't'};
		char[][] strangeArray2 = {row1, row2, row3};
		System.out.println("Number of rows: " + strangeArray2.length);
		System.out.println("Length of Row 0: " + strangeArray2[0].length);
		System.out.println("Length of Row 1: " + strangeArray2[1].length);
		System.out.println("Length of Row 2: " + strangeArray2[2].length);

	}

}
