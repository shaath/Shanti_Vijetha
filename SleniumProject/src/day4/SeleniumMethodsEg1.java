package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class SeleniumMethodsEg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		Sleeper.sleepTight(5000);
		driver.navigate().to("http://facebook.com");
		Sleeper.sleepTight(5000);
		driver.navigate().back();
		Sleeper.sleepTight(5000);
		driver.navigate().forward();
		Sleeper.sleepTight(5000);
		driver.navigate().refresh();
		

	}

}
