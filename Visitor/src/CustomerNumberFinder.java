
public class CustomerNumberFinder {

	public static void main(String args[]){
		CustomerNumberFinder finder= new CustomerNumberFinder();
		int A[] = {10, 20, 30};
		int expectedNumber = finder.customNumber( A)+1;
		System.out.println(expectedNumber);
		}

	public int customNumber(int[] A) {
		int big;
		big=A[0];
		for (int i = 1; i < A.length; i++) {
			if(big<A[i])
				big=A[i];
		}
		return big;
	}
}
