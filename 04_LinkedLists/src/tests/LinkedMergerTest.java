/*
 * LinkedMergerTest.java
 * Angel Rosario
 * 841-12-8946
 * 6/abril/2014
 * Test application for the LinkedMerger class
 */
package tests;

import algorithms.LinkedMerger;
import datastructures.Node;

public class LinkedMergerTest {

	public static void main(String[] args) {
		Node<String> list1 = new Node<>("John",
									new Node<>("Ross", 
											new Node<>("Ethan",
													new Node<>("Will", null))));
		Node<String> list2 = new Node<>("Sara",
									new Node<>("Lucy",
											new Node<>("Tamara", null)));
		Node<String> list3 = LinkedMerger.merge(list1, list2);
		System.out.println("This is the Merged List: ");
		for(Node<String> curr = list3; curr!= null; curr = curr.getNext())
			System.out.print(curr.getData() + " ");

	}
	
}
