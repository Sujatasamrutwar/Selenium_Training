package testNGBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperAttribute {
@Test(invocationCount = 3, threadPoolSize = 2)
public void TC1() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.id("small-searchterms")).sendKeys("computer");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	driver.close();
}
}
