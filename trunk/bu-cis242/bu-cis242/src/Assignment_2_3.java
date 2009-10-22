import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * 
 * @author Andrei Tolnai
 * @date 08 September 2009
 * @assignment 2.3
 * @description Write a Java application that converts Fahrenheit to Celsius.
 *              The formula is as follows: </br> celsius = ( 5.0 / 9.0 ) *
 *              (fahrenheit - 32.0) </br> Your program reads a Fahrenheit degree
 *              double from an input dialog box, then converts it to Celsius and
 *              displays the result in a message dialog box.
 * @company Bellevue University
 * @fileName Assignment_2_3.java
 * 
 */
public class Assignment_2_3 {

	public static void main(String args[]) {

		// Constant with the title for all dialogs
		final String title = "Celsius to Fahrenheit converter";

		// The DecimalFormat class is used to format the degrees when they are
		// displayed to the user in order for them to be more user-friendly
		// (show the double with the precision of 2).
		final DecimalFormat df = new DecimalFormat("#.##");

		String userInput = JOptionPane.showInputDialog(null, "Enter Fahrenheit degree:", title, JOptionPane.QUESTION_MESSAGE);

		try {

			// The use can enter an invalid double in the input dialog and the
			// parseDouble method throws NumberFormatException in this case.
			// In case of exception we show the user an error message.
			double fahrenheit = Double.parseDouble(userInput);
			double celsius = (5.0 / 9) * (fahrenheit - 32);

			JOptionPane.showMessageDialog(null, df.format(fahrenheit) + " Fahrenheit degree is " + df.format(celsius) + " Celsius degree.", title,
					JOptionPane.PLAIN_MESSAGE);
		} catch (NumberFormatException e) {

			// The error message is shown to the user in case he entered an
			// invalid double in the input dialog.
			JOptionPane.showMessageDialog(null, "You must enter a number!", title, JOptionPane.ERROR_MESSAGE);
		}

	}
}