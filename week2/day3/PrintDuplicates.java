package week2.day3;

public class PrintDuplicates {
	
	public static void main(String[] args) {
		
		int[] array1 = { 2, 1, 4, 3, 5, 9, 7, 3, 4 };
		
		int count = 0;
		
		for (int i = 0; i < array1.length; i++) {
			count = 1;
			for (int j = 0; j < array1.length; j++) {
				
				if (array1[i] == array1[j]) {
					count++;
					array1[j] = 6;
				}
			}
			
			if(count > 1 && array1[i]!= 6) {
				System.out.println(array1[i]);
			}
		}
		
	}

}
