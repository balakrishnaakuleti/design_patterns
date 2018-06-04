
public class ATMProxyTest {

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
		
		//Proxy design pattern related...
		System.out.println("\nPROXY DEISGN PATTERN");
		GetATMData proxy = new GetATMProxy();
		System.out.println("Balance in ATM through proxy : "+proxy.getCashInATM());
		System.out.println("Balance in ATM through proxy : "+proxy.getATMState());
		System.out.println("You Cant access other stuff using proxy.. Only these two.... ");

	}
}
