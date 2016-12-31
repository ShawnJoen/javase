package com.quanchunlin.link;

public interface Link {
	
	public abstract void add(Object data);
	
	public abstract void addAll(Object data[]);
	
	public abstract int size();
	
	public abstract boolean isEmpty();
	
	public abstract Object[] toArray();
	
	public abstract boolean contains(Object data);
	
	public abstract Object get(int index);
	
	public abstract void remove(Object data);
}