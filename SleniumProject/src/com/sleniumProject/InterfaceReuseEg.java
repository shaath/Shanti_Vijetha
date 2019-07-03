package com.sleniumProject;

public class InterfaceReuseEg {

	public static void main(String[] args)
	{
//		Interface_ImplementsEg1 im1=new Interface_ImplementsEg1();
//		im1.vehicle();
//		im1.ship();
//		im1.plane();
//		im1.merine();
		
//		Interface_ImplementsEg2 im2=new Interface_ImplementsEg2();
//		im2.vehicle();
//		im2.ship();
//		im2.plane();
//		im2.merine();
		
		Interface_Parent im3=new Interface_ImplementsEg1();
		im3.vehicle();
		im3.ship();
		im3.plane();
		im3.merine();
		
		Interface_Parent im4=new Interface_ImplementsEg2();
		im4.vehicle();
		im4.ship();
		im4.plane();
		im4.merine();
	}

}
