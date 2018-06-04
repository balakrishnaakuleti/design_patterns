
public class HasPIN implements ATMState {

	ATMMachine machine;
	
	public HasPIN(ATMMachine machine){
		this.machine=machine;
	}
	
	@Override
	public void inserCard() {
		System.out.println("Card already inserted and PIN is also entered.");
	}

	@Override
	public void ejectCard() {
		System.out.println("Already ejected....");
	}

	@Override
	public void enterPIN(int pin) {
		System.out.println("Already PIN is entered.. You cannot enter twice.");
	}

	@Override
	public void requestCash(int cashToWithDraw) {
		if(machine.isPINCorrect){
			if(cashToWithDraw< machine.cashInMachine){
				System.out.println("Cash of "+cashToWithDraw+" is withdrawn.");
				machine.setCashInMachine(machine.getCashInMachine()-cashToWithDraw);
				machine.setCurrentState(machine.getNoCard());
			}
			else{
				System.out.println("No sufficient funds on the machine... ");
				machine.setCurrentState(machine.getNoCard());
			}
		}
		else{
			System.out.println("PIN is incorrect. Cannot proceed.");
			machine.setCurrentState(machine.getNoCard());
		}		
	}

}
