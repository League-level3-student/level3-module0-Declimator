package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] array = new String[10];
		array[0] = "zero";
		array[1] = "one";
		array[2] = "two";
		array[3] = "three";
		array[4] = "four";
		array[5] = "five";
		array[6] = "six";
		array[7] = "seven";
		array[8] = "eight";
		array[9] = "nine";
		methodone(array);
		methodtwo(array);
		methodthree(array);
		methodfour(array);
	}
	
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static  void methodone(String[] array) {
		for(int i = 0; i < array.length; i ++) {
			System.out.println(array[i]);
		}
		System.out.println("__________");
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void methodtwo(String[] array) {
		for(int i = array.length - 1; i > 0; i--) {
			System.out.println(array[i]);

		}
		System.out.println("__________");
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void methodthree(String[] array) {
		for(int i = 0; i < array.length; i +=2) {
			System.out.println(array[i]);

		}
		System.out.println("__________");
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void methodfour(String[] array) {
		int r;
		boolean next = false;
		for(int i = 0; i < array.length; i ++) {
			
			System.out.println(array[r]);
		}
		System.out.println("__________");
	}
	
}
