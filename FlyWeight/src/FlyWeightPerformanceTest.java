import java.util.Calendar;

public class FlyWeightPerformanceTest {

	public static void main(String[] args) {
		
		ProductGenerator productGenerator = new ProductGenerator(new ProductFlyWeightFactory());
		System.out.println("WITHOUT FLYWEIGHT 1 LAKH PRODUCTS GENERATION");
		long startTime = System.currentTimeMillis();
		for(int i=0; i <1000;i++){
			productGenerator.createProductsNormal();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: " + (endTime-startTime));
		
		System.out.println("WITH FLYWEIGHT 1 LAKH PRODUCTS GENERATION");
		startTime = System.currentTimeMillis();
		for(int i=0; i <1000;i++){
			productGenerator.createProductsInFlyWeightFashion();
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time taken: " + (endTime-startTime));


	}
	
}
