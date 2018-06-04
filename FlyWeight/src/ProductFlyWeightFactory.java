import java.util.HashMap;

public class ProductFlyWeightFactory {

	HashMap<String, Product> standardProducts;
	
	public ProductFlyWeightFactory() {

		standardProducts= new HashMap<String, Product>();
	}
	
	public Product getProductFromFactory(String color){
		
		Product product;
		
		if(standardProducts.containsKey(color)){
			 product = standardProducts.get(color);
		}
		else{
			product= new Product(color);
			standardProducts.put(color, product);
		}
		return product;		
	}
	
	public Product getProductNormally(String color){
		
		Product product;
		product= new Product(color);
		return product;		
	}
	
	
}
