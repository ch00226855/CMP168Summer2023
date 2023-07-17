package week1day1;

public class StringComparison {

	public static void main(String[] args) {
		
		String str1 = "abcabc";
		
		String str2 = str1.substring(0, 3);
		
		String str3 = str1.substring(3, 6);
		
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		System.out.println(str2 == str3);

	}

}
