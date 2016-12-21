package com.puneet.user;

public class BST {

	public Node head;
	  
	  public BST(){
	    head = new Node(null);
	  }
	  
	  public static void main(String args[]){
		  BST binarySearchTree = new BST();
		  binarySearchTree.addANode("Kaku");
		  binarySearchTree.addANode("puneet");
		  binarySearchTree.addANode("Kamnran");
		  binarySearchTree.addANode("Kamnran");
		  binarySearchTree.preOrder(binarySearchTree.head.right);
		  //binarySearchTree.postOrder(binarySearchTree.head);
		  //binarySearchTree.inOrder(binarySearchTree.head);
		  
	  }
	  public Node createANode(String name){
	    
	    Node newNode = new Node(name);
	    if(newNode == null){
	      System.out.println("Node cannot be created. There's not enough memory available.");
	      return null;
	    }
	    return newNode;
	  }
	  
	  public void addANode(String name){
	    
	    Node newNode = createANode(name);
	    
	    if(head.right == null){
	      System.out.println("This is the first node created ");
	      head.right = newNode;
	      System.out.println("The node added is "+name);
	    }
	    
	    else if((head.right.left == null) && (head.right.right == null)){
	      if(name.compareTo(head.right.name) > 0){
	        head.right.right = newNode;
	      }
	      else if(name.compareTo(head.right.name) < 0){
	        head.right.left = newNode;
	      }
	      else{
	        System.out.println("This is a duplicate Node. Cannot add duplicate node.");
	        return;
	      }
	      System.out.println("The node added is "+name);
	      return;
	    }
	    
	    else{
	    	
	    	Node temp = findPosition(name, true);
	    	if(temp == null){
	    		System.out.println("Duplicate Node cannot be added.");
	    		return;
	    	}
	    	else{
	    	
	    		if(name.compareTo(temp.name) > 0){
	    			temp.right = newNode;
	    		}
	    		else{
	    			temp.left = newNode;
	    		}
	    	}
	    }
	    
	  }
	  
	  public Node findPosition(String name, boolean add){
	    
	    Node nodeToBeFound = head.right;
	    Node parentNode = head.right;
	    
	    while(nodeToBeFound != null){
	      if((name.compareTo(nodeToBeFound.name) > 0) ){
	        if(nodeToBeFound.right == null){
	        	return nodeToBeFound;
	        }
	    	parentNode = nodeToBeFound;
	        nodeToBeFound = nodeToBeFound.right;
	      }
	      else if((name.compareTo(nodeToBeFound.name) < 0)){
	    	if(nodeToBeFound.left == null){
		        	return nodeToBeFound;
		    }
	        parentNode = nodeToBeFound;
	        nodeToBeFound = nodeToBeFound.left;
	      }
	      else{
	        if(add == true){
	        	System.out.println("This is a duplicate node. Cannot add duplicate node.");
	        	return null;
	        }
	        else{
	          return parentNode;
	        }
	      }
	    }
	    return null;
	  }
	  
	  public void deleteANode(String name){
	    
	  }
	  
	  public void preOrder(Node temp){
	    if(temp == null){
	      return;
	    }
	    System.out.println(temp.name);
	    preOrder(temp.left);
	    preOrder(temp.right);
	  }
	  
	  public void inOrder(Node temp){
	    if(temp == null){
	      return;
	    }
	    preOrder(temp.left);
	    System.out.println(temp.name);
	    preOrder(temp.right);
	  }
	  
	  public void postOrder(Node temp){
	    if(temp == null){
	      return;
	    }
	    preOrder(temp.left);
	    preOrder(temp.right);
	    System.out.println(temp.name);
	  }
	  
}
