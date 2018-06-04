
abstract class PizzaDecorator implements Pizza{
	
	Pizza tempPizza;
	
	PizzaDecorator (Pizza pizza){
		
		tempPizza=pizza;
	}
	
	public String getDescription(){
		return tempPizza.getDescription();
	}

	public double getCost(){
		return tempPizza.getCost();
	}
}
