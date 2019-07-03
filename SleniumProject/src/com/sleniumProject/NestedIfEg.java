package com.sleniumProject;

public class NestedIfEg {

	public static void main(String[] args) 
	{
		int a=10;
		int b=50;
		int c=3;
		
		if (a > b & a > c)
		{
			System.out.println("A is greater");
		}
		else if (b > c & b > a) 
		{
			System.out.println("B is greater");
		}
		else if (c > a & c > b) 
		{
			System.out.println("C is greater");
		}

	}

}
