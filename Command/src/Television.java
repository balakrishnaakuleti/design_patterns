
public class Television implements ElectronicDevice{

	boolean powerButton;
	int volume=0;
	
	@Override
	public void on() {
		powerButton=true;
		System.out.println("TV Swtiched ON");
	}
	@Override
	public void off() {
		powerButton=false;
		System.out.println("TV Swtiched OFF");
	}
	@Override
	public void volUp() {
		System.out.println("TV Volume is increased to :"+(++volume));
	}
	@Override
	public void volDown() {
		System.out.println("TV Volume is increased to :"+--volume);
	}
}
