package com.quanchunlin;

public class MultiplePatterns {
	
	private String value;
	private static final MultiplePatterns BLUE = new MultiplePatterns("À¶É«");
	private static final MultiplePatterns GREEN = new MultiplePatterns("ÂÌÉ«");
	private static final MultiplePatterns RED = new MultiplePatterns("ºìÉ«");
	
	private MultiplePatterns(){}
	
	private MultiplePatterns(String value)
	{
		this.value = value;
	}
	
	public static MultiplePatterns getColor(int check)
	{
		switch (check)
		{
			case 1: return BLUE;
			case 2: return GREEN;
			case 3: return RED;
			default :
				return null;
		}
	}
	
	public void print()
	{
		System.out.println(this.value);
	}
}
