
public class BankingFacadeTest {

	public static void main(String[] args) {
		BankingFacade facade = new BankingFacade(12345, 67890);
		facade.displayBalance();
		facade.withDrawCash(400);
		facade.deposit(200);
		
		BankingFacade facade2 =new BankingFacade(12345, 6789);
		facade2.displayBalance();
		facade2.withDrawCash(400);
		facade2.deposit(200);
	}
	
}
