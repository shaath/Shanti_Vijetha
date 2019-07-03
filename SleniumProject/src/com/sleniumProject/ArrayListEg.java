package com.sleniumProject;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> AL=new ArrayList<Object>();
		
		AL.add("Selenium");
		AL.add(true);
		AL.add(70000);
		AL.add(444.44);
		AL.add('M');
		AL.add(2, "UFT");
		
		
		System.out.println(AL.size());

//		System.out.println(AL.get(2));
		for (int i = 0; i < AL.size(); i++)
		{
			System.out.println(AL.get(i));
			
		}
	}

}
