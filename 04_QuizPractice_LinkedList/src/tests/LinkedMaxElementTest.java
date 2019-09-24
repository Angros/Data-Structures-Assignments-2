/*
 * LinkedMaxElementTest.java
 * By Angel Rosario
 * 841-12-7893
 * 8/abril/2014
 * Test application for finding the max element with linked recursion and linked iteration.
 */
package tests;

import algorithms.LinkedIteration;
import algorithms.LinkedRecursion;
import datastructures.Node;

public class LinkedMaxElementTest {
	// Serves as the entry point for the application.
	public static void main(String[] args) {
		Node<Integer> list = 
				new Node<>(27, 
						new Node<>(32, 
								new Node<>(99, 
										new Node<>(60, 
												new Node<>(17, null)))));
		

		
		System.out.println("Recursion: The maximum element is " +
				LinkedRecursion.maxElement(list));
		System.out.println();
		System.out.println("Iteration: The maximum element is " +
				LinkedIteration.maxElement(list));
		
		System.out.println();
		System.out.println("End of test. ");
		System.exit(0);
		
	}

}
