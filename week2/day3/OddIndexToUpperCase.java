package week2.day3;

public class OddIndexToUpperCase {
	
	 public static void main(String[] args) {
	        String test = "changename";
	        
	        // Convert the string into character array
	        char[] ch = test.toCharArray();
	        
	        // Access the elements in the array by iterating them
	        for (int i = 0; i < ch.length; i++) {
	        	
	            // Check the condition
	            if (i % 2 != 0){
	            	
	                // Using character class for changing character to UPPERCASE
	                ch[i] = Character.toUpperCase(ch[i]);
	            }
	        }
	        
	        // Printing the new string
	        System.out.print(ch);

	 }


}
