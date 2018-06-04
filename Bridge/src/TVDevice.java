
public class TVDevice extends EntertainmentDevice{

	public TVDevice(int deviceState, int maxSetting) {
		super(deviceState, maxSetting);
	}

	@Override
	public void fivePressed() {
		System.out.println("Channel Up");
		deviceState++;
	}

	@Override
	public void sixPressed() {
		System.out.println("Channel Down");
		deviceState--;
	}

}
