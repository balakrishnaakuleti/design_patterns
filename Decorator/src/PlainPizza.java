
public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "Thin Dough";
	}

	@Override
	public double getCost() {
		System.out.println("Cost of Dough : 4.0");
		return 4.0;
	}

}
