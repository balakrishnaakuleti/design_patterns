import java.util.ArrayList;
import java.util.List;

public class CommandTest {

	public static void main(String[] args) {

		ElectronicDevice tv = TVRemote.getTV();
		RemoteButton onButton = new RemoteButton(new TurnONCommand(tv));
		RemoteButton offButton = new RemoteButton(new TurnOFFCommand(tv));
		RemoteButton volUpButton = new RemoteButton(new TurnVolumeUpCommand(tv));
		RemoteButton volDownButton = new RemoteButton(new TurnVolumeDownCommand(tv));
		
		onButton.press();
		volUpButton.press();
		volUpButton.press();
		volUpButton.press();
		volUpButton.press();
		volUpButton.press();
		volUpButton.press();
		volUpButton.press();
		volDownButton.press();

		ElectronicDevice radio = new Radio();
		List<ElectronicDevice> list = new ArrayList<ElectronicDevice>();
		list.add(tv);
		list.add(radio);
		RemoteButton swtichOffAll = new RemoteButton(new TurnAllOff(list));
		swtichOffAll.press();
		

	}
	
}
