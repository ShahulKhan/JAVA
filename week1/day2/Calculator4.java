package week1.day2;

public class Calculator4 {
	
	public void subTwoNumbers(int a,int b) {
		int c=b-a;
		System.out.println(c);
	}
	
	public void mulTwonumbers(int a,int b) {
		
		int c=a*b;
		System.out.println(c);
	}
	
	public void divTwoNumbers(int a,int b) {
		int c=b/a;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Calculator4 mycalc = new Calculator4();
		
		mycalc.subTwoNumbers(15, 30);
		mycalc.mulTwonumbers(3, 6);
		mycalc.divTwoNumbers(5, 25);
		
	}
}
