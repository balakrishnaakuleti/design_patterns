
public class SingletonThreads implements Runnable{

	@Override
	public void run() {


		Singleton firstInstance = Singleton.getInstance();
		System.out.println("First Instance identity: "+ System.identityHashCode(firstInstance));
		System.out.println(firstInstance.getLetterList());
		System.out.println(firstInstance.getTiles(7));
	}

}
