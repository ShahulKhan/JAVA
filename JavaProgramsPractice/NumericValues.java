package JavaProgramsPractice;

public class NumericValues {
public static void main(String[] args) {
	
	String s = "123AB456CD";
	
	String num=s.replaceAll("[^0-9]","");
	System.out.println(num);
	
	String alp=s.replaceAll("[^A-Z]","");
	System.out.println(alp);
}
}
