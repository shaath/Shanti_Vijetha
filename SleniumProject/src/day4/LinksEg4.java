package day4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class LinksEg4 {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]"));
		List<WebElement> links1=block.findElements(By.tagName("a"));
		
		System.out.println(links1.size());
		
		for (int i = 0; i < links1.size(); i++)
		{
			String name=links1.get(i).getText();
			System.out.println(name);
			
			links1.get(i).click();
			Sleeper.sleepTightInSeconds(5);
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("E:\\ShanthiVijethaRecordings\\Workspace\\SleniumProject\\src\\screenshots\\"+name+".png"));

			
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(5);
			block=driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]"));
			links1=block.findElements(By.tagName("a"));
		}

	}

}
