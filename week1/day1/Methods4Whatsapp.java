package week1.day1;

public class Methods4Whatsapp {
	
	public void openWhatsup() {
		System.out.println("Open Whatsup");
	}
	
	public void sendText() {
		System.out.println("Send Text Messages");
	}
	
	public void videoCall() {
		System.out.println("Video Call");
	}
	
	public void audioCall() {
		System.out.println("Audio Call");
	}
	
	public void shareImages() {
		System.out.println("Share Images");	
	}
	
	public void shareFiles() {
		System.out.println("Share Files");
	}
	
	public void upLoadStatus() {
		System.out.println("Upload Status");
	}
	
	public static void main(String[] args) {
		
		Methods4Whatsapp yoWhatsApp=new Methods4Whatsapp();
		
		yoWhatsApp.openWhatsup();
		yoWhatsApp.sendText();
		yoWhatsApp.shareImages();
		yoWhatsApp.shareFiles();
		yoWhatsApp.videoCall();
		yoWhatsApp.audioCall();
		yoWhatsApp.upLoadStatus();
		
	}
}