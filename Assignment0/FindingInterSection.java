package Assignment0;

public class FindingInterSection {
	
	public static void main(String[] args) {
		
		// Declare two Arrays
		// 1st Array as 'a'
		// 2nd Array as 'b'
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		
		// Create Nested for loop
		// 1st for loop for a[]
		for(int i = 0 ; i < a.length ; i++){
			
			// 2nd for loop for b[]
			for(int j = 0 ; j < b.length ; j++)
			{ 
				// Set condition a is equal to condition b
				if(a[i]==b[j])
					
					// Print the result if a[i] is equal to b[i]
					System.out.println(b[i]);
				
			}
		}
	}
}
