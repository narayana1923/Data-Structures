package com.narayana.impl;

import com.narayana.linkedlist.SinglyLinkedList;

public class SLLImpl {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insertNodeAtBeginning(10);
		sll.insertNodeAtBeginning(11);
		sll.insertNodeAtEnd(15);
		sll.insertNodeAfterValue(15, 12);
		sll.insertNodeAfterPosition(3, 12);
		sll.insertNodeAtBeginning(5);
		sll.insertNodeAtEnd(20);
		sll.printList(); // 5->11->12->10->15->13->20
		sll.reverse();
		System.out.println("List after reversing:");
		sll.printList();
		sll.deleteNodeAtEnd();
		sll.deleteNodeAtBeginning();
		sll.deleteNodeAtPosition(2);
		sll.deleteNodeWithValue(13);
		sll.deleteNodeWithValue(20);
		sll.deleteNodeAtPosition(4);
		sll.printList();
		sll.deleteNodeAtPosition(3);
		sll.printList(); //11->15
		System.out.println("Total elements in list are: "+sll.size());
	}
}
