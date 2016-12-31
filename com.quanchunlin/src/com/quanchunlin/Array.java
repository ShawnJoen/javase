package com.quanchunlin;

public class Array {
	
	private int data[] = null;
	
	private int foot = 0;

	public Array(int length)
	{
		if (length > 0)
		{
			this.data = new int[length];
		}else
		{
			this.data = new int[1];
		}
	}

	public boolean add(int num)
	{
		if (this.foot < this.data.length)
		{
			this.data[	this.foot++	]	= num;
			return true;
		}
		
		return false;
	}
	
	public void increment(int length)
	{
		int newArray[] = new int[this.data.length + length];
		System.arraycopy(this.data , 0 , newArray , 0 , this.data.length);
		this.data = newArray;
	}
	
	public int[] getData()
	{
		return this.data;
	}
}
