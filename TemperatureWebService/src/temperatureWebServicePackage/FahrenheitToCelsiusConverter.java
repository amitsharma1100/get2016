package temperatureWebServicePackage;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class FahrenheitToCelsiusConverter {
	
	@WebMethod
	public float convertFahrenheitToCelsius(float fahrenheit) {
		float celsius = ((fahrenheit - 32)*5)/9;
		return celsius;
	}
}
