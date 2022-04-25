package com.narayana.service;

public class Node {
	public int value;
	public Node link;

	public Node(int value) {
		this.value = value;
	}

	public Node(int value, Node link) {
		this.value = value;
		this.link = link;
	}

}
