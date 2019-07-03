package com.sleniumProject;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		int[] x=new int[5];
		
		System.out.println(x.length);
		
		x[1]=40000;
		x[3]=60000;
		x[1]=50000;
		
//		System.out.println(x[2]);
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}
	}

}
