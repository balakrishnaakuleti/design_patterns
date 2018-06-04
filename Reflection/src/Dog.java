
public class Dog implements Animal{

	private String name;
	
	private String sound;
	
	private Dog(String name, String sound){
		
		System.out.println("How you got here. I am private...");
		this.sound=sound;
		this.name=name;
		System.out.println("Any how i have created Dog for you.");

	}
	
	private  Dog(){
		
		System.out.println("I am default PRIVATE constructor.");
		this.name="Default Dog";
		this.sound="Bow Bow";
		System.out.println("You must have used Reflection API to get in here.");

	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSound() {
		return sound;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	
	
}
