import java.util.Arrays;

/**
 * @author Andrei Tolnai
 * @date 08 November 2009
 * @assignment 10.2
 * @description Write a program that implements a method that receives an array
 *              parameter and sorts that array using the bubble-sort algorithm.
 *              The bubble-sort algorithm makes several passes through the
 *              array. On each pass, successive neighboring pairs are compared.
 *              If a pair is in decreasing order, its values are swapped:
 *              otherwise, the values remain unchanged. The technique is called
 *              a bubble sort because the smaller values gradually "bubble"
 *              their way to the top. </br>Continue to properly document your
 *              source code. Write this program as if you were explaining it to
 *              someone new to arrays. Fully document your code in such a way
 *              newcomers to Java will understand and be able to implement a
 *              Java array. Your grade on this assignment will be based on your
 *              thoroughness of documentation as well as you correctness of
 *              code.
 * @company Bellevue University
 * @fileName Assignment_10_2.java
 * 
 */
public class Assignment_10_2 {

	public static void main(String args[]) {

		// Create a integer array and initialize it's elements
		int[] intArray = { 9, 4, 78, 45, 8, 2, 0, 46 };

		// Print in the console the unsorted integer array by using the Arrays
		// class from the Java API and the toString(int[]) method that returns
		// the array as a String.
		System.out.println(Arrays.toString(intArray));

		// Call the method which sorts the initial array using the bubble sort
		// algorithm.
		bubbleSort(intArray);

		// Print in the console the same array, this time being sorted.
		System.out.println(Arrays.toString(intArray));
	}

	/**
	 * Sorts an integer array using the bubble sort algorithm.
	 * 
	 * @param intArray
	 *            represents the array that will be sorted
	 */
	private static void bubbleSort(int[] intArray) {

		// A flag that tells if two elements of the array were swapped. This
		// false value of this flag represents the stopping condition of the
		// following do-while loop.
		boolean changed;

		do {
			// Assume this is last pass over array and no elements were swapped.
			changed = false;

			// Go through the integer array from the first element of the array
			// (which has the index 0) to the last element. Will use the "i"
			// variable as the current index for going through the integer
			// array. Because in the for loop in the if statement it is accessed
			// the "i+1"th element, "i" will have the maximum value of
			// array_length-2 so that we will stay in the bounds of the array
			// length.
			for (int i = 0; i < intArray.length - 1; i++) {

				// The bubble sort algorithm involves swapping two consecutive
				// elements if they are not in the right order.
				if (intArray[i] > intArray[i + 1]) {

					// Swap the "i" and "i+1" elements by using a temporary
					// variable.
					int temp = intArray[i];
					intArray[i] = intArray[i + 1];
					intArray[i + 1] = temp;

					// After an swap, set the flag to true so that the array
					// will be checked again.
					changed = true;
				}
			}

			// Do the above steps until no swapping is made in the array.
		} while (changed);
	}
}