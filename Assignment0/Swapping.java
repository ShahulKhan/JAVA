package Assignment0;

public class Swapping {
	
public static void main(String[] args) {
	
	// Method 1
	
	// Declare a variable a
	// Give a value for a
	int a=10;
	
	// Declare a variable b
	// Give a value for b
	int b=20;
	
	// Declare a variable c
	// Make c = a
	int c=a;
	
	// Declare a variable d
	// Make d = b
	int d=b;
	
	// Make a = d
	a=d;
	
	// Make b = c
	b=c;
	
	// Print a and b
	System.out.println("a = " +a + "\n" +"b = " +b);
	
	
	
	
	
	
	
	// Method 2
	
	// Declare a variable x
	// Give a value to x
	int x = 10;
	
	// Declare a variable y
	// Give a value to y
	int y = 20;
	
	// Declare a variable as z
	int z = y-x;
	
	// Make y = z
	y=z;
	
	// Add x and y and assign it to x
	x=x+y;
	
	// Print x and y
	System.out.println("x = " + x);
	System.out.println("y = " + y);
	}
}