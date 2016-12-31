package com.quanchunlin.binarytree;

public class Binary {
	
	private Node root;
	
	public void add(String data) {
		
		if (data == null) {
			
			return;
		}
		
		Node newNode = new Node(data);
		
		if (this.root == null) {
			
			this.root = newNode;
		}else {
			
			this.root.addNode(newNode);
		}
	}
	
	public void print() {
		
		if (this.root != null) {
			
			this.root.printNode();
		}
	}
}