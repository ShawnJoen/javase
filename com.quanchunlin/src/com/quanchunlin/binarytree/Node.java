package com.quanchunlin.binarytree;

public class Node {
	
	private String data;
	
	private Node left;
	
	private Node right;
	
	public Node(String data) {
		
		this.data = data;
	}
	
	public String getData() {
		
		return this.data;
	}
	
	public void setLeft(Node left) {
		
		this.left = left;
	}
	
	public Node getLeft() {
		
		return this.left;
	}
	
	public void setRight(Node right) {
		
		this.right = right;
	}
	
	public Node getRight() {
		
		return this.right;
	}
	
	public void addNode(Node newNode) {
		
		if (newNode.data.compareTo(this.data) < 0) {
			
			if (this.left == null) {
				
				this.left = newNode;
			}else {
				
				this.left.addNode(newNode);
			}
		}else {
			
			if (this.right == null) {
				
				this.right = newNode;
			}else {
				
				this.right.addNode(newNode);
			}
		}
	}
	
	public void printNode() {
		
		if (this.left != null) {
			
			this.left.printNode();
		}
		
		System.out.println(this.data);
		
		if (this.right != null) {
			
			this.right.printNode();
		}
	}
}