
public class MultNumbers  implements Chain{

	Chain next;
	
	@Override
	public void setNext(Chain next) {
		this.next=next;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.operation.equalsIgnoreCase("mult")){
			System.out.println(request.getNumber1()+" * "+request.getNumber2()+" = "+(request.getNumber1()*request.getNumber2()));
		}
		else
		{
			next.calculate(request);
		}
		
	}

}