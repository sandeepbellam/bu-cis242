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
 * @fileName MyStringTest.java
 * 
 */
public class MyStringTest {

	// The string attribute.
	private String string;

	public MyStringTest(String string) {
		this.string = string;
	}

	/**
	 * Prints the string the the reverse order.
	 */
	public void printStringInReverseOrder() {

		// Initialize a StringBuilder object.
		StringBuilder temp = new StringBuilder();

		// Go through the string in the reverse order, starting with the
		// string-length-1 element.
		for (int i = string.length() - 1; i >= 0; i--) {

			// Append the characters of the string to the string builder,
			// starting with the last character of the string.
			temp.append(string.charAt(i));
		}

		// Print the contents of the string builder.
		System.out.println(temp.toString());
	}

	/**
	 * 
	 * @return the length of the string
	 */
	public int length() {
		if (string != null) {
			return string.length();
		} else {
			return -1;
		}
	}

	/**
	 * 
	 * @param index
	 *            the index of the char value
	 * @return the character value at the specified index from the string
	 */
	public char charAt(int index) {
		if (string != null) {
			return string.charAt(index);
		} else {
			return (char) -1;
		}
	}

	/**
	 * 
	 * @return the string
	 */
	public String getString() {
		return string;
	}

}