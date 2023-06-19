package week1.day1;

public class VariablesAndMethods4Bycycle {
	
	int noOfWheels=2;
	short noOFMirrors=2;;
	boolean isPunctured=true;
	String cycleName="Hero";
	char logo='H';
	String  cycleColour="Red";
	
	public void pedal() {
		System.out.println("Pedal up");
	}
	
	public void bell() {
		System.out.println("Ring Bell");
	}
	
	public void holdBreak() {
		System.out.println("Apply Break");
	}
	
	public static void main(String[] args) {
		
		VariablesAndMethods4Bycycle byCycle=new VariablesAndMethods4Bycycle();
		
		 System.out.println("Cycle Name = "+byCycle.cycleName);
		 System.out.println("No of wheels = "+byCycle.noOfWheels);
		 System.out.println("Is Puntured = "+byCycle.isPunctured);
		 System.out.println("Logo = "+byCycle.logo);
		 System.out.println("No of Mirrors = "+byCycle.noOFMirrors);
		 System.out.println("Cycle Colour = "+byCycle.cycleColour);
		 
		   byCycle.pedal();
		   byCycle.bell();
		   byCycle.holdBreak();

	}
}
