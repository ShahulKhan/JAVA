package week2.day4;

import java.util.Scanner;

public class PalindromeNumbers {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Input");
	
	String nextInt = scan.next();
	
	int parseInt = Integer.parseInt(nextInt);
	System.out.println("ParseInt = " + parseInt);
	
	int originalNumber = parseInt;
	System.out.println("originalNumber = " + originalNumber);
	
	int sum = 0;
	
	while (parseInt>0) {
		int reminder = parseInt % 10;
		sum = sum * 10 + reminder;
		parseInt = parseInt / 10;
	}
	
	System.out.println("sum = " + sum);
	
	if (sum == originalNumber) {
		System.out.println("The given number is Palindrome");
	}
	
	else {
		System.out.println("The given number is not Palindrome");
	}
}

}
