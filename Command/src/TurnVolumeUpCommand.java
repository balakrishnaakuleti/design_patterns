public class TurnVolumeUpCommand implements Command{
	
	ElectronicDevice device;

	TurnVolumeUpCommand(ElectronicDevice device){
		this.device=device;
	}
	
	@Override
	public void execute() {

		device.volUp();
		
	}

}
