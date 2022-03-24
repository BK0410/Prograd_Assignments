package MeasurementUnits;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeightConverterTest {
	
	@Test
	public void test() {
		assertEquals("100.0 g",WeightConverter.convertKilogramToGram("0.1 Kg"));
		assertEquals("10.0 Kg",WeightConverter.convertGramToKilogram("10000 g"));
	}

}
