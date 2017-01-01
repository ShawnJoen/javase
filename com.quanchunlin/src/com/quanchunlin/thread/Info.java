package com.quanchunlin.thread;

public class Info {
	
	private String title;
	
	private String content;
	
	private boolean flag = true;

	public synchronized void set(String title , String content) {
		
		if (this.flag == false) {
			
			try{
				
				super.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try	{
			
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		this.title = title;
		
		this.content = content;
		
		this.flag = false;
		
		super.notify();
	}
	
	public synchronized void get() {
		
		if (this.flag == true) {
		
			try {
				
				super.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(this.title+" - "+this.content);
		
		this.flag = true;
		
		super.notify();
	}
}
