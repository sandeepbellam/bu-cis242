/**
 * 
 * @author Andrei Tolnai
 * @date 11 October 2009
 * @assignment 6.2
 * @description Write an application that finds the total and average of odd
 *              numbers from 1 to 15. Your program must use a counted loop to
 *              accomplish this task.
 * @company Bellevue University
 * @fileName Assignment_6_2.java
 * 
 */
public class Assignment_6_2 {

	public static void main(String args[]) {

		// stores the sum of the odd numbers from 1 to 15
		int total = 0;

		// stores the average of the add numbers from 1 to 15
		int average = 0;

		// stores the number of the odd numbers from 1 to 15
		int count = 0;

		// calculate the sum and number of the odd numbers from 1 to 15
		for (int i = 1; i <= 15; total += i, i += 2, count++)
			;

		// calculate the average
		average = total / count;

		// display the results
		System.out.println("Total of odd numbers from 1 to 15: " + total);
		System.out.println("Average of odd numbers from 1 to 15: " + average);
	}

}