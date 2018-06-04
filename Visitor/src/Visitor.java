
public interface Visitor {
	
	double visit(Liquor commodity);

	double visit(Tobacco commodity);

	double visit(Necessity commodity);
}
