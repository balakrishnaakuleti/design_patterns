package builder;

public class OldRobotBuilder implements RobotBuilder{

	Robot robot;
	
	OldRobotBuilder(){
		this.robot= new Robot();
		System.out.println("Robot instantiated");
	}
	
	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");		
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Tin Torso");		
		
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Tin Arms");		
		
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Tin Legs");		
		
	}

	@Override
	public Robot getRobot() {
		return robot;
	}

}
