import java.util.*;

public class PerfectStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string having PR Combination: ");
		String myStr = sc.nextLine();
		int strLen = myStr.length();
		if (strLen > 1) {
//			if(myStr.matches("[^PR]+")){
//				System.out.println("Invalid Format. Only PR Combination is allowed.");
//				System.exit(0);
//			}
			perfectLoop: for (int i = 0; i < strLen - 1; i++) {
				if (myStr.indexOf("P") == 0 && myStr.indexOf("R") == 1) {
					myStr = myStr.substring(1);
					continue perfectLoop;
				} else if (myStr.indexOf("R") == 0 && myStr.indexOf("P") == 1) {
					myStr = myStr.substring(1);
					continue perfectLoop;
				} else if(myStr.indexOf("R") == 0 && myStr.indexOf("R") == 1){
					System.out.println("Imperfect");
					System.exit(0);
				}else if(myStr.indexOf("P") == 0 && myStr.indexOf("P") == 1){
					System.out.println("Imperfect");
					System.exit(0);
				}else {
					System.out.println("Invalid Format. Only PR Combination is allowed.");
					System.exit(0);
				}

			}
			System.out.println("Perfect");
			System.exit(0);
		}else {
			System.out.println("Invalid Format. Only PR Combination is allowed.");
			System.exit(0);
			}
		

	}
}
