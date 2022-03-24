package MeasurementUnits;

public class TemperatureConverter {
	public static String convertToCelcius(String input) {
		String tempConverterArray[] = new String[2];
		tempConverterArray = input.split(" ");
		
		if (tempConverterArray[1].equals("F")) {
			double temp = Double.parseDouble(tempConverterArray[0]);
			double Celcius = (temp - 32) * 5 / 9;
			String celciusString = String.valueOf(Celcius);
			return (celciusString + " C");
		} 
		else if (tempConverterArray[1].equals("K")) {
			double temp = Double.parseDouble(tempConverterArray[0]);
			double Celcius = temp - 273;
			String celciusString = String.valueOf(Celcius);
			return (celciusString + " C");
		} 
		else {
			double temp = Double.parseDouble(tempConverterArray[0]);
			double Celcius = temp;
			String celciusString = String.valueOf(Celcius);
			return (celciusString + " C");
		}

	}
	public static String convertToFarenheit(String input) {
		String tempConverterArray[] = new String[2];
		tempConverterArray = input.split(" ");
		
		if (tempConverterArray[1].equals("C")) {
			double temp = Double.parseDouble(tempConverterArray[0]);
			double Farenheit = (temp * 9 / 5) + 32;
			String farenheitString = String.valueOf(Farenheit);
			return (farenheitString + " F");
		} 
		else {
			double temp = Double.parseDouble(tempConverterArray[0]);
			double Farenheit = temp;
			String farenheitString = String.valueOf(Farenheit);
			return (farenheitString + " F");
		} 

	}
}
