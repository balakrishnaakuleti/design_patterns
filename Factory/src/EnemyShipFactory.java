
public class EnemyShipFactory {

	public EnemyShip makeEnemyShop(String option) {
		if (option.equals("U")) {
			return new UFOEnemyShip();
		} else if (option.equals("R") ){
			return new RocketEnemyShip();
		} else if (option.equals("B")) {
			return new BigEnemyShip();
		} else
			return null;
	}

}
