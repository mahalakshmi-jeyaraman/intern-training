package memento;

import java.util.ArrayList;

public class Caretaker {

	ArrayList<Memento> savedArticles = new ArrayList<Memento>();
	
	public void add(Memento m) {
		savedArticles.add(m);
	}
	
	public Memento getMemento(int index) {
		return savedArticles.get(index);
	}
}
