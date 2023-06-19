package JavaProgramsPractice;

import java.util.Scanner;

public class FactorialInRunTime {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the input");
	
	String nextInt = scan.next();
	
	int parseInt = Integer.parseInt(nextInt);
	
	int a = 1;
	
	for (int i = parseInt; i > 0; i--) {
		a = a*i;
		System.out.println(a);
	}
	
}

}
