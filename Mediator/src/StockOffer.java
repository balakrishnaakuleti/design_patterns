
public class StockOffer {

	private String stockName;
	private int nOfStocks;
	private int clientCode;

	public StockOffer(String stockName, int nOfStocks, int clientCode) {

		this.stockName = stockName;
		this.nOfStocks = nOfStocks;
		this.clientCode = clientCode;
	}

	public int getnOfStocks() {
		return nOfStocks;
	}

	public void setnOfStocks(int nOfStocks) {
		this.nOfStocks = nOfStocks;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getClientCode() {
		return clientCode;
	}

	public void setClientCode(int clientCode) {
		this.clientCode = clientCode;
	}

}
