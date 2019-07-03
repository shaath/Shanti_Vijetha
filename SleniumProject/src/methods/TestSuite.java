package methods;

import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//Login
		OrgHRMLib om=new OrgHRMLib();
		
		
		String res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed Successfully");

		//EmpReg
		res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.Org_EmpReg("Shanthi", "Vijetha", "SV6784");
		System.out.println("Employee Regitration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed Successfully");
		
		//Userreg
		
		res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.org_UserReg("Shanthi Vijetha", "SV123456789321", "SV@s123456789321", "SV@s123456789321");
		System.out.println("User registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed Successfully");
		
		//UserLogin
		res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("SV123456789321", "SV@s123456789321");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed Successfully");

	}

}
