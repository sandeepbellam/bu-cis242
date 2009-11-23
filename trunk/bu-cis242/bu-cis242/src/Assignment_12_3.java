/**
 * 
 * @author Andrei Tolnai
 * @date 22 November 2009
 * @assignment 12.3
 * @description Write a Java application that creates an instance of the String
 *              class and initializes this instance with a String literal. Use a
 *              for loop structure to print the string in reverse order.
 *              Implement the following two String member methods to complete
 *              the assignment:
 * 
 *              </br> length()
 * 
 *              </br> charAt()
 * 
 *              Write a program to test your class MyStringTest.
 * @company Bellevue University
 * @fileName Assignment_12_3.java
 * 
 */
public class Assignment_12_3 {

	public static void main(String[] s) {

		// Initialize a MyStringTest object.
		MyStringTest test = new MyStringTest("test string");

		System.out.println("The string: '" + test.getString() + "'");
		System.out.println("The string length: '" + test.length() + "'");
		System.out.println("Character at index 3: '" + test.charAt(3) + "'");

		// Print the string in reverse order.
		test.printStringInReverseOrder();
	}

}