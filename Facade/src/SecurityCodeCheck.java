
public class SecurityCodeCheck {

	int securityCode = 67890;
	
	public boolean isSecurityCodeCorrect(int securityCode) {
		if(this.securityCode == securityCode ){
			System.out.println("Security code is correct.");
			return true;
		}
		System.out.println("Security code is incorrect.");
		return false;
	}

}
