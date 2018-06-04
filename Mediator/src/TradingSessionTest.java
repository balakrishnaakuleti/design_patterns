
public class TradingSessionTest {

	public static void main(String[] args) {
		Exchange exchange = new NationalExchange();
		Client kotak = new KotakBankClient(exchange);
		Client bandan = new BandanBankClient(exchange);
		kotak.sell("INFY", 100);
		kotak.sell("TCS", 200);
		kotak.sell("SAP", 400);
		bandan.sell("RCOM", 300);
		bandan.buy("INFY", 100);
		kotak.buy("RCOM", 300);
		exchange.displayTheList();
	}
}
