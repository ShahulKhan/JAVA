package JavaProgramsPractice;

import java.util.Iterator;
import java.util.Scanner;

public class FebonacciInRunTime {

public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the input");
	String nextInt=scan.next();
	
	int parseInt=Integer.parseInt(nextInt);
	
	int range=parseInt;
	
	int value1=0;
	int value2=1;
	int sum=0;
	
	for (int i=0;i<range;i++) {
		sum=value1+value2;
		value1=value2;
		value2=sum;
		System.out.println(sum);
	}

}

}
