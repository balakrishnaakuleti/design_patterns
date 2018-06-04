
public class DeviceTest {

	public static void main(String[] args) {
		
		System.out.println("Mute Device --------------------------------------------");
		Remote muteRemote = new RemoteMute(new TVDevice(0, 50));
		muteRemote.volUp();
		muteRemote.volDown();
		muteRemote.channelUp();
		muteRemote.channelDown();
		muteRemote.ninePressed();
		muteRemote.deviceFeedback();

		
		System.out.println("\nPause Device -------------------------------------------");
		Remote pauseRemote = new RemotePause(new TVDevice(12, 50));
		pauseRemote.volUp();
		pauseRemote.volDown();
		pauseRemote.channelUp();
		pauseRemote.channelUp();
		pauseRemote.channelUp();
		pauseRemote.channelUp();
		pauseRemote.channelUp();
		pauseRemote.channelUp();
		pauseRemote.channelDown();
		pauseRemote.ninePressed();
		pauseRemote.deviceFeedback();

	}
	
}
