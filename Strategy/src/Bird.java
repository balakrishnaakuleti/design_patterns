
public class Bird extends Animal{

	public Bird(String name, int height, int weight, String sound) {
		super(name, height, weight, sound, new CanFly());
	}

	public void createNest(){
		System.out.println("Nest created");
	}
	
}
