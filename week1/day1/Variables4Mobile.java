package week1.day1;

public class Variables4Mobile {
	
	String mobileBrandName="Apple";
	char logo='A';
	short noOfMobilePiece= 1;
	int modelNumber=60606060;
	long mobileImeiNumber=5642654132542398l;
	float mobilePrice=150000.00f;
	boolean isDamaged=false;

	public static void main(String[] args) {
		
		Variables4Mobile myNewMobile=new Variables4Mobile();
		
		System.out.println(myNewMobile.mobileBrandName);
		System.out.println("logo="+ myNewMobile.logo);
		System.out.println("noOfMobilePieces="+myNewMobile.noOfMobilePiece);
		System.out.println("modelNumber="+myNewMobile.modelNumber);
		System.out.println("ImeiNumber="+myNewMobile.mobileImeiNumber);
		System.out.println("Price="+myNewMobile.mobilePrice);
		System.out.println("isDamaged="+myNewMobile.isDamaged);
		
	}
}