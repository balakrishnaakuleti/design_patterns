package builder;

public class RobotBuilderTest {
public static void main(String[] args) {
	
	RobotBuilder builder = new OldRobotBuilder();
	RobotEngineer engineer = new RobotEngineer(builder);
	engineer.makeRobot();
	Robot robot =	engineer.getRobot();
	System.out.println("Robot Head"+robot.getHead());
	System.out.println("Robot Torso"+robot.getTorso());
	System.out.println("Robot Arms"+robot.getArms());
	System.out.println("Robot Legs"+robot.getLegs());

}
}
