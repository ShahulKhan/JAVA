package JavaProgramsPractice;

import java.util.Iterator;

public class Palindrome {

public static void main(String[] args) {
	
	String text1 = "AMMA";
	String text2 = "";
	
	char[] charArray = text1.toCharArray();
	
	for (int i = 0; i < charArray.length; i++) {
		text2=text2+charArray[i];
	}
	
	System.out.println("text2 = " + text2);
	
	if (text2.equals(text1)) {
		System.out.println("AMMA is a Palindrome");
	} else {
		System.out.println("AMMA is not a Palindrome");
	}
}

}
