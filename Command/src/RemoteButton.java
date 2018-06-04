
public class RemoteButton {

	Command command;
	RemoteButton(Command command){
		this.command=command;
	}
	
	public void press(){
		System.out.println("Button pressed");
		command.execute();
	}
}
