package com.narayana.linkedlist;

import com.narayana.service.Node;

public class SinglyLinkedList {
	public Node head;

	public void insertNodeAtBeginning(int value) {
		if (head != null) {
			Node temp = new Node(value);
			temp.link = head;
			head = temp;
		} else {
			head = new Node(value);
		}
		System.out.println(value + " added at beginning");
	}

	public void insertNodeAtEnd(int value) {
		if (head != null) {
			Node temp = head;
			while (temp.link != null) {
				temp = temp.link;
			}
			temp.link = new Node(value);
		} else {
			head = new Node(value);
		}
		System.out.println(value + " added at end");
	}

	public void insertNodeAfterValue(int oldValue, int newValue) {
		Node temp = head;
		while (temp != null && temp.value != oldValue) {
			temp = temp.link;
		}
		if (temp == null) {
			System.out.println("Value given is not found");
		} else {
			// Storing link of next node of value node to next for linking it to new node
			Node next = temp.link;
			temp.link = new Node(newValue);
			temp.link.link = next;
			System.out.println(newValue + " added after " + oldValue);
		}
	}

	public void insertNodeAfterPosition(int position, int value) {
		Node temp = head;
		int i = 0;
		while (temp != null && i < position-1) {
			temp = temp.link;
			i++;
		}
		if (temp != null) {
			// Storing link of node at position+1 to next for linking it to new node
			Node next = temp.link;
			temp.link = new Node(value);
			temp.link.link = next;
			System.out.println(value + " added after position - " + position);
		} else {
			System.out.println("List has less values than the given position");
		}
	}

	public void deleteNodeAtBeginning() {
		if (head != null) {
			System.out.println("Deleted node at beginning with value " + head.value);
			head = head.link;
		} else {
			System.out.println("There aren't any node to delete!!!");
		}
	}

	public void deleteNodeAtEnd() {
		if (head != null) {
			Node temp = head, prev = temp;
			while (temp.link != null) {
				// Storing current temp value
				prev = temp;
				temp = temp.link;
			}
			System.out.println("Deleted node at End with value " + temp.value);
			prev.link = null;
		} else {
			System.out.println("There aren't any node to delete!!!");
		}
	}

	public void deleteNodeWithValue(int value) {
		if (head != null) {
			Node temp = head, prev = temp;
			int i = 0;
			while (temp != null && temp.value != value) {
				prev = temp;
				temp = temp.link;
				i++;
			}
			if (temp != null) {
				prev.link = temp.link;
				System.out.println("Deleted node with value " + value);
			} else {
				System.out.println("List doesn't have the value " + value);
			}
		} else {
			System.out.println("There aren't any node to delete!!!");
		}
	}

	public void deleteNodeAtPosition(int position) {
		if (head != null) {
			Node temp = head, prev = head;
			int i = 0;
			while (i < position-1 && temp != null) {
				prev = temp;
				temp = temp.link;
				i++;
			}
			if (i == 0) {
				head = temp.link;
				System.out.println("Deleted node at position - " + position);
			} else if (temp != null) {
				prev.link = temp.link;
				System.out.println("Deleted node at position - " + position);
			} else {
				System.out.println("List has lesser values than the given position");
			}
		} else {
			System.out.println("There aren't any node to delete!!!");
		}
	}

	public void reverse() {
		if(head==null) {
			System.out.println("List doesn't have any elements");
			return;
		}
		Node prev=null,cur=head,next=null;
		while(cur !=null) {
			next = cur.link;
			cur.link=prev;
			prev = cur;
			cur = next;
		}
		head = prev;
		System.out.println("List is reversed");
	}
	
	public int size() {
		int count=0;
		Node temp = head;
		while(temp!=null) {
			count++;
			temp=temp.link;
		}
		return count;
	}
	
	public void printList() {
		System.out.print("Elements of linked list are ");
		Node temp = head;
		while (temp.link != null) {
			System.out.print(temp.value + "->");
			temp = temp.link;
		}
		System.out.println(temp.value);
	}
	

	@Override
	public String toString() {
		String listRepr = "";
		Node temp = head;
		while (temp.link != null) {
			listRepr += temp.value + "->";
			temp = temp.link;
		}
		return listRepr + temp.value;
	}

}
