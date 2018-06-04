
public abstract class Client {
	
	int clientCode;
	Exchange exchange;
	
	public Client(Exchange exchange){
		this.exchange=exchange;
		exchange.addClient(this);
	}
	
	void sell(String stockName, int nOfStocks){
		exchange.sell(stockName, nOfStocks, clientCode);
	}
	void buy(String stockName, int nOfStocks){
		exchange.buy(stockName, nOfStocks, clientCode);
	}

	public int getClientCode() {
		return clientCode;
	}

	public void setClientCode(int clientCode) {
		this.clientCode = clientCode;
	}
	
}
