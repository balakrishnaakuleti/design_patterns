
public class HasCard implements ATMState {
	
	ATMMachine machine;
	
	public HasCard(ATMMachine machine){
		this.machine=machine;
	}

	@Override
	public void inserCard() {
		System.out.println("Card already inserted.");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected");
		machine.setCurrentState(machine.getNoCard());
		
	}

	@Override
	public void enterPIN(int pin) {
		if(pin == 1234){
			System.out.println("PIN is correct.. !!!");
			System.out.println("Card Ejected..");
			machine.setPINCorrect(true);
			machine.setCurrentState(machine.getHasPIN());
		}
		else{
			machine.setPINCorrect(false);
			System.out.println("PIN is incorrect.... XXX");
			System.out.println("Card Ejected...");
			machine.setCurrentState(machine.getNoCard());
		}
	}

	@Override
	public void requestCash(int cashToWithDraw) {
		System.out.println("PIN is not entered yet.");
	}


}
