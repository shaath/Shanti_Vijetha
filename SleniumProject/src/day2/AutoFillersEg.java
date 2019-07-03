package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Test");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='erkvQe']/li[2]")).click();

	}

}
