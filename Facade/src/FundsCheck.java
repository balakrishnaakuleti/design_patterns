
public class FundsCheck {

	int balance =1000;
	
	public void displayBalance() {
		System.out.println("Balance in your account is : " +balance);
	}

	public boolean fundsAvailable(int amount) {
		if(balance >=amount){
			System.out.println("Funds available.");
			return true;
		}
		System.out.println("Funds unavailable.");
		return false;
	}

	public void withdraw(int amount) {
		balance -= amount;
		System.out.println("Withdraw of amount "+amount+" is successful.");
		System.out.println("New balance in your account is : " +balance);

	}

	public void deposit(int amount) {
		balance += amount;
		System.out.println("Deposit of amount "+amount+" is successful.");
		System.out.println("New balance in your account is : " +balance);

	}

}
