/**
 * 
 * @author Andrei Tolnai
 * @date 01 November 2009
 * @assignment 9.3
 * @description Create a Java application that implements the use of an int
 *              array. Use 'for' loops to iterate through the array using the
 *              array’s length variable to stay within the array bounds. Fill
 *              the array with random numbers and print the array. </br>Continue
 *              to properly document your source code. Write this program as if
 *              you were explaining it to someone new to arrays. Fully document
 *              your code in such a way newcomers to Java will understand and be
 *              able to implement a Java array. Your grade on this assignment
 *              will be based on your thoroughness of documentation as well as
 *              you correctness of code.
 * @company Bellevue University
 * @fileName Assignment_9_3.java
 * 
 */
public class Assignment_9_3 {

	public static void main(String args[]) {

		// Create an int array using "new int[10]" and assign the reference of
		// the newly created array to the variable "intArray".
		int[] intArray = new int[10];

		// When the space for an array is allocated, the size must be given and
		// the length cannot be modified after the array is created; in order to
		// get the length of the array you use "intArray.length".
		for (int i = 0; i < intArray.length; i++) {
			// Each array element is accessed through an index; the array
			// indices start from 0 and go until "intArray.length-1";

			// The following statement will initialize each element of the array
			// with a random number between 0 and 100: [0, 100).
			intArray[i] = (int) (Math.random() * 100);
		}

		// This loop will print the contents of the integer array; in order to
		// print each element of the array, the elements are accessed through
		// the indices.
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}

}