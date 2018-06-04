
public interface Publisher {
		
	void registerObserver(Observer o);

	void unRegisterObserver(Observer o);

	void notifyObservers();

}
