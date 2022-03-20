import java.util.*;

public class Palindrome {
	public static Boolean CheckForPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
			if (s.charAt(i) == s.charAt(j)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String myStr = sc.nextLine();
		
		int strLen = myStr.length();
		
		Boolean result = CheckForPalindrome(myStr);
		
		if (result == true) {
			System.out.println("Palindrome");
			System.exit(0);
		} 
		
		else {
			System.out.println("Not Palindrome");
			
			String temp = "";
			int i = 0;
			String strPal = myStr + temp;
			
			while (CheckForPalindrome(strPal) == false) {
				temp = myStr.charAt(i) + temp;
				strPal = myStr + temp;
				i++;
			}
			
			System.out.print("Transformed String: ");
			System.out.println(strPal);
			
		}

	}

}
