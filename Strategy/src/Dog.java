
public class Dog extends Animal{

	public Dog(String name, int height, int weight, String sound) {
		super(name, height, weight, sound, new CantFly());
	}
	public void digAHole(){
		System.out.println("Hole is dug");
	}
}
