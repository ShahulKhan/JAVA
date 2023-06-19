package week1.day2;

public class Sub2Num {
	
	// Method 1
	public void subm1 (int a, int b) {
		
		int c = a-b;
		
		System.out.println("c = " + c);
	}
	
	
	
	// Method 2
	public void subm2 (int a, int b) {
		
		// This wont give correct answer
		//System.out.println("a-b = " + a-b);
		
		// This will give correct answer
		System.out.println(a-b);	
	}
	
	
public static void main(String[] args) {
	
	Sub2Num mysub = new Sub2Num ();
		
	mysub.subm1(90, 50);
	mysub.subm2(100, 40);
}

}