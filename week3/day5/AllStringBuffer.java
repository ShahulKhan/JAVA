package week3.day5;

public class AllStringBuffer {
	
public static void main(String[] args) {
	
	StringBuffer buffer = new StringBuffer ("Test");
	buffer.append ("Leaf") ;
	System.out.println(buffer);
	
	StringBuffer insert = buffer.insert(0, "The ");
	System.out.println("Insert - " + insert);
	
	StringBuffer reverse = buffer.reverse();
	System.out.println(reverse);
	
	StringBuffer delete = buffer.delete(1,5);
	System.out.println(delete);
	
	StringBuilder builder = new StringBuilder ("Anil");
	StringBuilder append = new StringBuilder ("Kumar");
	System.out.println(append);
	
}

}
