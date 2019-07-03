package com.sleniumProject;

public class RevStringEg {

	public static void main(String[] args)
	{
		String name="malayalam";	//muineleS
		String rev="";
		int len=name.length();
		
		for (int i = len-1; i >= 0; i--) 
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		if (name.equalsIgnoreCase(rev))
		{
			System.out.println("The given string is polyndrome");
		}
		else
		{
			System.out.println("The given string is not a polyndrome");
		}

	}

}
