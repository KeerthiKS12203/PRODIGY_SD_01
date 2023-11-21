package pkg1;

public class TempConv {
	
	
	public String convert(double t, char s){
		if(s=='F') {
			return "\n Celcius: "+FarenheitToCelcius(t)+"°C     Kelvin: "+FarenheitToKelvin(t)+"K";
		}else if(s=='C') {
			return "\n Farenheit: "+CelciusToFarenheit(t)+"°F     Kelvin: "+CelciusToKelvin(t)+"K";
		}else if(s=='K') {
			return "\n Farenheit: "+KelvinToFarenheit(t)+"°F     Celcius: "+KelvinToCelcius(t)+"°C";
		}
		return null;
	}
	public double FarenheitToCelcius(double f) {
		return (f-32)/1.8;
	}public double CelciusToFarenheit(double c) {
		return 1.8*c+32;
	}public double FarenheitToKelvin(double f) {
		return (f-32)/1.8+273.15;
	}public double KelvinToFarenheit(double k) {
		return (k-273.15)*1.8+32;
	}public double CelciusToKelvin(double c) {
		return c+273.15;
	}public double KelvinToCelcius(double k) {
		return k-273.15;
	}
}
