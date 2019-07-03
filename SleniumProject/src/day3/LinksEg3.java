package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		
//		List<WebElement> links=driver.findElements(By.xpath("//table[@id='Table_011']//a"));
		
//		WebElement block=driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]"));
//		List<WebElement> links1=block.findElements(By.tagName("a"));
//		
//		System.out.println(links1.size());
//		
//		for (int i = 0; i < links1.size(); i++)
//		{
//			String name=links1.get(i).getText();
//			System.out.println(name);
//			if (name.equalsIgnoreCase("Home"))
//			{
//				links1.get(i).click();
//				break;
//			}
//		}
		
		driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]")).findElement(By.linkText("Home")).click();

	}

}
