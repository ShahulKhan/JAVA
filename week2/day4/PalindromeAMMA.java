package week2.day4;

public class PalindromeAMMA {
public static void main(String[] args) {
	
	String text = "amma";
	
	String rev = "";
	
	char[] charArray = text.toCharArray();
	
	for (int i = charArray.length - 1; i >= 0 ; i--) {
		rev = rev + charArray[i];
	}
	
	//if ()
	//if (rev.equals(text))
	if (text.equals(rev)) {
		System.out.println("The given String is Palindrome");
	}
	
	else {
		System.out.println("The given String is not Palindrome");
	}
}
}