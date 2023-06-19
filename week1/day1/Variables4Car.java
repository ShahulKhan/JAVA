package week1.day1;

public class Variables4Car {
	
	int noOfWheels = 4;
	short noOfMirrors = 3;
	long chassisNumber =78549328756526l;
	boolean isItPunctured = true;
	String carName = "MercedesGWagon";
	double ranKM=1077.00;

	public static void main(String[] args) {
		
		Variables42wheeler myCar =new Variables42wheeler();
		
		System.out.println("Car Name = " + myCar.bikeName);
		System.out.println("Chassis Number = " +myCar.chassisNumber);
		System.out.println("Is It Punctured = " +myCar.isItPunctured);
		System.out.println("Ran KM = "+myCar.ranKM);
		System.out.println("No Of Wheels = "+myCar.noOfWheels);
		System.out.println("No Of Mirrors = "+myCar.noOFMirrors);
			
	}
}
