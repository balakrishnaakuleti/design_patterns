
public class AccountNumberCheck {

	int accountNumber = 12345;
	
	public boolean isAccountActive(int accountNumber) {
		if(this.accountNumber == accountNumber ){
			System.out.println("Account is active.");

			return true;
		}
		System.out.println("Account is inactive.");
		return false;
	}
}
