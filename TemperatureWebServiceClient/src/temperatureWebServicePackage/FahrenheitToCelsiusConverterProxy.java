package temperatureWebServicePackage;

public class FahrenheitToCelsiusConverterProxy implements temperatureWebServicePackage.FahrenheitToCelsiusConverter {
  private String _endpoint = null;
  private temperatureWebServicePackage.FahrenheitToCelsiusConverter fahrenheitToCelsiusConverter = null;
  
  public FahrenheitToCelsiusConverterProxy() {
    _initFahrenheitToCelsiusConverterProxy();
  }
  
  public FahrenheitToCelsiusConverterProxy(String endpoint) {
    _endpoint = endpoint;
    _initFahrenheitToCelsiusConverterProxy();
  }
  
  private void _initFahrenheitToCelsiusConverterProxy() {
    try {
      fahrenheitToCelsiusConverter = (new temperatureWebServicePackage.FahrenheitToCelsiusConverterServiceLocator()).getFahrenheitToCelsiusConverter();
      if (fahrenheitToCelsiusConverter != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fahrenheitToCelsiusConverter)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fahrenheitToCelsiusConverter)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fahrenheitToCelsiusConverter != null)
      ((javax.xml.rpc.Stub)fahrenheitToCelsiusConverter)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public temperatureWebServicePackage.FahrenheitToCelsiusConverter getFahrenheitToCelsiusConverter() {
    if (fahrenheitToCelsiusConverter == null)
      _initFahrenheitToCelsiusConverterProxy();
    return fahrenheitToCelsiusConverter;
  }
  
  public float convertFahrenheitToCelsius(float fahrenheit) throws java.rmi.RemoteException{
    if (fahrenheitToCelsiusConverter == null)
      _initFahrenheitToCelsiusConverterProxy();
    return fahrenheitToCelsiusConverter.convertFahrenheitToCelsius(fahrenheit);
  }
  
  
}