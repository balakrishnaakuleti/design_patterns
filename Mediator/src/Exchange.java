
public interface Exchange {

	public void addClient(Client client);
	public void buy(String stockName, int nOfStocks, int clientCode);
	public void sell(String stockName, int nOfStocks, int clientCode);
	public void displayTheList();

}
