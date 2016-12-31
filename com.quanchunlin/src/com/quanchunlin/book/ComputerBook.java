package com.quanchunlin.book;

public class ComputerBook implements Book {
	
	private String title;
	
	private String auther;
	
	public ComputerBook(String title, String auther) {
		
		this.title = title;
		
		this.auther = auther;
	}
	
	public String getTitle() {
		
		return this.title;
	}
	
	public String getAuther() {
		
		return this.auther;
	}
	
	public String toString() {
		
		return "计算机类图书："+this.title+"，作者："+this.auther;
	}
	
	public boolean equals(Object obj) {
		
		if (obj == null) {
			
			return false;
		}
		
		if (this == obj) {
			
			return true;
		}
		
		if (!(obj instanceof ComputerBook)) {
		
			return false;
		}
		
		ComputerBook book = (ComputerBook)obj;
		
		if (book.title.equals(this.title) && book.auther.equals(this.auther)) {
			
			return true;
		}
		
		return false;
	}
}