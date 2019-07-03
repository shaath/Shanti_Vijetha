package com.sleniumProject;

public class ReverseString {

	public static void main(String[] args)
	{
		String name="Shanthi";
		StringBuilder sb=new StringBuilder(name);
		
//		for (int i = name.length()-1; i >= 0; i--)
//		{
//			sb.append(name.charAt(i));
//		}
//		
//		System.out.println(sb.toString());
		
		System.out.println(sb.reverse().toString());
	}

}
