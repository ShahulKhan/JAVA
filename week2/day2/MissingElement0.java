package week2.day2;

import java.util.Arrays;

public class MissingElement0 {
	
public static void main(String[] args) {
		 
	int[] number =  {1,2,3,4,7,6,8};
	        
	// Arrange the values in ascending order
	Arrays.sort(number);

	// Compare the digits with iterated number using for loop
	for (int i = 0; i < number.length; i++) {
	     if(number[i] != i + 1){
	        	System.out.println("Missing element = " + (i+1));
	        break;
	     }
	}
	       
}

}
