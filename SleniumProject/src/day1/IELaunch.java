package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
			

	}

}
