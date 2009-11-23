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
 * @fileName MyRectangle.java
 * 
 */
public class MyRectangle {

	private double width;
	private double height;
	private static String color;

	public MyRectangle() {
	}

	public MyRectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@SuppressWarnings("static-access")
	public MyRectangle(double width, double height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public double findArea() {
		return width * height;
	}

	public String toString() {
		return "Width: " + width + "; Height: " + height + "; Color: " + color;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static String getColor() {
		return color;
	}

	public static void setColor(String color) {
		MyRectangle.color = color;
	}

}