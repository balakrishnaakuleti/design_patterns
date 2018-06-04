
public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		AnimalFactory factory = new AnimalFactory();
		Sheep original = new Sheep();
		Sheep clonedOne = (Sheep)factory.getClone(original);
		System.out.println(original);
		System.out.println(clonedOne);
		System.out.println("Original Sheep Hash code"+System.identityHashCode(original));
		System.out.println("Cloned Sheep Hash code"+System.identityHashCode(clonedOne));

	}
	
}
