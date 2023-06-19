package week2.day4;

public class PalindromeMADAMA {
	
public static void main(String[] args) {
		 
	String text = "MADAMA";
	        
	// Initializing an empty string to store reversed characters
	String rev = "";
	        
	for (int i = text.length()-1; i >=0; i--) {
	    // Storing character in reverse
		rev = rev + text.charAt(i);
	}
	        
	// Comparing Strings
	if (text.equals(rev))
		System.out.println(text + " is palindrome");
	        
	else
	    System.out.println(text + " is not palindrome");
}

}
