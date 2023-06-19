package week1.day2;

public class Calculator3 {
	
	public int addTwoNum(int a ,int b) {
		int c= a+b;
		System.out.println(c);
		return c;	
	}

	public void subTwoNum(int sum,int b) {
		int c=sum-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		Calculator3 myCalc = new Calculator3();
		
		int sum= myCalc.addTwoNum(25, 25);
		myCalc.subTwoNum(sum , 15);
	}

}
