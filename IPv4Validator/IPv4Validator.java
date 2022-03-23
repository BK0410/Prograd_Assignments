public class IPv4Validator {
	
	public boolean ValidateIpv4Address(String hostName) {
		
		try {
			String[] IPArray = hostName.split("[.]", 0);

			if (IPArray.length != 4)
				return false;

			int arrayLength = IPArray.length;
			int lastElement = Integer.parseInt(IPArray[arrayLength - 1]);

			if (lastElement == 255 || lastElement == 0)
				return false;

			for (int i = 0; i < IPArray.length; i++) {
				int temp = Integer.parseInt(IPArray[i]);
				if (temp < 0 || temp > 255)
					return false;
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}