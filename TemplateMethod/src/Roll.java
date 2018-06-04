
public abstract class Roll {

	public void makeRoll(){
		
		System.out.println("Preparation of roll started");
		
		prepareChapathi();
		if(userWantesMeat()){
			addMeat();

		}
		if(userWantesVeg()){
			addVeg();

		}
		if(userWantesCheese()){
			addCheese();

		}
		wrapRoll();
	}

	public boolean userWantesCheese() {
		return true;
	}

	public boolean userWantesVeg() {
		return true;
	}

	public boolean userWantesMeat() {
		return true;
	}

	private void prepareChapathi() {
		System.out.println("Chapathi prepared.");
	}

	public abstract void addMeat() ;

	public abstract void addCheese() ;

	public abstract void addVeg();

	private void wrapRoll() {
		System.out.println("Roll is wraped in paper.");
	}

	
}
