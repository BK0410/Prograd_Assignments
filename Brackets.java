import java.util.*;

public class Brackets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Stack<Character> myStack = new Stack<>();
		
		HashMap<Character, Character> myMap = new HashMap<>();
		myMap.put('(', ')');
		myMap.put('[', ']');
		myMap.put('{', '}');
		
		char temp = 'a';
		
		System.out.print("Enter the input: ");
		String myStr = sc.nextLine();
		
		String myStrCopy = "";
		
		for (int i = 0; i < myStr.length(); i++) {
			
			if (myStr.charAt(i) == '[' || myStr.charAt(i) == '{' || myStr.charAt(i) == '(') {
				myStrCopy = myStrCopy + myStr.charAt(i);
				myStack.push(myStr.charAt(i));
			} 
			
			else if (myStr.charAt(i) == ']') {
				
				try {
					temp = myStack.pop();
				} 
				catch (EmptyStackException se) {
					myStrCopy = myStrCopy + '[' + ']';
					continue;
				}
				
				if (temp == '[') {
					myStrCopy = myStrCopy + myStr.charAt(i);
					continue;
				} else {
					myStrCopy = myStrCopy + myMap.get(temp);
					i = i - 1;
				}
			} 
			
			else if (myStr.charAt(i) == ')') {
				try {
					temp = myStack.pop();
				} 
				catch (EmptyStackException se) {
					myStrCopy = myStrCopy + '(' + ')';
					continue;
				}
				
				if (temp == '(') {
					myStrCopy = myStrCopy + myStr.charAt(i);
					continue;
				} else {
					myStrCopy = myStrCopy + myMap.get(temp);
					i = i - 1;
				}
			} 
			
			else if (myStr.charAt(i) == '}') {
				try {
					temp = myStack.pop();
				} catch (EmptyStackException se) {
					myStrCopy = myStrCopy + '{' + '}';
					continue;
				}
				if (temp == '{') {
					myStrCopy = myStrCopy + myStr.charAt(i);
					continue;
				} else {
					myStrCopy = myStrCopy + myMap.get(temp);
					i = i - 1;
				}
			}
		}
		
		int stackLen = myStack.size();
		
		if (myStack.size() > 0) {
			for (int i = 0; i < stackLen; i++) {
				temp = myStack.pop();
				myStrCopy = myStrCopy + myMap.get(temp);
				System.out.println(myStrCopy);
			}

		} else {
			System.out.println(myStrCopy);
		}

	}

}
