package week2.day2;

public class FindingDoubleM2 {
	
public static void main(String[] args) {
		
	//here 1, 4, & 8 are duplicate
	int[] numb = {1, 4, 6, 8, 2, 3, 4, 1, 8};
		
	//Iterate the value 0 to array length
	for (int i = 0; i < numb.length; i++) {
			
		//add the inner loop , it starts with j=i+1
		for (int j = i+1; j < numb.length; j++) {
				
				//why we use nested for loop here
				//1st the inner for loop get completed
				//then only it will move to the  outer  loop
				//for example 1st it will compare 1 with 4  
			
			//check both Array are equal
			if (numb[i]==numb[j]) {
				
				//print the duplicate 
				System.out.println(numb[i]);
					
			}
				
		}
			
	}

}
}
