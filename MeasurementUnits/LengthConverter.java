package MeasurementUnits;

public class LengthConverter {
	public static String convertToCentimetre(String s) {
		String lengthConverterArray[] = s.split(" ");
		if(lengthConverterArray[1].equals("Km")) {
			return (String.valueOf(Double.parseDouble(lengthConverterArray[0])*100000) + " cm");
		}
		else if(lengthConverterArray[1].equals("m")) {
			return (String.valueOf(Double.parseDouble(lengthConverterArray[0])*100) + " cm");
		}
		else {
			return (String.valueOf(Double.parseDouble(lengthConverterArray[0])*1) + " cm");
		}
}
	public static String convertToMetre(String s) {
		String lengthConverterArray[] = s.split(" ");
		if(lengthConverterArray[1].equals("Km")) {
			return (String.valueOf(Double.parseDouble(lengthConverterArray[0])*1000) + " m");
		}
		else if(lengthConverterArray[1].equals("cm")) {
			return (String.valueOf(Double.parseDouble(lengthConverterArray[0])/100) + " m");
		}
		else {
			return (String.valueOf(Double.parseDouble(lengthConverterArray[0])*1) + " m");
		}
}
	public static String convertToKilometre(String s) {
		String lengthConverterArray[] = s.split(" ");
		if(lengthConverterArray[1].equals("cm")) {
			return (String.valueOf(Double.parseDouble(lengthConverterArray[0])/100000) + " Km");
		}
		else if(lengthConverterArray[1].equals("m")) {
			return (String.valueOf(Double.parseDouble(lengthConverterArray[0])/1000) + " Km");
		}
		else {
			return (String.valueOf(Double.parseDouble(lengthConverterArray[0])*1) + " Km");
		}
}
	public static String AdditionInCentimetres(String a, String b) {
		String inputOne = convertToCentimetre(a);
		String inputTwo = convertToCentimetre(b);
		String inputOneArray[] = inputOne.split(" ");
		String inputTwoArray[] = inputTwo.split(" ");
		return String.valueOf(Double.parseDouble(inputOneArray[0]) + Double.parseDouble(inputTwoArray[0])) + " cm";
 	}
	public static String AdditionInKilometres(String a, String b) {
		String inputOne = convertToKilometre(a);
		String inputTwo = convertToKilometre(b);
		String inputOneArray[] = inputOne.split(" ");
		String inputTwoArray[] = inputTwo.split(" ");
		return String.valueOf(Double.parseDouble(inputOneArray[0]) + Double.parseDouble(inputTwoArray[0])) + " Km";
 	}
	public static String AdditionInMetres(String a, String b) {
		String inputOne = convertToMetre(a);
		String inputTwo = convertToMetre(b);
		String inputOneArray[] = inputOne.split(" ");
		String inputTwoArray[] = inputTwo.split(" ");
		return String.valueOf(Double.parseDouble(inputOneArray[0]) + Double.parseDouble(inputTwoArray[0])) + " m";
 	}
	public static String SubtractionInCentimetres(String a, String b) {
		String inputOne = convertToCentimetre(a);
		String inputTwo = convertToCentimetre(b);
		String inputOneArray[] = inputOne.split(" ");
		String inputTwoArray[] = inputTwo.split(" ");
		return String.valueOf(Double.parseDouble(inputOneArray[0]) - Double.parseDouble(inputTwoArray[0])) + " cm";
 	}
	public static String SubtractionInKilometres(String a, String b) {
		String inputOne = convertToKilometre(a);
		String inputTwo = convertToKilometre(b);
		String inputOneArray[] = inputOne.split(" ");
		String inputTwoArray[] = inputTwo.split(" ");
		return String.valueOf(Double.parseDouble(inputOneArray[0]) - Double.parseDouble(inputTwoArray[0])) + " Km";
 	}
	public static String SubtractionInMetres(String a, String b) {
		String inputOne = convertToMetre(a);
		String inputTwo = convertToMetre(b);
		String inputOneArray[] = inputOne.split(" ");
		String inputTwoArray[] = inputTwo.split(" ");
		return String.valueOf(Double.parseDouble(inputOneArray[0]) - Double.parseDouble(inputTwoArray[0])) + " m";
 	}

}
