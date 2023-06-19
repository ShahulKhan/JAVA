package week2.day3;

public class PrintEachChar {
	
public static void main(String[] args) {
	
	String text = "Shahul Khan";
	
	char[] characters = text.toCharArray();
	
	for (int i = 0; i < characters.length; i++) {
		
		System.out.println(characters[i]);
	}
	
}

}
