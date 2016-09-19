package client;

/**
 * class to perform type casting
 *
 */
public class InputTypeCaster {

	/**
	 * This method takes as input an string and type casts it to float and returns it
	 * @param input : String
	 * @return float correspondent of input string
	 */
	@SuppressWarnings("finally")
	static float stringToFloatCaster(String input) {
		float output = Constants.DEFAULT;
		try {
			output = Float.parseFloat(input);
		} catch (NullPointerException e) {
			System.out.println("caught null pointer exception : Expected String");
		} catch (NumberFormatException e) {
			System.out.println("caught number format exception : Expected float");
		} finally {
			return output;
		}
	}
}
