
public class EnemyAttackTest {

	public static void main(String[] args) {

		System.out.println("\nENEMY TANK -----------------------------------------");
		EnemyAttacker tank = new EnemyTank();
		tank.stepForward();
		tank.setDriver("John");
		tank.attack();

		System.out.println("\nENEMY ROBOT -----------------------------------------");
		EnemyRobot robot= new EnemyRobot();
		robot.walk();
		robot.damageWithHands();
		robot.reactToHuman("Mike");

		System.out.println("\nENEMY ROBOT OPERATION THROUGH ADAPTER----------------");
		EnemyRobotAdapter adapter = new EnemyRobotAdapter(robot);
		adapter.setDriver("Larry");
		adapter.stepForward();
		adapter.attack();
	}

}
