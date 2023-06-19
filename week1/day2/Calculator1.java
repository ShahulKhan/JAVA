package week1.day2;

public class Calculator1 {
	
	public void addTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}

	public void subTwoNumber(int e,int f) {
		int g=f-e;
		System.out.println(g);
	}

	public static void mulTwoNumber(double i,double j) {
		double k=i*j;
		System.out.println(k);
	}

	public static void divTwoNumber(float x,float y) {
		float z=x/y;
		System.out.println(z);
	}

public static void main(String[] args) {
		
	Calculator1 calc = new Calculator1();
		
	calc.addTwoNumber(10, 20);
	calc.subTwoNumber(20, 40);
	
	mulTwoNumber(20.65, 59.09);
	divTwoNumber(34.789f,345.875f);
		
}

}