package week2.day2;

import java.util.Arrays;


public class MissingElement {
	//4 types to find missing elements
	//n*n+1
	//
	//
	//
	
public static void main(String[] args) {
	int[] number = {1, 4, 8, 2, 3, 6, 7};
	//Missing number is 5
	
	Arrays.sort(number);
	//Sort the Array in Ascending order
	
	for (int i = 0; i < number.length; i++) {
		//Iterate the value from 0 to Array Length
			
			if (number[i]!=i+1) {
				System.out.println(i+1);
				break;
				}
			}
	}
}