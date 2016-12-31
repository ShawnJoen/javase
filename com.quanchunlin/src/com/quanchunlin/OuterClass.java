package com.quanchunlin;

public class OuterClass {
	
	private String name = "外部类属性";
	
	class InnerClass1 {
		
		private String InnerClass1Var = "内部类 InnerClass1的属性";

		public void print() {
			
			System.out.println(OuterClass.this.name);
		}
	}
	
	public void fun1() {
		
		System.out.println(new InnerClass1().InnerClass1Var);
	}
	
	static class InnerClass2 {
		
		static String InnerClass2Var = "内部类 InnerClass2的属性";
		
		public void print() {
			
			System.out.println("内部 InnerClass2的print");
		}
	}
	
	public void fun2() {
		
		System.out.println(InnerClass2.InnerClass2Var);
	}
	
	private class InnerClass3 {
		
		private String InnerClass3Var = "内部类 InnerClass3的属性";

		public void print() {
			
			System.out.println("内部 InnerClass3的print");
		}
	}
	
	public void fun3() {
		
		System.out.println(new InnerClass3().InnerClass3Var);
	}
	
	public void fun4() {
		
		final String fun4Var = "fun4的属性";
		
		class InnerClass4 {
		
			public void print() {
				
				System.out.println(fun4Var); //无调用 fun4Var 需把 属性设置成 final
			}
		}
		
		new InnerClass4().print();
	}
}
