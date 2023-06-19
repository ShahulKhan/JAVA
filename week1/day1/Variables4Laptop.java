package week1.day1;

public class Variables4Laptop {
	
	String laptopBrandName="Apple";
	char logo='A';
	short noOfLaptopPiece= 350;
	int modelNumber=50002525;
	float laptopPrice=54499.99f;
	boolean isDamaged=false;
	String laptopColour="White";
	
	public void unLockScreen() {
		System.out.println("Unlock Screen");
	}
	
	public static void main(String[] args) {
		
		Variables4Laptop Apple=new Variables4Laptop();
		
		System.out.println("Laptop Brand = "+Apple.laptopBrandName);
		System.out.println("Laptop Logo = "+Apple.logo);
		System.out.println("Laptop Model Number = "+Apple.modelNumber);
		System.out.println("Laptop IS Damaged = "+Apple.isDamaged);
		System.out.println("Laptop Price = "+Apple.laptopPrice);
		
		Apple.unLockScreen();	

	}
}