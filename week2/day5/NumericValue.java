package week2.day5;

public class NumericValue {

public static void main(String[] args) {

	String input = "123AB456CD";
	
	String numbers = input.replaceAll("[^0-9]", "");
	System.out.println(numbers);
	
	String alphabets = input.replaceAll("[^A-Z]", "");
	System.out.println(alphabets);

}

}
