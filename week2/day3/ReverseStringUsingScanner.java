package week2.day3;

import java.util.Scanner;

public class ReverseStringUsingScanner {

public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Your Name");
		
	String nextLine = scan.next();
		
	char[] character = nextLine.toCharArray();
	for (int i = character.length-1; i >= 0 ; i--) {
		System.out.print(character[i]);
	}
	
}

}
