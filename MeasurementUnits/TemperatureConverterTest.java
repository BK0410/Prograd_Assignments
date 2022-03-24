package MeasurementUnits;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureConverterTest {
	
	TemperatureConverter tempConverter = new TemperatureConverter();
	@Test
	public void test() {
		assertEquals("32.0 F",tempConverter.convertToFarenheit("0 C"));
		assertEquals("-273.0 C",tempConverter.convertToCelcius("0 K"));
	}

}
