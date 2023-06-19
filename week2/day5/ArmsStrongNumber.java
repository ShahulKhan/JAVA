package week2.day5;

public class ArmsStrongNumber {

public static void main(String[] args) {

	int sum = 0;
	int value = 153;
	int input = value;
	
	while (value > 0) {
		
		int rem = value % 10;
		sum = sum + (rem * rem * rem) ;
		
		System.out.println(sum);
		
		input = input / 10;
	}
	
	//System.out.println(sum);
	
	if (input == sum) {
		System.out.println("is ArmsStrongNumber");
	}
	else {
		System.out.println("not an ArmsStrongNumber");
	}
	
}

}
