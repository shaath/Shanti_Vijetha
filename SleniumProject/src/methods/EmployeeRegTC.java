package methods;

import java.io.IOException;

public class EmployeeRegTC {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		OrgHRMLib om=new OrgHRMLib();
		
		String res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.Org_EmpReg("Nidish", "G", "GND6784");
		System.out.println("Employee Regitration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed Successfully");

	}

}
