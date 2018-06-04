
public class ATMMachine implements ATMState, GetATMData{

	ATMState hasCard;
	ATMState noCard;
	ATMState hasPIN;
	ATMState noCash;
	
	ATMState currentState;
	int cashInMachine;
	boolean isPINCorrect;
	
	public ATMMachine(){
		
		cashInMachine=2000;
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasPIN = new HasPIN(this);
		noCash = new NoCash(this);
		
		currentState=noCard;
	}

	public ATMState getHasCard() {
		return hasCard;
	}

	public void setHasCard(ATMState hasCard) {
		this.hasCard = hasCard;
	}

	public ATMState getNoCard() {
		return noCard;
	}

	public void setNoCard(ATMState noCard) {
		this.noCard = noCard;
	}

	public ATMState getHasPIN() {
		return hasPIN;
	}

	public void setHasPIN(ATMState hasPIN) {
		this.hasPIN = hasPIN;
	}

	public ATMState getNoCash() {
		return noCash;
	}

	public void setNoCash(ATMState noCash) {
		this.noCash = noCash;
	}

	public ATMState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(ATMState currentState) {
		this.currentState = currentState;
	}

	public int getCashInMachine() {
		return cashInMachine;
	}

	public void setCashInMachine(int cashInMachine) {
		this.cashInMachine = cashInMachine;
	}

	public boolean isPINCorrect() {
		return isPINCorrect;
	}

	public void setPINCorrect(boolean isPINCorrect) {
		this.isPINCorrect = isPINCorrect;
	}

	@Override
	public void inserCard() {
		currentState.inserCard();
	}

	@Override
	public void ejectCard() {
		currentState.ejectCard();
	}

	@Override
	public void enterPIN(int pin) {
		currentState.enterPIN(pin);
	}

	@Override
	public void requestCash(int cashToWithDraw) {
		currentState.requestCash(cashToWithDraw);
	}

	@Override
	public ATMState getATMState() {
		return currentState;
	}

	@Override
	public int getCashInATM() {
		return cashInMachine;
	}
	
	
}
