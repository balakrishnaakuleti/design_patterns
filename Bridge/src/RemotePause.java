
public class RemotePause extends Remote{

	public RemotePause(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void ninePressed() {
		System.out.println("TV Paused.");
	}
}
