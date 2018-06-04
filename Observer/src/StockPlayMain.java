
public class StockPlayMain {

	public static void main(String[] args) {
		Publisher publisher=new DefaultPublisher();
		Observer observer= new DefaultObserver(publisher);

		publisher.notifyObservers();
		Observer observer2= new DefaultObserver(publisher);

		((DefaultPublisher)publisher).setIbm(10);
		((DefaultPublisher)publisher).setApple(50);
		((DefaultPublisher)publisher).setGoogle(20);
		System.out.println("\nMULTI THREADING PART");
		StockMutliThread multi= new StockMutliThread(publisher, "IBM", 30);
		StockMutliThread google= new StockMutliThread(publisher, "GOOGLE", 30);

		new Thread(multi).start();
		System.out.println("HELLO");
		new Thread(google).start();

	}
	
}
