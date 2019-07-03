package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoFillersEg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("H");
		Thread.sleep(3000);
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		
//		System.out.println(options.size());
		for (int i = 0; i < options.size(); i++) 
		{
			String name=options.get(i).getText();
//			System.out.println(name);
			if (name.equalsIgnoreCase("Haridwar")) 
			{
				options.get(i).click();
				break;
			}
		}
		
	}

}
