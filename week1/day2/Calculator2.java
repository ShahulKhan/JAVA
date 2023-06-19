package week1.day2;

public class Calculator2 {
	
	public int addTwoNumber(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public void subTwoNumber(int sum, int b) {
		int c=sum-b;
		System.out.println("C = " + c);
	}
	
public static void main(String[] args) {
	
	Calculator2 cal=new Calculator2();
	
	int sum = cal.addTwoNumber(20, 20);
	
//	int a = sum + sum;
//	System.out.println(a);
	
	System.out.println("Sum = " + sum);
	cal.subTwoNumber(sum, 10);
	
}
	
}
