package Assignment0;

public class ReverseString {
	
	public static void main(String[] args) {
		
		// Declare aString as 'name'
		String name = "Mohammed Shahul Hameed";
		
		int length = name.length();
		
		// Convert name to Characters and store it in str
		char[] str = name.toCharArray();
		
		// Iterate str in decrement
		for (int i = str.length-1; i >=0 ; i--) {
			
		// Print iterated str
		System.out.print(str[i]);
		}
	}

}
