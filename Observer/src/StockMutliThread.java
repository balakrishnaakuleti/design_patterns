import java.text.DecimalFormat;

public class StockMutliThread implements Runnable {

	private Publisher publisher;
	private String stock;
	private int price;

	public StockMutliThread(Publisher publisher, String stock, int price) {
		this.publisher = publisher;
		this.stock = stock;
		this.price = price;
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			int randomPriceVariation = (int) (Math.random() * 10);
			
			switch (stock) {
			
			case "IBM":
				((DefaultPublisher)publisher).setIbm(price+randomPriceVariation);
				break;
				
			case "APPLE":
				((DefaultPublisher)publisher).setApple(price+randomPriceVariation);
				break;
				
			case "GOOGLE":
				((DefaultPublisher)publisher).setGoogle(price+randomPriceVariation);
				break;
			}
			DecimalFormat df = new DecimalFormat("###.##");
			System.out.println("\n+"+stock +"   Stock : "+df.format(price+randomPriceVariation)+ "   "+df.format(randomPriceVariation));
			System.out.println();

		}

	}

}
