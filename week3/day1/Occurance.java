package week3.day1;

public class Occurance {

public static void main(String[] args) {
	
	// Declare a variable with input as batman
	String name = "batman";
	
	// Declare another variable with input as 0
	int count = 0;
	
	// Convert from string to charArray
	char[] character = name.toCharArray();
	
	// Iterate the values
	for (int i = 0; i < character.length; i++) {
		// Compare the character with a
		if (character[i]=='a') {
			// Count the number of times is repeated
			count++;
		}					
	}
	// Print the count
	System.out.println(count);
}

}
