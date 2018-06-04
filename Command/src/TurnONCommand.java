
public class TurnONCommand implements Command{
	
	ElectronicDevice device;

	TurnONCommand(ElectronicDevice device){
		this.device=device;
	}
	
	@Override
	public void execute() {

		device.on();
		
	}

}
