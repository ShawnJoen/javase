package com.quanchunlin.link;

public class LinkImpl implements Link {

	private class Node {
		
		private Object data;
		
		private Node next;
		
		public Node(Object data) {
			
			this.data = data;
		}
		
		public void addNode(Node newNode) {
			
			if (this.next == null) {
				
				this.next = newNode;
			}else {
				
				this.next.addNode(newNode);
			}
		}
		
		public void toArrayNode() {

			LinkImpl.this.regData[LinkImpl.this.foot++] = this.data;
			
			if (this.next != null) {
				
				this.next.toArrayNode();
			}
		}
		
		public boolean containsNode(Object data) {
			
			if (this.data.equals(data)) {
			
				return true;
			}else {
				
				if (this.next != null) {
					
					return this.next.containsNode(data);
				}else {
					
					return false;
				}
			}
		}
		
		public void removeNode(Node previous ,Object data) {
			
			if (this.data.equals(data)) {
			
				previous.next = this.next;
			}else {
				
				this.next.removeNode(this, data);
			}
		}
	}
	
	private Node root;
	
	private int count = 0;
	
	private Object regData[] = null;
	
	private int foot = 0;
	
	public void add(Object data) {
		
		if (data == null) {
			
			return;
		}
		
		Node newNode = new Node(data);
		
		if (this.root == null) {
			
			this.root = newNode;
		}else {
			
			this.root.addNode(newNode);
		}
		
		this.count++;
	}
	
	public void addAll(Object data[]) {
		
		if (data == null) {
			
			return;
		}
		
		for (int i = 0 ; i < data.length ; i++ ) {
			
			System.out.println(data[i]);
		}
	}
	
	public int size() {
		
		return this.count;
	}
	
	public boolean isEmpty() {
		
		return this.count == 0;
	}
	
	public Object[] toArray() {

		this.regData = new Object[this.count];
		
		this.foot = 0;

		this.root.toArrayNode();
		
		return this.regData;
	}
	
	public boolean contains(Object data) {
		
		if (data == null || this.root == null) {
			
			return false;
		}
		
		return this.root.containsNode(data);
	}
	
	public Object get(int index) {
		
		if ( index > this.count) {
			
			return null;
		}
		
		return this.toArray()[index];
	}
	
	public void remove(Object data) {
		
		if (this.contains(data)) {
			
			if (this.root.data.equals(data)) {
				
				this.root = this.root.next;
			}else {
				
				this.root.next.removeNode( this.root , data);
			}
			
			this.count--;
		}
	}
}