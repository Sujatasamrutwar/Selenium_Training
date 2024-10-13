package ShadowWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SE2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/");
	Thread.sleep(1000);
	
	//Login Attached text
	driver.findElement(By.xpath("//h1[txt()='Login']")).click();
	
	Actions action = new Actions(driver);
	action.sendKeys(Keys.TAB).perform();
	Thread.sleep(2000);
	action.sendKeys("SS").perform();
	action.sendKeys(Keys.TAB).perform();
	Thread.sleep(2000);
	action.sendKeys("SSTS").perform();
	
	
}
}
