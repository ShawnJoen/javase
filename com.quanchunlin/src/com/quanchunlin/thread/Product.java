package com.quanchunlin.thread;

public class Product implements Runnable {
	
	private Info info;
	
	public Product(Info info) {
		
		this.info = info;
	}
	
	public void run() {
		
		for (int i = 0 ; i < 10 ; i++) {
			
			if (i % 2 == 0) {
				
				this.info.set("水果","橙子");
			}else {
				
				this.info.set("动物","喵喵");
			}
		}
	}
}