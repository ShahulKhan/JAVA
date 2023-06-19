package week1.day4;

public class PrintEvenNum {
	
public static void main(String[] args) {
		
	// Method 1
	for (int i = 0; i <=20; i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	
	
	
	// Method 2
	for (int i = 0; i <=20; i++) {
		if(i%2!=1) {
			System.out.println(i);
		}
	}
		
}

}
