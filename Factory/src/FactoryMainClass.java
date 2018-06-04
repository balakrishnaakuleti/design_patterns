import java.util.Scanner;

public class FactoryMainClass {
	public static void main(String[] args) {
		EnemyShipFactory factory = new EnemyShipFactory();
		EnemyShip enemyShip = null;
		enemyShip = factory.makeEnemyShop("U");
		performOperationsOnShip(enemyShip);
		System.out.println("USING SCANNER");
		Scanner input = new Scanner(System.in);
		System.out.println("What type of ship do you need . U / R / B ? : ");
		String option ="";
		if(input.hasNextLine()){
			option = input.nextLine();
			System.out.println(option);
			enemyShip= factory.makeEnemyShop(option);
			performOperationsOnShip(enemyShip);
		}
	}

	private static void performOperationsOnShip(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.attackHeroShip();
	}
}
