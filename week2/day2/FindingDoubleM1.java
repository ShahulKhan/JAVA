package week2.day2;

public class FindingDoubleM1 {
	
public static void main(String[] args) {
	
	int[] array1 = {7,8,4,3,9,1,1,7};
	    
	for (int i = 0; i <= array1.length-1; i++) {
	    System.out.println(array1[i]);
			
	    for (int j = i+1; j <= array1.length-1; j++) {
				
	    	if (array1[i]==array1[j]) {
				System.out.println(array1[i]);
			}
		}
	}
	
}

}
