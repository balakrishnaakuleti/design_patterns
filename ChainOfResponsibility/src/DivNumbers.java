
public class DivNumbers implements Chain{

	Chain next;
	
	@Override
	public void setNext(Chain next) {
		this.next=next;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.operation.equalsIgnoreCase("div")){
			System.out.println(request.getNumber1()+" + "+request.getNumber2()+" = "+(request.getNumber1()/request.getNumber2()));
		}
		else
		{
			System.out.println("Only these operations are allowed - add, sub, mult, div");
		}
		
	}

}