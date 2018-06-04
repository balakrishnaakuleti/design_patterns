
public abstract class EnemyShipBuilding {
	
	public abstract EnemyShip makeEnemyShip(String shipType);

	public EnemyShip orderTheShip(String shipType) {
		EnemyShip enemyShip=makeEnemyShip(shipType);
		enemyShip.makeShip();
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.damageHeroShip();
		return enemyShip;
	}

}
