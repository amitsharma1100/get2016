package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * client class to use the temperature web service
 *
 */
public class TemperatureWebServiceClient {

	/**
	 * main method
	 * 
	 * @param args
	 *            : String[]
	 * @throws IOException
	 */
	public static void main(String[] args) {
	
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("The celsius equivalent is " + TemperatureWebServiceClient.takeValidInput(bufferedReader) + " C");
		try {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		} catch (IOException e) {
			System.out.println("caught IOException : Expected bufferedReader object");
			e.printStackTrace();
		}
	}
	
	public static float takeValidInput(BufferedReader bufferedReader ){
		boolean isValidInput=false;
		float fahrenheitValue=0;
		while(!isValidInput){
			String stringFahrenheitValue=TakeInputs.takeInput(bufferedReader);
			fahrenheitValue= InputTypeCaster.stringToFloatCaster(stringFahrenheitValue);
			if(fahrenheitValue !=Constants.DEFAULT){
				isValidInput=true;
			}
		}
		float result = TemperatureWebServiceUser.getService(fahrenheitValue);
		if (result != Constants.DEFAULT) {
			return result;
		} else {
			TemperatureWebServiceClient.takeValidInput(bufferedReader);
		}
		return result;
	}
}
