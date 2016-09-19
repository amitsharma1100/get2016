package client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import temperatureWebServicePackage.FahrenheitToCelsiusConverter;
import temperatureWebServicePackage.FahrenheitToCelsiusConverterServiceLocator;

/**
 * Class to utilise the temperature web service
 * 
 * @author admin
 *
 */
public class TemperatureWebServiceUser {
	/**
	 * method to get service
	 * 
	 * @param inputFahrenheitValue
	 *            :the temperature to be converted into celsius
	 * @return the converted temperature in celsius
	 */
	static float getService(float inputFahrenheitValue) {
		FahrenheitToCelsiusConverterServiceLocator locator = new FahrenheitToCelsiusConverterServiceLocator();
		locator.setFahrenheitToCelsiusConverterEndpointAddress("http://localhost:8080/TemperatureWebService/services/FahrenheitToCelsiusConverter");
		try {
			FahrenheitToCelsiusConverter fahrenheitToCelsiusConverter = locator
					.getFahrenheitToCelsiusConverter();
			return (useService(fahrenheitToCelsiusConverter,
					inputFahrenheitValue));
		} catch (ServiceException e) {
			System.out
					.println("oooppss !!!! something went wrong caught ServiceException");
			e.printStackTrace();
		}
		return Constants.DEFAULT;
	}

	/**
	 * This method takes as input the service object and the input temperature
	 * to be converted and returns the converted value
	 * 
	 * @param fahrenheitToCelsiusConverter
	 *            : service object
	 * @param inputFahrenheitValue
	 *            : input temperature to be converted
	 * @return : the converted value in celsius
	 */
	static float useService(
			FahrenheitToCelsiusConverter fahrenheitToCelsiusConverter,
			float inputFahrenheitValue) {
		try {
			return (fahrenheitToCelsiusConverter
					.convertFahrenheitToCelsius(inputFahrenheitValue));
		} catch (RemoteException e) {
			System.out
					.println("oooppss !!!! something went wrong caught RemoteException");
			e.printStackTrace();
		}
		return Constants.DEFAULT;
	}
}
