package week1.day5;

public class Star {
	
public static void main(String[] args) {
	
	// Nested for loop
	// for loop inside a for loop
	for (int i = 1; i <=5; i++) {
		
	for (int j = 1; j <=i; j++) {
		System.out.print("* ");
	}
	System.out.println();
	}

}

}