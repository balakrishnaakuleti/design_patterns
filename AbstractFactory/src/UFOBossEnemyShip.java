
public class UFOBossEnemyShip extends EnemyShip {

	EnemyShipFactory shipFactory;
	
	public UFOBossEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory=shipFactory;
	}

	@Override
	public void makeShip() {
		System.out.println("Making enemy ship"+ name);
		engine=shipFactory.addEngine();
		weapon=shipFactory.addWeapon();
	}

}
