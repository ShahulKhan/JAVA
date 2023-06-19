package week2.day4;

import java.util.Arrays;

public class AnagramM1 {

public static void main(String[] args) {
	
	// Declaring 2 Strings
	String str1="race";
	String str2="care";
	
	// Comparing both string's length
	if(str1.length() == str2.length() ) {
		System.out.println("length are equal");
	}
	else {
		System.out.println("length are Not equal");
	}
			
	// Convert both strings into array
	char[] charArray1=str1.toCharArray();		
	char[] charArray2=str2.toCharArray();
			
	// Arrange in ascending order
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
			
	// Comparing both the string
	if(Arrays.equals(charArray1, charArray2)) {
		
		// If it match the given string is anagram
		System.out.println("The given string is anagram");
	}
	else {
	// If it doesn't match the given string is not anagram
		System.out.println("not Anagram");
	}
		
}

}
