/*
 * LinkedRecursion.java
 * By Angel Rosario
 * 841-12-7893
 * 8/abril/2014
 * Utility class with recursive static methods for linked lists.
 */
package algorithms;

import datastructures.Node;

public class LinkedRecursion {

	private LinkedRecursion() { }

	public static String toString(Node<Integer> ls) {
		return "[" + toStringHelper(ls) + "]";
	}
	
	private static String toStringHelper(Node<Integer> ls) {
		if (ls == null)
			return "";
		else if (ls.getNext() == null)
			return Double.toString(ls.getData() );
		else
			return ls.getData() + ", " + toStringHelper(ls.getNext() );
	}

	public static int size(Node<Integer> ls) {
		if (ls == null)
			return 0;
		else
			return 1 + size(ls.getNext() );
	}
	
	public static int sumElements(Node<Integer> ls){
		if (ls == null)
			return 0;
		else
			return ls.getData() + sumElements(ls.getNext() ); //ls = node of integer, //ls.getNext() = node of integer // ls.getData() = int 
	}	

	////Precondition at least 1 element
	public static int maxElement(Node<Integer> list){
	
		return maxElement(list.getNext(), list.getData());
	}
	
	// Returns the maximum element of the list
	private static int maxElement(Node<Integer> list, int max) {
		if(list == null)
			return max;
		max = maxOfTwo(list.getData(), max);
		return maxElement(list.getNext(), max);
	}
	
	// Max element of two elements
	private static int maxOfTwo(int num1, int num2) {
		return (num1 > num2)? num1 : num2;
	}


}
