package com.quanchunlin;

public class OuterClass {
	
	private String name = "�ⲿ������";
	
	class InnerClass1 {
		
		private String InnerClass1Var = "�ڲ��� InnerClass1������";

		public void print() {
			
			System.out.println(OuterClass.this.name);
		}
	}
	
	public void fun1() {
		
		System.out.println(new InnerClass1().InnerClass1Var);
	}
	
	static class InnerClass2 {
		
		static String InnerClass2Var = "�ڲ��� InnerClass2������";
		
		public void print() {
			
			System.out.println("�ڲ� InnerClass2��print");
		}
	}
	
	public void fun2() {
		
		System.out.println(InnerClass2.InnerClass2Var);
	}
	
	private class InnerClass3 {
		
		private String InnerClass3Var = "�ڲ��� InnerClass3������";

		public void print() {
			
			System.out.println("�ڲ� InnerClass3��print");
		}
	}
	
	public void fun3() {
		
		System.out.println(new InnerClass3().InnerClass3Var);
	}
	
	public void fun4() {
		
		final String fun4Var = "fun4������";
		
		class InnerClass4 {
		
			public void print() {
				
				System.out.println(fun4Var); //�޵��� fun4Var ��� �������ó� final
			}
		}
		
		new InnerClass4().print();
	}
}
