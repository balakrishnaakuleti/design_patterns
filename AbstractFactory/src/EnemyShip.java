
public abstract class EnemyShip {

	String name;
	ESWeapon weapon;
	ESEngine engine;
	
	abstract public void makeShip();

	public void displayEnemyShip() {

		System.out.println("The ship "+ name + " is being displayed.");
	}

	public void followHeroShip() {
		System.out.println("The ship "+ name + " is following the hero ship.");
		
	}

	public void damageHeroShip() {
		System.out.println("The ship "+ name + " attacked hero ship and caused damage.");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ESWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(ESWeapon weapon) {
		this.weapon = weapon;
	}

	public ESEngine getEngine() {
		return engine;
	}

	public void setEngine(ESEngine engine) {
		this.engine = engine;
	}

}
