package Assignment0;

public class Factorial {
	
	public static void main(String[] args) {
		
		// Declare a variable as fact
		int fact = 1;
		
		// Iterate from 7 to 1 in decrement mode
		for (int i = 7; i > 0; i--) {
			
			// Multiply fact with iterated value of i
			fact = fact*i;
			
			// Print fact
			System.out.println(fact);
			
		}
	}
}
