package com.sleniumProject;

public class TwoDimArrayEg {

	public static void main(String[] args)
	{
		Object[][] x=new Object[2][3];
		
		System.out.println(x.length);
		
		System.out.println(x[0].length);

		x[0][2]="Selenium";
		x[1][1]=70000;
		
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
			}
		}
	}

}
