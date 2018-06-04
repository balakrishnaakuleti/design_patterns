
public class ChainOfResponsibilityTest {

	public static void main(String[] args) {
		Chain chain1= new AddNumbers();
		Chain chain2 = new SubNumbers();
		Chain chain3 = new MultNumbers();
		Chain chain4 = new DivNumbers();
		
		chain1.setNext(chain2);
		chain2.setNext(chain3);
		chain3.setNext(chain4);
		
		Numbers request = new Numbers(40, 20, "fact");
		chain1.calculate(request);
	}
}
