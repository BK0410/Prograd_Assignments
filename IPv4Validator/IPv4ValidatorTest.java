import static org.junit.Assert.*;
import org.junit.Test;

public class IPv4ValidatorTest {

	IPv4Validator validatorObject = new IPv4Validator();
	
	@Test
	public void IPv4ValidatorTest() {			
			assertTrue(validatorObject.ValidateIpv4Address("1.1.1.1"));
			assertTrue(validatorObject.ValidateIpv4Address("192.168.1.1"));
			assertTrue(validatorObject.ValidateIpv4Address("10.0.0.1"));
			assertFalse(validatorObject.ValidateIpv4Address("255.255.255.255"));
			assertFalse(validatorObject.ValidateIpv4Address("11.77.88.0"));
			assertFalse(validatorObject.ValidateIpv4Address("0.0.0.0.0"));
	}
}