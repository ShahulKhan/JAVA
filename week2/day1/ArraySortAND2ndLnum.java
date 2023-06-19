package week2.day1;

import java.util.Arrays;

public class ArraySortAND2ndLnum {
	
public static void main(String[] args) {
		
	int[] num = {1, 5, 9, 2, 6, 3, 5, 4, 8, 7};
		
	Arrays.sort(num);
	System.out.println(Arrays.toString(num));
		
	int n = num.length;
	
	System.out.println("Length of the array = "+n);
	
	System.out.println(num[n-1]);
	System.out.println(num[n-2]);
		
	System.out.println("Second largest number =" + num[num.length-2]);
	
}

}
