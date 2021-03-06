package builder;

public class RobotEngineer {
	
	RobotBuilder robotBuilder;
	
	public RobotEngineer( RobotBuilder robotBuilder){
		this.robotBuilder=robotBuilder;
	}
	
	public	Robot getRobot(){
		return this.robotBuilder.getRobot();
	}
	
	public void makeRobot(){
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
		System.out.println("Robot is successfully assembled.");
	}
}
