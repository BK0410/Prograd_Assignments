import java.util.*;
public class ProductPairs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int arrLen = sc.nextInt();
		sc.nextLine();
		
		String myArr[] = new String[arrLen];
		System.out.print("Enter Space-separated inputs: ");
		myArr = sc.nextLine().split(" ");
		
		System.out.print("Enter Product: ");
		int k = sc.nextInt();
		
		HashSet counter = new HashSet<>();
		
		for(int i = 0;i<arrLen;i++) {
			for(int j = i+1;j<arrLen;j++) {
				if(i==j) {
					continue;
				}
				else {
					if(Integer.parseInt(myArr[i]) * Integer.parseInt(myArr[j]) == k) {
						counter.add(Integer.parseInt(myArr[i]));
						counter.add(Integer.parseInt(myArr[j]));						
						continue;
					}
				}
			}
		}
		
		System.out.println("Number of unique pairs: " + counter.size()/2);
	}
}
