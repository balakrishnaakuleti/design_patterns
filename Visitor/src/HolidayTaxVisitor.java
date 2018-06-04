import java.text.DecimalFormat;

public class HolidayTaxVisitor implements Visitor {

	DecimalFormat df = new DecimalFormat("#.##");

	@Override
	public double visit(Liquor commodity) {
		return Double.parseDouble(df.format(commodity.getPrice() + 0.20 * commodity.getPrice()));
	}

	@Override
	public double visit(Tobacco commodity) {
		return Double.parseDouble(df.format(commodity.getPrice() + 0.40 * commodity.getPrice()));
	}

	@Override
	public double visit(Necessity commodity) {
		return Double.parseDouble(df.format(commodity.getPrice() + 0 * commodity.getPrice()));
	}

}