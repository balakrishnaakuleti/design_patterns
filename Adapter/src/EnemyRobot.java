import java.util.Random;

public class EnemyRobot {
	
	Random random = new Random();

	public void damageWithHands(){
		int damage= random.nextInt(10)+1;
		System.out.println("Robot attacked enemy with hands and cuased a damage of  "+damage+" units");
	}
	
	public void walk(){
		int meters= random.nextInt(10)+1;
		System.out.println("Robot moves forward by "+meters+" meters");
		
	}
	
	public void reactToHuman(String human){
		System.out.println("Robot has beaten the human "+human);
	}
}
