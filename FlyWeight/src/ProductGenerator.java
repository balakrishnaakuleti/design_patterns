import java.util.Random;

public class ProductGenerator {

	String[] colors = { "Red", "Blue", "Green", "Magento", "White", "Black", "Orange", "Violet", "Yellow", "Pink",
			"Grey", "CoffeeColor", "ChocolateColor" };

	Random random;

	ProductFlyWeightFactory generator;

	public ProductGenerator(ProductFlyWeightFactory generator) {
		random = new Random();
		this.generator = generator;
	}

	public void createProductsNormal() {

		generator.getProductNormally(colors[getRandomIndex()]);
	}

	public void createProductsInFlyWeightFashion() {

		generator.getProductFromFactory(colors[getRandomIndex()]);
	}

	private int getRandomIndex() {

		return random.nextInt(colors.length);
	}

}
