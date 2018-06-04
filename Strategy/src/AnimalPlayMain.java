public class AnimalPlayMain {
	public static void main(String[] args) {
		Animal dogAnimal = new Animal("Dog", 10, 20, "Bow", null);
		dogAnimal.tryToFlye();
		Animal parrotAnimal = new Animal("Parrot",10,10,"Cue",null);
		parrotAnimal.tryToFlye();
		System.out.println("Giving flying access to Dog");
		dogAnimal.setFlyType(new CanFly());
		dogAnimal.tryToFlye();
		System.out.println("Removing flying access to Dog");
		dogAnimal.setFlyType(new CantFly());
		dogAnimal.tryToFlye();
		System.out.println("Acual Dogs And Birds");
		
		Animal dog= new Dog("Dog", 12, 24, "Bow");
		Animal parrot = new Bird("Parrot",30,40,"Cue");
		dog.tryToFlye();
		parrot.tryToFlye();
		((Dog)dog).digAHole();
		((Bird)parrot).createNest();
		System.out.println("Make dog fly");
		dog.setFlyType(new CanFly());
		dog.tryToFlye();
		
	}
}
