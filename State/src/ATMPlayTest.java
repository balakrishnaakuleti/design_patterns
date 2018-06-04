
public class ATMPlayTest {

	public static void main(String[] args) {
		
		ATMMachine machine = new ATMMachine();

		//One Plain Transaction
		machine.setCurrentState(machine.getNoCard());
		machine.inserCard();
		machine.enterPIN(1234);
		machine.requestCash(500);
		System.out.println("Remaining cahse in machine :"+machine.getCashInMachine());
		
		//Funds insufficient case
		machine.inserCard();
		machine.enterPIN(1234);
		machine.requestCash(5000);	
	}
}
