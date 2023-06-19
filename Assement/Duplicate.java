package Assement;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Duplicate {

public static void main(String[] args) {
	
	int[] number = {1,7,8,9,3,3,2,4,6,1,5,7,8};
	
	// Output = 1,3,7,8
	
	Set<Integer> num = new TreeSet<Integer>();
	
	for (int i = 0; i < number.length; i++) {
		num.add(number[i]);
	}
	
	System.out.println(num);
	
	//List<Integer>
		
	
}

}
