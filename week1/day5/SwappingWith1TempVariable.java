package week1.day5;

public class SwappingWith1TempVariable {
	
public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		int c = b-a;
		b=c;
		a=a+b;
		System.out.println(a);
		System.out.println(b);
		
}

}
