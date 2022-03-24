package MeasurementUnits;

public class WeightConverter {
	public static String convertGramToKilogram(String a) {
		String weightConverterArray[] = new String[2];
		weightConverterArray = a.split(" ");
		if (weightConverterArray[1].equals("g")) {
			double gram = Double.parseDouble(weightConverterArray[0]);
			double temp = gram / 1000;
			String KilogramString = String.valueOf(temp);
			return (KilogramString + " Kg");
		} else {
			double gram = Double.parseDouble(weightConverterArray[0]);
			double temp = gram;
			String KilogramString = String.valueOf(temp);
			return (KilogramString + " Kg");
		}
	}
	public static String convertKilogramToGram(String a) {
		String weightConverterArray[] = new String[2];
		weightConverterArray = a.split(" ");
		if (weightConverterArray[1].equals("Kg")) {
			double kilogram = Double.parseDouble(weightConverterArray[0]);
			double temp = kilogram * 1000;
			String GramString = String.valueOf(temp);
			return (GramString + " g");
		} else {
			double kilogram = Double.parseDouble(weightConverterArray[0]);
			double temp = kilogram;
			String GramString = String.valueOf(temp);
			return (GramString + " g");
		}
	}
}
