package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalanderEg {

	public static void main(String[] args) throws InterruptedException 
	{
		String date="18-November-2019";
		String[] split=date.split("-");
		String day=split[0];
		String month=split[1];
		String year=split[2];
		System.out.println(day+"---"+month+"----"+year);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(3000);
		//Year selection
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!calyear.equals(year))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		//month Selection
		String calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calMonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		//Day selection
		List<WebElement> cols=driver.findElements(By.xpath("(//table[@class='calendar'])[1]/tbody/tr/td"));
		for (int i = 0; i < cols.size(); i++)
		{
			String calday=cols.get(i).getText();
			
			if (calday.equals(day))
			{
				cols.get(i).click();
				break;
			}
		}
		
	}

}