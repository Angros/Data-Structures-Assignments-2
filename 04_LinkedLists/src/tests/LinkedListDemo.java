package tests;
import datastructures.Node;


public class LinkedListDemo {

	public static void main(String[] args) {
		
		Node<Character> list = new Node<>('a',
									new Node<>('b',
											new Node<>('c', null )));
		
		System.out.println("The first value is: " + list.getData());
		
		System.out.println("The second value is: " + list.getNext().getData() );
		
		System.out.println("The values in the linked list are: ");
		Node<Character> temp = list;
		while (temp != null){
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
		System.out.println("End of demo.");
		System.exit(0);
		
	}
	
}
