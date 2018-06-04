
public interface ATMState {

	//Actions - inserting, ejecting, entering pin, requesting cash
	//States - NoCard, HasCard, HasPIN, NoCash
	void inserCard();
	void ejectCard();
	void enterPIN(int pin);
	void requestCash(int cashToWithDraw);
	
}
