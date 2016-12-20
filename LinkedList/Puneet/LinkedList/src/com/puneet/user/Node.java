package com.puneet.user;

public class Node {
	String name;
	Node next;
	Node previous;
	
	public Node(String name){
		this.name = name;
		next = null;
		previous = null;
	}
}
