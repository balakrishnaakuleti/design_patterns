
public class AnimalFactory {

	public Animal getClone(Animal animal) throws CloneNotSupportedException{
		return animal.makeCopy();
	}
	
}
