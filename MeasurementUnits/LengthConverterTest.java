package MeasurementUnits;

import static org.junit.Assert.*;

import org.junit.Test;

public class LengthConverterTest {
	LengthConverter length_converter = new LengthConverter();

	@Test
	public void test() {
		assertEquals("1.0 cm",length_converter.convertToCentimetre("1 cm"));
		assertEquals("1.0 m",length_converter.convertToMetre("100 cm"));
		assertEquals("0.001 Km",length_converter.convertToKilometre("100 cm"));
		assertEquals("2.0 m",length_converter.AdditionInMetres("1 m", "100 cm"));
		assertEquals("100200.0 cm",length_converter.AdditionInCentimetres("1 Km", "200 cm"));
		assertEquals("0.5 m",length_converter.SubtractionInMetres("1 m", "50 cm"));
		assertEquals("1900.0 cm",length_converter.SubtractionInCentimetres("2000 cm", "1 m"));
	}

}
