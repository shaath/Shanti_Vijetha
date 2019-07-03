package com.sleniumProject;

public class MethodsEg {

	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		
		m.function3();
		boolean flag=m.function4();
		System.out.println(flag);
	}
	
	//static method without returning a value
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	
	//static method with returning value
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}

	//non static method without returning value
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	
	//Non static method with returning value
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	public int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public String sum(String a,String b)
	{
		return a+b;
	}
	
}
