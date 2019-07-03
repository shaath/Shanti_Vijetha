package com.sleniumProject;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args)
	{
		HashSet<String> s=new HashSet<String>();
		
		s.add("Selenium");
		s.add("Boll");
		s.add("Shanthi");
		s.add("Vijetha");
		s.add("Apple");
		s.add("Boll");
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String x=it.next();
			System.out.println(x);
		}
		
		

	}

}
