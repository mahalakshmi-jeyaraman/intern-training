package memento;

public class Originator {
	
	private String article;
	
	public void set(String newArticle) {
		System.out.println("current version of the article " + newArticle);
		System.out.println();
		article = newArticle;
	}
	public String getSavedArticle()
    {
        return article;
    }
	public Memento storeInMemento() {
		System.out.println("saving to the memento.......");
		System.out.println();
		return new Memento(article);
	}
	
	
	public String restoreFromMemento(Memento memento) {
		article = memento.getSavedArticle();
		System.out.println("previous article stored in memento "+article);
		 System.out.println();
		return article;
	}
}
