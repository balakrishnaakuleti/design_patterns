
public class TomotoSauceDecorator extends PizzaDecorator{

	TomotoSauceDecorator(Pizza pizza) {
		super(pizza);
		System.out.println("Adding tomoto sauce.");
	}

	public String getDescription(){
		return tempPizza.getDescription()+", Tomoto Sauce";
	}
	
	public double getCost(){
		
		return (tempPizza.getCost()+1.0);
		
	}
}
