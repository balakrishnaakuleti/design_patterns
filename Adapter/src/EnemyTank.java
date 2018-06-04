import java.util.Random;

public class EnemyTank implements EnemyAttacker{

	Random random = new Random();
	String driver ;
	
	@Override
	public void attack() {
		int damage = random.nextInt(10)+1;
		System.out.println("Tank attacked enemy and caused damage of "+damage+" units");
	}

	@Override
	public void stepForward() {
	
		int distance = random.nextInt(10)+1;
		System.out.println("Tank stepped forward by "+distance+" feets");
	
	}

	@Override
	public void setDriver(String driver) {
		this.driver= driver;
		System.out.println("Tank has been assinged the driver "+driver);
	}

}
