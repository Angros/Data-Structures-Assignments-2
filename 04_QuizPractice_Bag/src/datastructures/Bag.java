package datastructures;

public interface Bag<E> {

	void add(E elem);
	
	void remove(E elem);
	
	boolean contain(E elem);
	
	void clear();
	
	boolean isEmpty();
	
	int size();
	
	
}
