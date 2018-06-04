
public class TurnOFFCommand implements Command{
	
	ElectronicDevice device;

	TurnOFFCommand(ElectronicDevice device){
		this.device=device;
	}
	
	@Override
	public void execute() {

		device.off();
		
	}

}
