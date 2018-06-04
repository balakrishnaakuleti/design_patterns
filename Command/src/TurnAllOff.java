import java.util.ArrayList;
import java.util.List;

public class TurnAllOff implements Command{
	
	List<ElectronicDevice> devices= new ArrayList<>();

	TurnAllOff(List<ElectronicDevice> devices){
		this.devices=devices;
	}
	
	@Override
	public void execute() {
		
		for(ElectronicDevice device: devices){
			device.off();
		}
		
	}

}
