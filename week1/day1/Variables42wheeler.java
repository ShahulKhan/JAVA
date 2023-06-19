package week1.day1;

public class Variables42wheeler {
	
	int noOfWheels=2;
	short noOFMirrors=2;
	long chassisNumber=78549328756526l;
	boolean isItPunctured=true;
	String bikeName="YamahaRX100";
	double ranKM=22348.57;

public static void main(String[] args) {
		
	Variables42wheeler myBike =new Variables42wheeler();
		
		System.out.println("Bike Name = " + myBike.bikeName);
		System.out.println("chassis Number = " +myBike.chassisNumber);
		System.out.println("isItPunctured = " +myBike.isItPunctured);
		System.out.println("ranKM = "+myBike.ranKM);
		System.out.println("noOfwheels = "+myBike.noOfWheels);
		System.out.println("noOfMirrors = "+myBike.noOFMirrors);
		
}	

}
