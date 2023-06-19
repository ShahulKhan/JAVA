package week1.day1;

public class Methods4Mobile {
	public void unLock() {
		System.out.println("Unlock Mobile");
	}
	public void scroll() {
		System.out.println("Scroll the Page");
	}
	public void camera() {
		System.out.println("Take the Picture");
	}
	public void playSongs() {
		System.out.println("Play Songs");
	}
	public void Message() {
		System.out.println("Text Message");
	}
	public static void main(String[] args) {
		Methods4Mobile Apple=new Methods4Mobile();
		Apple.unLock();
		Apple.camera();
		Apple.scroll();
		Apple.playSongs();
	}
}