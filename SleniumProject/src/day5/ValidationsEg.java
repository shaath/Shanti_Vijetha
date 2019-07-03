package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidationsEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		
		WebElement logo=driver.findElement(By.id("hplogo"));
		if (logo.isDisplayed())
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
