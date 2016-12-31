package com.quanchunlin;

public class Singleton {
	
	private static final Singleton INSTANCE = new Singleton();

	private Singleton(){}
	
	public static Singleton getInstance()
	{
		return INSTANCE;
	}
	
	public void print()
	{
		System.out.println("µ¥ÀýÉè¼Æ print");
	}
}
