
public class PizzaMakerTest {

	public static void main(String[] args) {
		Pizza customPizza = new TomotoSauceDecorator(new CheeseDecorator(new PlainPizza()));
		
		System.out.println("My custom Pizza description : "+ customPizza.getDescription());
		System.out.println("My custom Pizza cost : "+ customPizza.getCost());
		
		System.out.println("ONE MORE CUSTOM PIZZA WITH ONLY TOMOTO SAUCE");
		
		Pizza tomotoSaucePizza = new TomotoSauceDecorator(new PlainPizza());
		

		System.out.println("My tomoto Pizza description : "+ tomotoSaucePizza.getDescription());
		System.out.println("My tomoto Pizza cost : "+ tomotoSaucePizza.getCost());
		
}
}