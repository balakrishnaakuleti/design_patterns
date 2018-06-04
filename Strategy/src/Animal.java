
public class Animal {

	private String name;
	private int height;
	private int weight;
	private String sound;
	private Fly flyType;

	public Animal(String name, int height, int weight, String sound, Fly flyType) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.sound = sound;
		this.flyType = flyType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public void tryToFlye() {
		if (null == flyType) {
			System.out.println("No info related to flying of " + name);
		} else {
			flyType.fly();

		}
	}

	public void setFlyType(Fly flyType) {
		this.flyType = flyType;
	}

}
