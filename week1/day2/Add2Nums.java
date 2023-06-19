package week1.day2;

public class Add2Nums {

	// Method 1
	public void addm1 (int a, int b) {
		
	int c = a + b;
	
	System.out.println("c = " + c);
	}
	
	
	
	// Method 2
	public void addm2 (int a, int b) {
	
	// This wont give correct answer
	//System.out.println("a+b = " + a+b);

	//this will give correct answer
	System.out.println(a+b);
	}
	
	
public static void main(String[] args) {
	
	Add2Nums myadd = new Add2Nums();
	
	myadd.addm1(10, 20);
	
	myadd.addm2(11, 22);
	
}	
	
}
