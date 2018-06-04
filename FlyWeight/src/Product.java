
public class Product {

	String color;
	
	public Product(String color){
		this.color=color;
		Thread.currentThread();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
