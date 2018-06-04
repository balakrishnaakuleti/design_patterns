import java.util.ArrayList;

public class NationalExchange implements Exchange {

	private ArrayList<Client> clientList;
	private ArrayList<StockOffer> buyList;
	private ArrayList<StockOffer> sellList;
	private int clientCount;

	public NationalExchange() {
		this.buyList = new ArrayList<StockOffer>();
		this.sellList = new ArrayList<StockOffer>();
		this.clientList = new ArrayList<Client>();
		clientCount = 1;

	}

	@Override
	public void addClient(Client client) {
		clientList.add(client);
		client.setClientCode(clientCount++);
		System.out.println("Client successfully added");
	}

	@Override
	public void buy(String stockName, int nOfStocks, int clientCode) {
		boolean stockBought = false;
		for (StockOffer offer : sellList) {
			if (offer.getStockName() == stockName && offer.getnOfStocks() == nOfStocks) {
				stockBought = true;
				sellList.remove(offer);
				System.out.println(nOfStocks + " shares of " + stockName + " bought by colleague code " + offer.getClientCode());
				break;
			}
		}
		if (!stockBought) {
			System.out.println("The requested stock not available. Adding to the future buy list... ");
			buyList.add(new StockOffer(stockName, nOfStocks, clientCode));
		}
	}

	@Override
	public void sell(String stockName, int nOfStocks, int clientCode) {
		boolean stockSold = false;
		for (StockOffer offer : buyList) {
			if (offer.getStockName() == stockName  && offer.getnOfStocks() == nOfStocks) {
				stockSold = true;
				buyList.remove(offer);
				System.out.println(nOfStocks + " shares of " + stockName + " sold by colleague code " + offer.getClientCode());
				break;
			}
		}
		if(!stockSold){
			System.out.println("No buyer available to take. Adding to the future sell list... ");
			sellList.add(new StockOffer(stockName, nOfStocks, clientCode));		}
	}

	@Override
	public void displayTheList() {
		
		System.out.println("BUY LIST-----------------------------------------------");
		
		for (StockOffer offer : buyList) {
			System.out.println("Client # "+offer.getClientCode()+" wants "+offer.getnOfStocks()+" shares of " + offer.getStockName());
		}
		
		System.out.println("SELL LIST----------------------------------------------");
		
		for (StockOffer offer : sellList) {
			System.out.println("Client # "+offer.getClientCode()+" offers "+offer.getnOfStocks()+" shares of " + offer.getStockName());
		}


	}

}
