
public class NoCard implements ATMState {

	ATMMachine machine;
	
	public NoCard(ATMMachine machine){
		this.machine=machine;
	}
	
	@Override
	public void inserCard() {
		System.out.println("Card inserted...");
		machine.setCurrentState(machine.getHasCard());
	}

	@Override
	public void ejectCard() {
		System.out.println("No card in the machine to eject.");
	}

	@Override
	public void enterPIN(int pin) {
		System.out.println("No card in machine. You should first insert a card to enter the pin.");
	}

	@Override
	public void requestCash(int cashToWithDraw) {
		System.out.println("No card in machine. You should first insert a card to request for cash.");
		
	}



}
