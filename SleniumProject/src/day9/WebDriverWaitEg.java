package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Get Pass")));
		driver.findElement(By.linkText("Get Pass")).click();

	}

}
