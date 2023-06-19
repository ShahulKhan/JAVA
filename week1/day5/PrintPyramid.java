package week1.day5;

public class PrintPyramid {

public static void main(String[] args) {
	
	// I for rows and j for columns      
   	// Row denotes the number of rows you want to print  
   	int i, j, row = 5; 
   	
   	//Outer loop work for rows  
   	for (i=0; i<row; i++)   
   	{  
   	   //inner loop work for space      
   	   for (j=row-i; j>1; j--) {  
   	       //prints space between two stars  
   	       System.out.print(" ");   
   	   }
   	   
   	   //inner loop for columns  
   	   for (j=0; j<=i; j++ ) {   
   	      //prints star      
   	      System.out.print("* ");   
   	   }  
   	  
   	//throws the cursor in a new line after printing each line  
   	System.out.println();   
   	}
}

}
