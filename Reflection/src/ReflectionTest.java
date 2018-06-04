import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class animalClass = Animal.class;
		
		System.out.println("JUST SAMPLE CLASS INFOS");

		System.out.println("Animal is a Local Class??  "+animalClass.isLocalClass());

		System.out.println("Animal is an interface??  "+animalClass.isInterface());
		
		System.out.println("Animal Class Name ?  "+animalClass.getName());
		
		System.out.println("Super class of Animal :  "+animalClass.getSuperclass());
		
		System.out.println("\n");
		System.out.println("DEFAULT CONSTRUCTOR");

		
		Class dogClass = Dog.class;
		
		Constructor defaultConstructor = dogClass.getDeclaredConstructor();
		
		defaultConstructor.setAccessible(true);
		
		Dog dogObject = (Dog) defaultConstructor.newInstance(null);
		
		System.out.println("Yahoo Dog is created.. !!!!!!");
		
		System.out.println("Dog name:  "+ dogObject.getName()+"     It sounds:   "+dogObject.getSound());
		
		Field[] fields = dogClass.getDeclaredFields();
		
		for(Field field : fields){
			System.out.println("Field : " + field.getName()+"   Type: "+field.getType());
			field.setAccessible(true);
			System.out.println(field.get(dogObject));
		}
		
		System.out.println("\n");
		System.out.println("TWO PARAM CONSTRUCTOR");
		
		Constructor customDogConstructor = dogClass.getDeclaredConstructor(new Class[]{String.class, String.class});
		
		customDogConstructor.setAccessible(true);
		
		Dog customDogObject = (Dog) customDogConstructor.newInstance("My own Dog", "How How");
		
		System.out.println("Custom Dog name: "+customDogObject.getName());
		
		System.out.println("Custom Dog Sounds like: "+customDogObject.getSound());

	}
}
