package com.quanchunlin.book;

import com.quanchunlin.link.Link;
import com.quanchunlin.link.LinkImpl;

public class BookShop {
	
	private Link books;
	
	public BookShop() {
		
		this.books = new LinkImpl();
	}
	
	public void add(Book book) {
		
		this.books.add(book);
	}
	
	public void delete(Book book) {
		
		this.books.remove(book);
	}
	
	public Object get(int index) {
		
		return this.books.get(index);
	}
	
	public void addAll() {
		
		this.books.addAll(this.books.toArray());
	}
	
	public Link search(String keyWord) {
	
		Link result = new LinkImpl();
		
		Object obj[] = this.books.toArray();

		int key = 0;
		
		for (int i = 0 ; i < obj.length ; i++) {
			
			Book book = (Book)obj[i];
			
			if (book.getTitle().indexOf(keyWord) != -1 || book.getAuther().indexOf(keyWord) != -1) {

				result.add(book);
				
				key++;
			}
		}
		
		if(key == 0) {
			
			return null;
		}
		
		return result;
	}
}
