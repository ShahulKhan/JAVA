package week2.day3;

public class PrintInReverse {
	
public static void main(String[] args) {
	
	String str = "Mohammed Shahul Hameed";
	
	int length = str.length();
	
	char[] name = str.toCharArray();
	
	for (int i =name.length-1;i>=0; i--) {
		System.out.print(name[i]);
	}
	
}

}

