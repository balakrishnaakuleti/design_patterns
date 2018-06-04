
public class Originator {

	String currentArticle;

	public String getCurrentArticle() {
		return currentArticle;
	}

	public void setCurrentArticle(String currentArticle) {
		this.currentArticle = currentArticle;
	}

	public String getArticleFromMemento(Memento memento){
		return memento.getArticle();
	}
	
	public Memento getMementoFromArticle(String article){
		return new Memento(article);
	}
}
