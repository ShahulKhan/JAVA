package JavaProgramsPractice;

public class Factorial {

public static void main(String[] args) {

	int range = 5;
	
	int a = 1;
	
	for (int i = range; i > 0; i--) {
		a = a*i;
		System.out.println(a);
	}
	
	System.out.println(a);
}
	
	
}