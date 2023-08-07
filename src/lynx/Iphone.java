package lynx;

public class Iphone implements Phone, Browser, MusicPlayer {

	@Override
	public void play() {
		System.out.println("Playing music");
	}

	@Override
	public void pause() {
		System.out.println("pausing music");
	}

	@Override
	public void selectTrack() {
		System.out.println("selecting music");
	}

	@Override
	public void showPage() {
		System.out.println("showing page");
	}

	@Override
	public void refreshPage() {
		System.out.println("refreshing page");
	}

	@Override
	public void addTab() {
		System.out.println("adding tab");
	}

	@Override
	public void call() {
		System.out.println("calling number");
	}

	@Override
	public void pickUp() {
		System.out.println("picking up call");
	}

	@Override
	public void startVoiceMail() {
		System.out.println("starting voicemail");
	}

}
