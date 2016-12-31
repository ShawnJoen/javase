package com.quanchunlin;

public class Main {

	public static void main(String[] args) {
		/*
		 * JAVA复习基础
		 * */
		//ReverseArray arr = new ReverseArray(4); //开辟可以反转的 4个元素的 空数组
		SortArray arr = new SortArray(4); //开辟可以排序的 4个元素的 空数组
		System.out.println(arr.add(1));
		System.out.println(arr.add(5));
		System.out.println(arr.add(3));
		System.out.println(arr.add(7));
		arr.increment(3); //增加 数组 元素个数 3
		System.out.println(arr.add(9));
		System.out.println(arr.add(2));
		System.out.println(arr.add(4));
		int arr2[] = arr.getData();
		for (int i = 0 ; i < arr2.length ; i++ ){
			System.out.println(arr2[i]); //输出 排序,反转后的 数组
		}
		

	}
}
