
public class AbstractFactoryMainClass {

	public static void main(String[] args) {
		EnemyShipBuilding shipBuilding = new UFOEnemyShipBuilding();
		EnemyShip normalUFO = shipBuilding.orderTheShip("UFO");
		System.out.println(normalUFO);
		EnemyShip bossUFO = shipBuilding.orderTheShip("UFO Boss");
		System.out.println(bossUFO);
		
	}
	
}
