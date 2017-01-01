package com.quanchunlin;

import com.quanchunlin.OuterClass.InnerClass2;
import com.quanchunlin.binarytree.Binary;
import com.quanchunlin.book.Book;
import com.quanchunlin.book.BookShop;
import com.quanchunlin.book.ComputerBook;
import com.quanchunlin.link.Link;
import com.quanchunlin.thread.Customer;
import com.quanchunlin.thread.Info;
import com.quanchunlin.thread.Product;

public class Main {

	public static void main(String[] args) {
		/*
		 * 整数数组 排序，反转
		 * */
		/*
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
		}*/
		/*
		 * 内部类的 基本操作
		 * */
		/*
		new OuterClass().fun1(); //内部类 InnerClass1的属性
		OuterClass.InnerClass1 inner1 = new OuterClass().new InnerClass1();
		inner1.print(); //外部类属性
		
		new OuterClass().fun2(); //内部类 InnerClass2的属性
		OuterClass.InnerClass2 inner2 = new OuterClass.InnerClass2();
		inner2.print(); //内部 InnerClass2的print
		
		new OuterClass().fun3(); //内部类 InnerClass3的属性
		//OuterClass.InnerClass3 inner3 = new OuterClass().new InnerClass3(); //因为是 private所以在外部无法实例化

		new OuterClass().fun4(); //fun4的属性
		*/
		/*
		 * 断言
		 * Run > Run Confi.. > Arguments 添加 -ea 执行时 开启断言，如不填 默认无视 断言
		 * */
		/*
		int num = 10;
		assert num == 20 : "不是20";
		System.out.println(num); //开启断言时 输出 Exception in thread "main" java.lang.AssertionError: 不是20
		*/
		/*
		 * 单例设计， 多例设计
		 * */
		/*
		Singleton.getInstance().print(); //输出 单例设计 print
		MultiplePatterns.getColor(1).print(); //蓝色
		MultiplePatterns.getColor(2).print(); //绿色
		MultiplePatterns.getColor(3).print(); //红色
		*/
		/*
		 * 链表实现
		 * */
		/*BookShop shop = new BookShop();
		shop.add(new ComputerBook("kotlin","张三"));
		shop.add(new ComputerBook("android","龙贺"));
		shop.add(new ComputerBook("php","朱颖"));
		shop.add(new ComputerBook("php","李辉"));
		shop.delete(new ComputerBook("android","龙贺"));
		
		Book book = (Book)shop.get(1);
		System.out.println(book.getTitle());
		
		shop.addAll();
		
		Link shopData = shop.search("php");
		if(shopData == null) {
			
			System.out.println("无此书");
		}else {
			
			Object books[] = shopData.toArray();
			for (int i = 0 ; i < books.length ; i++) {
				
				System.out.println(books[i]);
			}
		}*/
		/*
		 * 二叉树
		 * */
		/*Binary binary = new Binary();
		binary.add("4");
		binary.add("2");	
		binary.add("1");
		binary.add("3");
		binary.add("5");
		binary.add("6");
		binary.print();*/
		/*
		 * 生产者 和 消费者
		 * */
		/*
		Info info = new Info();
		new Thread(new Product(info)).start();
		new Thread(new Customer(info)).start();
		*/
		
		
	}
}
