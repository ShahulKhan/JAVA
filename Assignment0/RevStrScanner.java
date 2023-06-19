package Assignment0;

import java.util.Scanner;

public class RevStrScanner {
	
	public static void main(String[] args) {
		
		// Create a new object for Scanner
		// Scanner is used to give values at runtime
		// Give input at Console
		Scanner scan = new Scanner(System.in);
		
		// 'Enter your name' will be shown in console 
		System.out.println("Enter Your Name");
		
		String nextLine = scan.nextLine();
		
		// Converting String to Characters
		char[] character = nextLine.toCharArray();
		
		// Iterate the Characters in Decrement
		for (int i = character.length-1; i >= 0 ; i--) {
			
		// Print character[i]
		System.out.println(character[i]);
		}
 	}

}
