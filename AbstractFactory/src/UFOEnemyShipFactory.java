
public class UFOEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addWeapon() {
		return new UFOESWeapon();
	}

	@Override
	public ESEngine addEngine() {
		return new UFOESEngine();
	}

}
