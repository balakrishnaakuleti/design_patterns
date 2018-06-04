import java.util.ArrayList;

public class CareTaker {

	private ArrayList<Memento> mementos;

	public CareTaker() {
		mementos = new ArrayList<Memento>();
	}

	public void addMemento(Memento memento) {
		System.out.println("Adding memento to repository...");
		mementos.add(memento);
	}

	public Memento getMemento(int index) {
		System.out.println("Retrieving memento from repository...");
		return mementos.get(index);
	}
}
