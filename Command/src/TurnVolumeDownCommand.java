public class TurnVolumeDownCommand implements Command{
	
	ElectronicDevice device;

	TurnVolumeDownCommand(ElectronicDevice device){
		this.device=device;
	}
	
	@Override
	public void execute() {

		device.volDown();
		
	}

}
