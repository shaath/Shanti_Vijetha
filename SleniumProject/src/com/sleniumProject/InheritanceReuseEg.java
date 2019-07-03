package com.sleniumProject;

public class InheritanceReuseEg extends MethodsEg
{

	public static void main(String[] args)
	{
		function1();
		
		MethodsEg m=new MethodsEg();
//		m.function4();
		m.function3();
//		InheritanceReuseEg im=new InheritanceReuseEg();
//		im.sample();
//		im.function3();
		
		
	}

	public void sample()
	{
		function3();
		function1();
	}
	
	public static void function1()
	{
		System.out.println("This is child class function1 code");
	}
	
	public void function3()
	{
		System.out.println("This is child class function3 code");
	}
}
