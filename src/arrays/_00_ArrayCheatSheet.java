package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] ia = { "hi", "boi", "no", "go", "dude" };
		// 2. print the third element in the array
		System.out.println(ia[3]);
		// 3. set the third element to a different value
		ia[3] = "ez";
		// 4. print the third element again
		System.out.println(ia[3]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++) {
			System.out.println(ia[i]);
		}
		// 6. make an array of 50 integers
		int[] ia2 = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < 50; i++) {
			Random r = new Random();
			ia2[i] = r.nextInt(100);
			System.out.println(ia2[i]);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallestNum2 = 9999;
		for (int i = 0; i < ia2.length; i++) {
			if (ia2[i] < smallestNum2) {
				smallestNum2 = ia2[i];
			}
		}
		System.out.println(smallestNum2);
		// 9 print the entire array to see if step 8 was correct
		for (int i = 0; i < ia2.length; i++) {
			Random r = new Random();
			ia2[i] = r.nextInt(100);
			System.out.println(ia2[i]);
		}
		// 10. print the largest number in the array.
		int largestNum = 1;
		for (int i = 0; i < ia2.length; i++) {
			if (ia2[i] > largestNum) {
				largestNum = ia2[i];
			}
		}
		System.out.println(largestNum);
	}
}