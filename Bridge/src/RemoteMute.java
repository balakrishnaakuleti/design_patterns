
public class RemoteMute extends Remote{

	public RemoteMute(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void ninePressed() {
		System.out.println("TV Muted.");
	}

}
