
public class VisitorTest {

	public static void main(String[] args) {
		Visitor normalTax = new TaxVisitor();
		Visitor holidayTax = new HolidayTaxVisitor();
		Visitable wine = new Liquor(100);
		Visitable cigar = new Tobacco(100);
		Visitable milk = new Necessity(100);
		System.out.println("PriceING ON NORMAL DAYS-----------------------------");
		System.out.println("Price for Wine:  " + wine.accept(normalTax));
		System.out.println("Price for cigar:  " + cigar.accept(normalTax));
		System.out.println("Price for milk:  " + milk.accept(normalTax));
		System.out.println("\nTAXING ON HOLIDAYS--------------------------------");
		System.out.println("Price for Wine:  " + wine.accept(holidayTax));
		System.out.println("Price for cigar:  " + cigar.accept(holidayTax));
		System.out.println("Price for milk:  " + milk.accept(holidayTax));
	}
}
