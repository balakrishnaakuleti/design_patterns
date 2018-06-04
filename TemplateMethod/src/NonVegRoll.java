
public class NonVegRoll extends Roll{

	@Override
	public void addMeat() {
		System.out.println("Adding meat - chicken , mutton.");
	}

	@Override
	public void addCheese() {
		System.out.println("Adding cheese - normal cheese.");
		
	}

	@Override
	public void addVeg() {
		System.out.println("Adding veg - tomato , onion, carrot.");
		
	}

}
