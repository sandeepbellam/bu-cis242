/**
 * @author Andrei Tolnai
 * @date 15 November 2009
 * @assignment 11.3
 * @description Create a class named <code>MyRectangle</code> to represent
 *              rectangles. The required data fields are <code>width</code>,
 *              <code>height</code>, and <code>color</code>. Use double data
 *              type for width and height, and a String for color. Suppose that
 *              all rectangles are the same color. Use a static variable for
 *              color. You will need to provide the accessor methods for the
 *              properties and a method <code>findArea(</code>) for computing
 *              the area of the rectangle. </br> Write a program to test your
 *              class MyRectangle. In the client program, create two
 *              <code>MyRectangle</code> objects. Assign a width and height to
 *              each of the two objects. Assign the first object the color <font
 *              color="red">red</font>, and the second, <font
 *              color="rgb(200,200,0)">yellow</font>. Display all properties of
 *              both objects including their area.
 * @company Bellevue University
 * @fileName Assignment_11_3.java
 * 
 */
public class Assignment_11_3 {

	@SuppressWarnings("static-access")
	public static void main(String args[]) {

		// Create the first rectangle
		MyRectangle rectangleOne = new MyRectangle(10.0, 25.0);
		// Set the color to red
		rectangleOne.setColor("red");

		// Create the second rectangle
		MyRectangle rectangleTwo = new MyRectangle(5, 6);
		// Set the color to yellow
		rectangleTwo.setColor("yellow");

		// Display the first rectangle
		System.out.println("Rectangle One:");
		System.out.println("   " + rectangleOne);
		System.out.println("   Area: " + rectangleOne.findArea());

		// Display the second rectangle
		System.out.println("Rectangle Two:");
		System.out.println("   " + rectangleTwo);
		System.out.println("   Area: " + rectangleTwo.findArea());
	}
}