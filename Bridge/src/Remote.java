
public abstract class Remote {

	EntertainmentDevice device;
	
	public Remote(EntertainmentDevice device){
		this.device=device;
	}
	
	public void volUp(){
		device.fivePressed();
	}
	public void volDown(){
		device.sixPressed();
	}
	public void channelUp(){
		device.fivePressed();
	}
	public void channelDown(){
		device.fivePressed();
	}
	
	public abstract void ninePressed();
	
	public void deviceFeedback(){
		device.deviceFeedback();
	}
}
