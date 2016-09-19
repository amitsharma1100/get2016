package client;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * class to take inputs from user
 * 
 * @author admin
 *
 */
public class TakeInputs {

	/**
	 * method to take a string as input
	 * 
	 * @param bufferedReader
	 *            : bufferedReader reference
	 * @return String : inputed string
	 */
	public static String takeInput(BufferedReader bufferedReader) {

		String stringFahrenheitValue = null;
		try {
			System.out.println("Enter the temperature");
			stringFahrenheitValue = bufferedReader.readLine();
			if (stringFahrenheitValue == null
					|| stringFahrenheitValue.trim().isEmpty()) {
				System.out.println("The input fields can not be empty");
				return takeInput(bufferedReader);
			}

		} catch (IOException e) {
			System.out.println("caught IOException : Expected String");
			System.out.println("please re enter the input");
			return takeInput(bufferedReader);
		}
		return stringFahrenheitValue;
	}
}
