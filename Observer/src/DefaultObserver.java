
public class DefaultObserver implements Observer{

	int ibm;
	int apple;
	int google;
	public static int observerCount;
	int observerID; 
	Publisher publisher;
	
	public DefaultObserver(Publisher publisher){
		this.publisher=publisher;
		observerID=++observerCount;
		System.out.println("\n\n\nNew Observer created and registered for changes- ID is - "+observerID);
		publisher.registerObserver(this);
	}
	
	@Override
	public synchronized void  update(int ibm, int apple, int google) {
		System.out.print("\n\nObserver ID: "+observerID+"\n");
		System.out.print("BEFORE Values:");
		printValues();
		this.ibm=ibm;
		this.apple=apple;
		this.google=google;
		System.out.print("\nAFTER Values :");
		printValues();
	}
	private synchronized void printValues(){
		System.out.print("    IBM: "+ibm);
		System.out.print("    APPLE: "+apple);
		System.out.print("    GOOGLE: "+google);

	}

}
