package JavaProgramsPractice;

import java.util.Scanner;

public class PalindromeInRunTime {

public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the text");
	
	String nextInt = scan.next();
	
	int parseInt = Integer.parseInt(nextInt);
	System.out.println("parseInt = " + parseInt);
	
	int originalNumber = parseInt;
	
	int sum = 0;
	
	while (parseInt > 0) {
		int rem = parseInt%10;
		sum = sum*10+rem;
		parseInt = parseInt/10;
	}
	System.out.println("sum = " + sum);
	
	if (originalNumber == sum) {
		System.out.println("The given number is a Palindrome");
	}
	else {
		System.out.println("The given number is not a Palindrome");

	}
}

}
