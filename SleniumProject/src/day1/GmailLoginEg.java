package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginEg {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell/Desktop/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("seleniumtrainer449@gmail.com");
		
		driver.findElement(By.className("CwaK9")).click();
		
//		Thread.sleep(10000);
		
		driver.findElement(By.name("password")).sendKeys("1234567890");
		driver.findElement(By.className("CwaK9")).click();
		

	}

}
