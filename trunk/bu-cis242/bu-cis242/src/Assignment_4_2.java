import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Andrei Tolnai
 * @date 24 September 2009
 * @assignment 4.2
 * @description Write a program that reads three integer inputs into variables.
 *              Display the input values in both the ordered entered and in
 *              sorted order. This program should sort the numbers so that </br>
 *              value1 <= value2 <= value3.
 * @company Bellevue University
 * @fileName Assignment_4_2.java
 * 
 */
public class Assignment_4_2 {

	public static void main(String args[]) {

		// create a scanner
		Scanner userInput = new Scanner(System.in);

		// the three variables
		long value1, value2, value3;

		try {
			System.out.print("Enter integer one: ");
			value1 = userInput.nextLong();

			System.out.print("Enter integer two: ");
			value2 = userInput.nextLong();

			System.out.print("Enter integer three: ");
			value3 = userInput.nextLong();

			System.out.println("The integers in the entered order are: "
					+ value1 + ", " + value2 + ", " + value3);

			// in the temp variable store one of the values when swapping
			long temp;
			if (value2 < value1) {
				temp = value1;
				value1 = value2;
				value2 = temp;
			}
			if (value3 < value2) {
				temp = value3;
				value3 = value2;
				value2 = temp;
			}
			if (value2 < value1) {
				temp = value1;
				value1 = value2;
				value2 = temp;
			}

			System.out.println("The sorted integers are: " + value1 + ", "
					+ value2 + ", " + value3);

		} catch (InputMismatchException e) {

			// Error message is displayed if the user entered an invalid integer
			System.out.println("You must enter an integer!");
		}
	}

}