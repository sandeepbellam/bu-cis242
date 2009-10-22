/**
 * 
 * @author Andrei Tolnai
 * @date 12 October 2009
 * @assignment 7.3
 * @description Write a Java application that prints the following table using
 *              the sqrt() method in the Math class. Use a for loop to produce
 *              the output results.
 * @company Bellevue University
 * @fileName Assignment_7_3.java
 * 
 */
public class Assignment_7_3 {

	public static void main(String args[]) {

		printTableHeader();

		// computes the square root and prints the body of the table
		for (int i = 0; i <= 20; i += 2) {
			System.out.printf(" | %4d   |    %.4f   |\n", i, Math.sqrt(i));
		}

		printTableBottom();

	}

	private static void printTableHeader() {
		System.out.println(" /----------------------\\");
		System.out.println(" | Number | Square root |");
		System.out.println(" |--------|-------------|");
	}

	private static void printTableBottom() {
		System.out.println(" \\----------------------/");
	}

}