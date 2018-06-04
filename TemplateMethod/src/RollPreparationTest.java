
public class RollPreparationTest {

	public static void main(String[] args) {
		Roll vegRoll = new VegRoll();
		Roll nonVegRoll = new NonVegRoll();
		vegRoll.makeRoll();
		System.out.println("\n");
		nonVegRoll.makeRoll();
	}
	
}
