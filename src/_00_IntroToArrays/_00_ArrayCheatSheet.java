package _00_IntroToArrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] array = new String[5];
		//2. print the third element in the array
System.out.println(array[2]);
		//3. set the third element to a different value
array[2] = "test";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < 5; i++) {
			array[i] = "changed";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < 5; i++) {
			System.out.println(array[i]);
		}
		//7. make an array of 50 integers
int[] array2 = new int[50];
		//8. use a for loop to make every value of the integer array a random number
for(int i = 0; i < 50; i++) {
	array2[i] = new Random().nextInt(50);
	Arrays.sort(array2);
}
		//9. without printing the entire array, print only the smallest number on the array

System.out.println(array2[0]);
System.out.println("test^^");
		//10 print the entire array to see if step 8 was correct
for(int i = 0; i < array2.length-1; i++) {
	System.out.println(array2[i]);
}
		//11. print the largest number in the array.
		System.out.println(array2[array.length-1]);
		//12. print only the last element in the array
		System.out.println(array2[array.length-1]);
	}
}
