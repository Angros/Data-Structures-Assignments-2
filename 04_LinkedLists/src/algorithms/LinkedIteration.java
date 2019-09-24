/*
 * LinkedIteration.java
 * By Angel Rosario
 * 841-12-7893
 * 8/abril/2014
 * Utility class with iterative static methods for linked lists.
 */
package algorithms;

import datastructures.Node;

public class LinkedIteration {

	public static String toString(Node<Integer> ls) {
		String str = "";
		if (ls != null) {
			str += ls.getData();
			
			Node<Integer> curr = ls.getNext();
			while (curr != null) {
				str += ", " + curr.getData();
				curr = curr.getNext();	
			}
		}
		
		return str;
	}
	
	public static int size(Node<Integer> ls){
		int size = 0;
		
		Node<Integer> curr = ls;
		while (curr != null) {
			size++;
			curr = curr.getNext();
		}
		
		return size;
	}
	
	public static int sumElements(Node<Integer> ls) {
	int sum = 0;
		
		Node<Integer> curr = ls;
		while (curr != null) {
			sum += curr.getData();
			curr = curr.getNext();
		}
	
		return sum;
	}
	

	// Returns the maximum element of the list
	public static int maxElement(Node<Integer> list){
		int maxElem = list.getData();

		Node<Integer> curr = list;
		while (curr != null) {
			if(curr.getData() > maxElem)
				maxElem = curr.getData();
				curr = curr.getNext();
			}
			
		return maxElem;

	}

}
