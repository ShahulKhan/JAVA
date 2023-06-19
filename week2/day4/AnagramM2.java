package week2.day4;

import java.util.Arrays;

public class AnagramM2 {

public static void main(String[] args) {

	String str1 = "race";
	String str2 = "care";
	
	if (str1.length()==str2.length()) {
	}
	
	char[] charArray1 = str1.toCharArray();
	char[] charArray2 = str2.toCharArray();
	
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	
	boolean equals = Arrays.equals(charArray1, charArray2);
	
	if (equals) {
		System.out.println("It is an Anagram");
	}
	else {
		System.out.println("It is not an Anagram");
	}
}

}
