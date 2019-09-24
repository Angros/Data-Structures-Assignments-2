package algorithms;

import datastructures.Node;

public class LinkedIteration {

	public static String toString(Node<Integer> ls){
		String str = "";
		
		if (ls != null)
			str += ls.getData();
		
		Node<Integer> curr = ls.getNext();
		while(curr != null){
			str += ", " + curr.getData();
			curr = curr.getNext();
		}
		return str;
	}
	
	public static int size(Node<Integer> ls) {
		int size = 0;
		
		Node<Integer> curr = ls;
		while(curr != null) {
			size++;
			curr = curr.getNext();
		}
		return size;
	}
	
	public static int sumElements(Node<Integer> ls) {
		int sum = 0;
		
		Node<Integer> curr = ls;
		while(curr != null) {
		sum += curr.getData();
		curr = curr.getNext();
		}
	return sum;
	}
	
	public static int maxElement(Node<Integer> ls) {
		int maxElem = ls.getData();
		
		Node<Integer> curr = ls;
		while(curr != null) {
			maxElem = curr.getData();
			curr = curr.getNext();
		}
		return maxElem;
	}
	
}
