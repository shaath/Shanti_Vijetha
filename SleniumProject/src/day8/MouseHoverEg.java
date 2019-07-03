package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.id("nav-link-shopall"));
		
		Actions act=new Actions(driver);
		act.moveToElement(cat).build().perform();
		
		Thread.sleep(3000);
		WebElement mc=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		
		act.moveToElement(mc).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Power Banks']")).click();

	}

}
