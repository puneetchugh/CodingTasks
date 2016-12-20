package com.puneet.user;

public class DoublyLinkedList {

	
	public static void main(String args[]){
		
		long start = System.currentTimeMillis();;
		
		DoublyLinkedList list = new DoublyLinkedList();
		list.addToFront("Puneet");
		list.addToFront("Kaku");
		list.addToFront("Milford");
		list.addToEnd("Virat");
		list.addToEnd("Sachin");
		list.addToEnd("Kamran");
		list.deleteFront();
		list.deleteEnd();
		list.traverse();
	    long end = System.currentTimeMillis();;

	    System.out.println("Execution Time : "+(end - start) + " ms");
	    
	}
	private Node head;
	
	public DoublyLinkedList(){
	    head = new Node(null);
	    head.next = head.previous = null;
	}
	  
	public Node createNode(String name){
		Node newNode = new Node(name);
		return newNode;
	}
	  
	public void addToFront(String name){
	    
	Node newNode = createNode(name);
	    
		if(head.next == null){
			head.next = newNode;
			System.out.println("New node added : "+name);
		}
		else{
	        head.next.previous = newNode;
	        newNode.next = head.next;
	        head.next = newNode;
	        System.out.println("New node added : "+name);
		}
	}
	  
	  public void addToEnd(String name){
	  
	    Node newNode = createNode(name);
	    
	    if(head.next == null){
	      head.next = newNode;
	      System.out.println("New node added : "+name);
	    }
	    
	    else{
	      Node temp = head;
	      while(temp.next != null){
	        
	        temp = temp.next;
	      }
	      temp.next = newNode;
	      System.out.println("New node added : "+name);
	    }
	  }
	  
	  public void deleteFront(){
	    
	    if(head.next == null){
	      System.out.println("The Linked List is empty");
	    }
	    else{
	      
	      Node nodeToBeDeleted = head.next;
	      System.out.println("The deleted node : "+nodeToBeDeleted.name);
	      head.next = head.next.next;
	      head.next.previous = null;
	      //delete(nodeToBeDeleted);
	    }
	  }
	  
	  public void deleteEnd(){
	    if(head.next == null){
	      System.out.println("The Linked List is empty");
	    }
	    else{
	      Node temp = head.next;
	      while(temp.next.next != null){
	        temp = temp.next;
	      }
	      Node nodeToBeDeleted = temp;
	      System.out.println("The deleted node : "+nodeToBeDeleted.next.name);
	      nodeToBeDeleted.next = null;
	    }
	  }
	  
	  public void traverse(){
		  
		  Node temp = head;
		  if(head == null || temp.next == null){
			  System.out.println("The list is already empty");
			  return;
		  }
		  
		  System.out.println("Starting Linked List Traversal");
		  temp = temp.next;
		  while(temp != null){
			  
			  System.out.println(temp.name);
			  temp = temp.next;
		  }
	  }
}
