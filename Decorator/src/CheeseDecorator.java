
public class CheeseDecorator extends PizzaDecorator {

	CheeseDecorator(Pizza pizza) {
		super(pizza);
		System.out.println("Adding Cheese");
	}
	
	public String getDescription(){
		return tempPizza.getDescription()+", Cheese";
	}

	public double getCost(){
		return (tempPizza.getCost()+2.0);
	}
}
