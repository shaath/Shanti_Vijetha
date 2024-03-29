package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimusBankLogin_TestNG 
{
	public static WebDriver driver;
	@BeforeClass
	public void Br_launch()
	{
		driver=new FirefoxDriver();
	}
	
	@BeforeMethod
	public void App_Launch()
	{
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
	}
	@Test
	public void App_Login()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	@AfterMethod
	public void App_logout()
	{
		driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
	}
	@AfterClass
	public void App_Close()
	{
		driver.close();
	}
}
