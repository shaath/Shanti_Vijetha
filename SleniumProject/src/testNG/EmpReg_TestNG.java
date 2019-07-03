package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_TestNG extends TestNGMaster
{
	@Test(dataProvider="data")
	public void org_EmpReg(String f,String l,String Eid)
	{
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(Eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		Assert.assertEquals(actval, expval, "Employee Registration Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x=new Object[5][3];
		
		x[0][0]="Automation";
		x[0][1]="Tester";
		x[0][2]="TA5643";
		
		x[1][0]="Automation";
		x[1][1]="Tester";
		x[1][2]="TA3443";
		
		x[2][0]="Automation";
		x[2][1]="Tester";
		x[2][2]="TA5673";
		
		x[3][0]="Automation";
		x[3][1]="Tester";
		x[3][2]="TA5609";
		
		x[4][0]="Automation";
		x[4][1]="Tester";
		x[4][2]="TA9653";
		
		return x;
	}
}
