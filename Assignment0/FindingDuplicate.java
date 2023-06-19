package Assignment0;

public class FindingDuplicate {
	
public static void main(String[] args) {
	
	// Declare an Array as numb
	int[] numb = {1, 4, 6, 8, 2, 3, 4, 1, 3};
	
		//here 1, 4, & 8 are duplicate
	
		//Iterate the value from 0 to array length
		for (int i = 0; i < numb.length; i++) {
			
			// Nested for loop for comparison
			// it iterates from i+1 to Array Length
			for (int j = i+1; j < numb.length; j++) {
				 
				// Compare numb[i] and numb[j]
				if (numb[i]==numb[j]) {
					
					// Print numb[i]
					//print the duplicate
					System.out.println(numb[i]);
				}
			}
		}
	}
}
