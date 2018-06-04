
public class SingletonThreadsTest {

	public static void main(String[] args) {
		
		Runnable run1 = new SingletonThreads();
		Runnable run2 = new SingletonThreads();

		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run2);
		thread1.start();
		thread2.start();

	}
	
}
