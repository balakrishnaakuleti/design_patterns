
public class GetATMProxy implements GetATMData{

	@Override
	public ATMState getATMState() {
		return new ATMMachine().getCurrentState();
	}

	@Override
	public int getCashInATM() {
		return new ATMMachine().getCashInATM();
	}

	
}
