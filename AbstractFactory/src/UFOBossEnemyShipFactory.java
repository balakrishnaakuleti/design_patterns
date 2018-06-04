
public class UFOBossEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addWeapon() {
		return new UFOBossESWeapon();
	}

	@Override
	public ESEngine addEngine() {
		return new UFOBossEngine();
	}

}
