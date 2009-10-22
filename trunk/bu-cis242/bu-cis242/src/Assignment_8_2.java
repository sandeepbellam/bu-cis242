/**
 * 
 * @author Andrei Tolnai
 * @date 22 October 2009
 * @assignment 8.2
 * @description Write overloaded Java methods that return the difference of two
 *              parameters. Your methods should contain the logic to return the
 *              difference of the larger parameter – smaller parameter,
 *              regardless of parameter order. Provide enough test code to
 *              ensure your methods are logically correct. The following table
 *              displays the required method parameter variations.
 *              <table border="1">
 *              <tr>
 *              <td>Param 1 Type</td>
 *              <td>Param 2 Type</td>
 *              <td>Return Type</td></td>
 *              </tr>
 *              <tr>
 *              <td>int</td>
 *              <td>int</td>
 *              <td>int</td>
 *              </tr>
 *              <tr>
 *              <td>double</td>
 *              <td>double</td>
 *              <td>double</td>
 *              </tr>
 *              <tr>
 *              <td>int</td>
 *              <td>double</td>
 *              <td>double</td>
 *              </tr>
 *              <tr>
 *              <td>double</td>
 *              <td>int</td>
 *              <td>double</td>
 *              </tr>
 *              </table>
 * @company Bellevue University
 * @fileName Assignment_8_2.java
 * 
 */
public class Assignment_8_2 {

	public static void main(String args[]) {
		System.out.println("parameters: 1, 2; \t result: " + difference(1, 2));
		System.out.println("parameters: 2, 1; \t result: " + difference(2, 1));

		System.out.println("parameters: 1.0, 2.0; \t result: "
				+ difference(1.0, 2.0));
		System.out.println("parameters: 2.0, 1.0; \t result: "
				+ difference(2.0, 1.0));

		System.out.println("parameters: 1, 2.0; \t result: "
				+ difference(1, 2.0));
		System.out.println("parameters: 2, 1.0; \t result: "
				+ difference(2, 1.0));

		System.out.println("parameters: 1.0, 2; \t result: "
				+ difference(1.0, 2));
		System.out.println("parameters: 2.0, 1; \t result: "
				+ difference(2.0, 1));
	}

	private static int difference(int a, int b) {
		return Math.max(a, b) - Math.min(a, b);
	}

	private static double difference(double a, double b) {
		return Math.max(a, b) - Math.min(a, b);
	}

	private static double difference(int a, double b) {
		return Math.max(a, b) - Math.min(a, b);
	}

	private static double difference(double a, int b) {
		return Math.max(a, b) - Math.min(a, b);
	}

}