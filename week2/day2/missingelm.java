package week2.day2;

import java.util.Arrays;

public class missingelm {
	public static void main(String[] args) {
		int[] number = {1, 4, 8, 2, 3, 6, 7};
		//Missing number is 5

		Arrays.sort(number);
		//Sort the Array in Ascending order
		
		int sum1=0;
		for (int i = 1; i <= 8; i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		
		int sum2=0;
		for (int i = 0; i < number.length; i++) {
			sum2=sum2+number[i];
		}
		System.out.println(sum2);
			
		int sum3=sum1-sum2;
		System.out.println("Missing elements is " + sum3);
		}
	}

