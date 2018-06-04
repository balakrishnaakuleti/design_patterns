
public abstract class EntertainmentDevice {
	
	int deviceState;
	int maxSetting;
	int volume = 0;
	
	public EntertainmentDevice(int deviceState, int maxSetting){
		this.deviceState=deviceState;
		this.maxSetting=maxSetting;
	}
	
	public 	abstract void fivePressed();
	
	public abstract void sixPressed();
	
	public void sevenPressed(){
		System.out.println("Volume at "+ (++volume));
	}
	
	public void eightPressed(){
		System.out.println("Volume at "+ (--volume));

	}
	
	public void deviceFeedback(){
		if(deviceState<0 || deviceState>maxSetting){
			deviceState = 0;
		}
		System.out.println("Device is in channel : "+deviceState);
	}
	

}
