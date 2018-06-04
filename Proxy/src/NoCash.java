
public class NoCash implements ATMState {

	ATMMachine machine;
	
	public NoCash(ATMMachine machine){
		this.machine=machine;
	}
	
	@Override
	public void inserCard() {
		System.out.println("We dont have money in the machie... Sorry for the inconvience....");
	}

	@Override
	public void ejectCard() {
		System.out.println("We dont have money in the machie... Sorry for the inconvience....");
	}

	@Override
	public void enterPIN(int pin) {
		System.out.println("We dont have money in the machie... Sorry for the inconvience....");
	}

	@Override
	public void requestCash(int cashToWithDraw) {
		System.out.println("We dont have money in the machie... Sorry for the inconvience....");
	}



}
