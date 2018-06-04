
public class Sheep implements Animal {

	@Override
	public Animal makeCopy() throws CloneNotSupportedException {

		System.out.println("Making a copy... !!!!!!!");
		return (Animal) super.clone();
	}

	public String toString() {
		return "Wow.. This is sheep";
	}
}
