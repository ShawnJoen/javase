package com.quanchunlin;

public class ReverseArray extends Array
{
	public ReverseArray(int length)
	{
		super(length);
	}
	public int[] getData()
	{
		int center = super.getData().length / 2;
		int head = 0;
		int tail = super.getData().length - 1;
		for (int i = 0 ; i < center ; i++ )
		{
			int temp = super.getData()[head];
			super.getData()[head++ ] = super.getData()[tail];
			super.getData()[tail-- ]	= temp;

		}
		return super.getData();
	}
}