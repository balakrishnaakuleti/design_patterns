
public class SingletonTest {

	public static void main(String[] args) {
	
		Singleton firstInstance = Singleton.getInstance();
		System.out.println("First Instance identity: "+ System.identityHashCode(firstInstance));
		System.out.println(firstInstance.getLetterList());
		System.out.println(firstInstance.getTiles(7));
	
		Singleton secondInstance = Singleton.getInstance();
		System.out.println("Second Instance identity: "+ System.identityHashCode(secondInstance));
		System.out.println(secondInstance.getLetterList());
		System.out.println(secondInstance.getTiles(7));
		
		
	}
}
