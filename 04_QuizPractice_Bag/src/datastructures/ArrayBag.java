package datastructures;

public class ArrayBag<E> implements Bag<E> {

	private static final int DEFAULT_INITIAL_CAPACITY = 10;
	private static final int GROWTH_FACTOR = 2;
	
	private E[] data;
	private int count;
	
	@SuppressWarnings("unchecked")
	public ArrayBag(int initCapacity) {
		
		if(initCapacity < 0)
			throw new InvalidCapacityException();
		data = (E[]) new Object[initCapacity];
	}
	
	public ArrayBag() {
		this(DEFAULT_INITIAL_CAPACITY);
	}
	
	@Override
	public void add(E elem) {
		ensureCapacity();
		
		data[count++] = elem;
		
	}

	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		if(count == data.length ) {
			E[] temp = (E[]) new Object[count * GROWTH_FACTOR];
			for(int curr = 0; curr < count; curr++)
				temp[curr] = data[curr];
			
			data = temp;
		}
	}

	@Override
	public void remove(E elem) {
		int curr = positionOf(elem);
		
		if (curr == -1)
			throw new ElementNotFoundException();
		
		data[curr] = data[count--];
		data[count] = null;
	}

	private int positionOf(E elem) {
		for(int curr = 0; curr < count; curr++) 
			if(elem.equals(data[curr]) )
				return curr;
			return -1;
		}
	

	@Override
	public boolean contain(E elem) {
		// TODO Auto-generated method stub
		return positionOf(elem) != -1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		data = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
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
