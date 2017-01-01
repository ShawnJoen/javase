package com.quanchunlin.thread;

public class Customer implements Runnable {
	
	private Info info;
	
	public Customer(Info info) {
		
		this.info = info;
	}
	
	public void run() {
		
		for (int i = 0 ; i < 10 ; i++ ) {
			
			this.info.get();
		}
	}
}
