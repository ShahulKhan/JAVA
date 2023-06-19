package Assignment6;

public class Desktop extends Computer {
	
	public void desktopSize(){
        System.out.println("Desktop size");
    }
	
public static void main(String[] args) {
	
	Desktop lap  = new Desktop ();
	
	// Single inheritance
	lap.desktopSize();
	lap.computerModel();
}

}
