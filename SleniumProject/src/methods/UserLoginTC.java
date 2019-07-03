package methods;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		OrgHRMLib om=new OrgHRMLib();
		
		String res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("GND123456789321", "GND@s123456789321");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed Successfully");


	}

}
