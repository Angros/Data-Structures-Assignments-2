/*
 * LinkedMerger.java
 * Angel Rosario
 * 841-12-8946
 * 6/abril/2014
 * Creates a linked list by merging 2 different linked lists.
 */

package algorithms;

import datastructures.Node;

public class LinkedMerger {

	@SuppressWarnings("unchecked")
	public static <E> Node<E> merge(Node<E> list1, Node<E> list2) {
		
		Node<E> currLeft = list1;
		Node<E> currRight = list2;
		Node<E> merger = null;
		
		while(currLeft != null && currRight !=null){
			if(((Comparable<E>) currLeft.getData()).compareTo(currRight.getData()) <= 0){
				merger = new Node<>(currLeft.getData(), merger); 
				currLeft = currLeft.getNext(); 
			}else{
				merger = new Node<>(currRight.getData(), merger);
				currRight = currRight.getNext(); 
			}
		}
		while(currLeft != null){
			merger = new Node<>(currLeft.getData(), merger);
			currLeft = currLeft.getNext(); 
		}
		while(currRight != null){
			merger = new Node<>(currRight.getData(), merger);
			currRight = currRight.getNext(); 
		}
		return merger;
		
		
		
	}
	
}
