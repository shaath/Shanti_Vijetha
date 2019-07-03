package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell/Desktop/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://twitter.com");
		driver.manage().window().maximize();

	}

}
