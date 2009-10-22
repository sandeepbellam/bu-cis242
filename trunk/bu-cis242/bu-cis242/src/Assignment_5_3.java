/**
 * 
 * @author Andrei Tolnai
 * @date 02 October 2009
 * @assignment 5.3
 * @description Write a Java application using iteration that will print two of
 *              the following patterns. </br>Select either #1 & #4 OR #2 & #3
 *              patterns.
 * @company Bellevue University
 * @fileName Assignment_5_3.java
 * 
 */
public class Assignment_5_3 {

	public static void main(String args[]) {

		// constants used in the displaying of the patterns
		final String SPACE = " ";
		final String DOUBLE_SPACE = "  ";
		final String DOUBLE_NEW_LINE = System.getProperty("line.separator")
				+ System.getProperty("line.separator");

		System.out.println("Pattern #1:");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + (j == i ? DOUBLE_NEW_LINE : DOUBLE_SPACE));
			}
		}

		System.out.println("\nPattern #2:");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 7 - i; j++) {
				System.out.print(j
						+ (j + i == 7 ? DOUBLE_NEW_LINE : DOUBLE_SPACE));
			}
		}

		System.out.println("\nPattern #3:");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print((i + j < 7 ? SPACE : (i + j - 6))
						+ (j == 6 ? DOUBLE_NEW_LINE : DOUBLE_SPACE));
			}
		}

		System.out.println("\nPattern #4:");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print((i - j > 0 ? SPACE : (j - i + 1))
						+ (j == 6 ? DOUBLE_NEW_LINE : DOUBLE_SPACE));
			}
		}
	}

}