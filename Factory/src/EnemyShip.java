
public abstract class EnemyShip {
	String name;
	double damage;
	
	public void followHeroShip(){
		System.out.println(name+ " is Following hero.");
	}
	
	public void displayEnemyShip(){
		System.out.println(name+ " is displayed on the screen.");
	}
	
	public void attackHeroShip(){
		System.out.println(name+ " is has attacked the hero ship and caused damage of "+damage);

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDamage() {
		return damage;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}

}
