package lynx;

class Main {
	public static void main(String args[]) {
		
		Iphone device = new Iphone();

		device.addTab();
		device.refreshPage();
		device.showPage();

		device.play();
		device.pause();
		device.selectTrack();
		
		device.call();
		device.pickUp();
		device.startVoiceMail();
		
	}
}
