package testNGBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class searchTestCase {
@Test
public void search() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Reporter.log("Application Launched successfully");
	driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Reporter.log("Search TC completed");
	driver.close();
}
}
