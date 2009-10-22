import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Andrei Tolnai
 * @date 20 September 2009
 * @assignment 3.3
 * @description Write a Java application that reads an integer and checks if it
 *              is even.</br>If your input is 25, your output should be:</br>Is
 *              25 even? false</br>If your input is 2000, your output should
 *              be:</br> Is 2000 even? true
 * @company Bellevue University
 * @fileName Assignment_3_3.java
 * 
 */
public class Assignment_3_3 {

	public static void main(String args[]) {

		// create a scanner
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter an integer: ");

		try {
			int integer = userInput.nextInt();
			System.out
					.println("Is " + integer + " even? " + (integer % 2 == 0));

		} catch (InputMismatchException e) {

			// Error message is displayed if the user entered an invalid integer
			System.out.println("You must enter an integer!");
		}
	}
}