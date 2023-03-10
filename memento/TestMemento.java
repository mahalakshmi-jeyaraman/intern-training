package memento;

public class TestMemento {

	public static void main(String[] args) {
		  Originator originator = new Originator();
	      Caretaker caretaker = new Caretaker();
	      
	      originator.set("version 1");
	      originator.set("version 2");
	      caretaker.add(originator.storeInMemento());
	      
	      originator.set("version 3");
	      caretaker.add(originator.storeInMemento());
	      
	      originator.set("version 4");
	      System.out.println("current version :"+ originator.getSavedArticle());
	      System.out.println();
	      
	      originator.restoreFromMemento(caretaker.getMemento(1));
	      System.out.println("first version :"+ originator.getSavedArticle());
	      System.out.println();
	      
	      originator.restoreFromMemento(caretaker.getMemento(0));
	      System.out.println("first version :"+ originator.getSavedArticle());
	      System.out.println();
	}

}
