package Assignment0;

import java.util.Arrays;

public class MissingElement {
	
	public static void main(String[] args) {
		
		//Missing number is 5
		int[] number = {1, 4, 8, 2, 3, 6, 7};
		
		//Sort the Array in Ascending order
		Arrays.sort(number);
		
		//Iterate the value from 0 to Array Length
		for (int i = 0; i < number.length; i++) {
			
			// If number[i] is not equal ti i+1
			if (number[i]!=i+1) {
				
			// Then print i+1
			System.out.println(i+1);
			break;
			}
		}
	}
}
