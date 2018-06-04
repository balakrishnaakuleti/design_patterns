import java.util.ArrayList;

public class DefaultPublisher implements Publisher{
	
	int ibm;
	int apple;
	int google;

	ArrayList<Observer> observers;

	public DefaultPublisher(){
		observers = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);		
	}

	@Override
	public void unRegisterObserver(Observer o) {
		if(observers.contains(o)){
			observers.remove(o);
		}
		
	}

	@Override
	public synchronized void notifyObservers() {
		for(Observer observer: observers){
			observer.update(ibm, apple, google);
		}
	}

	public synchronized void setIbm(int ibm) {
		this.ibm = ibm;
		notifyObservers();
	}

	public synchronized void setApple(int apple) {
		this.apple = apple;
		notifyObservers();
	}

	public synchronized void setGoogle(int google) {
		this.google = google;
		notifyObservers();
	}
		
}
