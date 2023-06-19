package Assignment0;

public class Palindrome {
	
	public static void main(String[] args) {
	
		String text = "mygym";
		
		
		String rev = "";
		
		char[] charArray = text.toCharArray();
		
		for (int i = charArray.length-1; i >= 0; i--) {
			rev = rev + charArray[i];
		}
		
		if (text.equals(rev)) {
			System.out.println("mygym is a Palindrome");
		}
		else {
			System.out.println("mygym is not a Palindrome");
		}
	}		
}		