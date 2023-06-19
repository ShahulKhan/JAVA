package week2.day1;

import java.util.Arrays;

public class ArraySort {

public static void main(String[] args) {
	
	int marks [] = {100, 99, 98, 97, 96};
	
	// To get the numbers in ascending order
	Arrays.sort(marks);

	// .length is nothing but size of the an Array
	// .length is used to get the size of an Array
	for (int i=0; i<marks.length; i++) {
		System.out.println(marks[i]);
	}
}

}
	    