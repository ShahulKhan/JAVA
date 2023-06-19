package Assignment0;

import java.util.Arrays;

public class SecondLargeNum {
	
	public static void main(String[] args) {	
	
	// Declare an Array as num
	int num[]= {1,5,9,2,6,3,5,4,8,7,3};
	
	// sort the array
	// Arrays.sort is used to rearrange the values in ascending order
	Arrays.sort(num);
	
	// Iterate and Rearrange the values in ascending order
	for (int i = 0; i < num.length; i++) {
		
	// Print the result
	System.out.println(num[i]);
	}
	
	// Print the second largest value using arithmetic operators
	System.out.println("Second larest number is : "+num[num.length-2]);
	}

}
