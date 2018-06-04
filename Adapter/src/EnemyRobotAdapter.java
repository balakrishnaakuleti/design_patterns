
public class EnemyRobotAdapter implements EnemyAttacker{

	EnemyRobot robot;
	
	EnemyRobotAdapter(EnemyRobot robot){
		this.robot=robot;
	}
	
	@Override
	public void attack() {
		robot.damageWithHands();
	}

	@Override
	public void stepForward() {
		robot.walk();
	}

	@Override
	public void setDriver(String driver) {
		robot.reactToHuman(driver);
		
	}

}
