package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.name("country"));
		
		Select s=new Select(drop);
		List<WebElement> country=s.getOptions();
		System.out.println(country.size());
		
		for (int i = 0; i < country.size(); i++)
		{
			s.selectByIndex(i);
			String cname=country.get(i).getText();
			System.out.println(cname);
		}

	}

}
