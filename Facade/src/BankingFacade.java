
public class BankingFacade {

	int accountNumber;
	int securityCode;
	AccountNumberCheck numberCheck;
	SecurityCodeCheck securityCheck;
	FundsCheck fundsCheck;

	public BankingFacade(int accountNumber, int securityCode) {

		this.accountNumber=accountNumber;
		this.securityCode= securityCode;
		numberCheck= new AccountNumberCheck();
		securityCheck = new SecurityCodeCheck();
		fundsCheck= new FundsCheck();
	}

	public void displayBalance() {
		
		if(numberCheck.isAccountActive(accountNumber) && securityCheck.isSecurityCodeCorrect(securityCode)){
			fundsCheck.displayBalance();
		}
		else{
			System.out.println("Cannot display balance for above reason.");
		}

	}

	public void withDrawCash(int amount) {
		
		if(numberCheck.isAccountActive(accountNumber) && securityCheck.isSecurityCodeCorrect(securityCode) && fundsCheck.fundsAvailable(amount)){
			fundsCheck.withdraw(amount);
		}		
		else{
			System.out.println("Cannot withdraw the amount for the above reason");
		}

	}

	public void deposit(int amount) {
		
		if(numberCheck.isAccountActive(accountNumber) && securityCheck.isSecurityCodeCorrect(securityCode)){
			fundsCheck.deposit(amount);
		}
		else{
			System.out.println("Cannot deposit the amount for the above reason.");
		}

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	}

}
