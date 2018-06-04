
public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	public EnemyShip makeEnemyShip(String shipType) {
		EnemyShip enemyShip = null;
		
		if(shipType.equals("UFO")){
			
			EnemyShipFactory shipFactory = new UFOEnemyShipFactory();
			enemyShip = new UFOEnemyShip(shipFactory);
			enemyShip.setName("UFO");
			
		}
		else if(shipType.equals("UFO Boss")){
			
			EnemyShipFactory shipFactory = new UFOBossEnemyShipFactory();
			enemyShip = new UFOBossEnemyShip(shipFactory);
			enemyShip.setName("UFO Boss");

		}
		return enemyShip;
	}

}
