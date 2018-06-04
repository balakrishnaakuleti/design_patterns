
public class Radio implements ElectronicDevice{

	boolean powerButton;
	int volume=0;
	
	@Override
	public void on() {
		powerButton=true;
		System.out.println("Radio Swtiched ON");
	}
	@Override
	public void off() {
		powerButton=false;
		System.out.println("Radio Swtiched OFF");
	}
	@Override
	public void volUp() {
		System.out.println("Radio Volume is increased to :"+(++volume));
	}
	@Override
	public void volDown() {
		System.out.println("Radio Volume is increased to :"+--volume);
	}

}
