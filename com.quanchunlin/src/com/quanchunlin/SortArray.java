package com.quanchunlin;

public class SortArray extends Array
{
	public SortArray(int length)
	{
		super(length);
	}
	public int[] getData()
	{
		java.util.Arrays.sort(super.getData());
		return super.getData();
	}
}