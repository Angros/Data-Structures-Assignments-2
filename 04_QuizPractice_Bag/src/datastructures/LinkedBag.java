package datastructures;

public class LinkedBag<E> implements Bag<E> {

	private Node<E> head;
	private int count;
	
	@Override
	public void add(E elem) {
		head = new Node<> (elem, head);
		count ++;

	}

	@Override
	public void remove(E elem) {
		Node<E> curr = positionOf(elem);
		
		if(curr == null)
			throw new ElementNotFoundException();
		
		curr.data = head.data;
		head = curr.next;
		count--;
		
	}
	
	private Node<E> positionOf(E elem){
		for (Node<E> curr = head; curr != null; curr = curr.next)
			if (elem.equals(curr.data))
				return curr;
			return null; // not found
	}

	@Override
	public boolean contain(E elem) {
		// TODO Auto-generated method stub
		return positionOf(elem) != null;
	}

	@Override
	public void clear() {
		head = null;
		count = 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

}
