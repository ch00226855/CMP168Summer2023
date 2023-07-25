package week2day2;

import java.util.Arrays;

public class Book implements Comparable<Book> {
	
	private String name;
	private double price;
	private int publishYear;
	private int publishMonth;
	
	public Book(String name, double price,
				int publishYear, int publishMonth) {
		this.name = name;
		this.price = price;
		this.publishYear = publishYear;
		this.publishMonth = publishMonth;
	}
	
	@Override
	public int compareTo(Book o) {
		// if this object should be placed before o, return -1
		// if this object should be placed after o, return 1.
		// if this object equals o, return 0.
		
		// use price as order
//		if (this.price < o.price) {
//			return -1;
//		} else if (this.price > o.price) {
//			return 1;
//		} 
//		
		// Use the published dates as order
//		if (this.publishYear < o.publishYear) {
//			return -1;
//		} else if (this.publishYear > o.publishYear) {
//			return 1;
//		} else if (this.publishMonth < o.publishMonth) {
//			return -1;
//		} else if (this.publishMonth > o.publishMonth) {
//			return 1;
//		}
		
		// Use book names
		if (this.name.compareTo(o.name) < 0) {
			return -1;
		} else if (this.name.compareTo(o.name) > 0) {
			return 1;
		}
		
		return 0;
	}
	
	@Override
	public String toString() {
		return "[" + this.name + ", $" + this.price + ", "
				+ this.publishMonth + "/" + this.publishYear + "]";
	}
	
	
	public static void main(String[] args) {
		Book book1 = new Book("Hamlet", 6.29, 1600, 12);
		Book book2 = new Book("World War Z", 10.35,
				2007, 10);
		Book book3 = new Book("The Round House", 10.56, 
				2013, 9);
		Book book4 = new Book("Green Fields", 14.08, 2015,
				8);
		
//		System.out.println(book2.compareTo(book2));
		Book[] books = {book4, book1, book2, book3};
		Arrays.sort(books);
		System.out.println(Arrays.toString(books));
		
		System.out.println("======================");
		// How compareTo() works for strings
		String str1 = "Monday";
		String str2 = "Mznday";
		System.out.println(str1.compareTo(str2));
		
	}





}
