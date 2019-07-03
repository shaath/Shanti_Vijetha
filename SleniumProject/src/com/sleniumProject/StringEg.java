package com.sleniumProject;

public class StringEg {

	public static void main(String[] args) 
	{
		int count=0;
		String x="Selenium";
		
		int len=x.length();
//		System.out.println(len);
		
//		System.out.println(x.charAt(2));
		
//		System.out.println(x.substring(2, 5));
		
//		System.out.println(x.replace('n', 'x'));	
		
//		System.out.println(x.indexOf('e'));
		
		for (int i = 0; i < len; i++) 
		{
			char ch=x.charAt(i);
			if (ch=='e')
			{
				count=count+1;
			}
			
			if (count==4)
			{
				System.out.println("The 2nd occurence od e is: "+i);
				break;
			}
		}
		
		
		
	}

}
