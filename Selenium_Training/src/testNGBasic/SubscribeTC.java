package testNGBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SubscribeTC {
@Test

public void subscribe() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Reporter.log("Application launched successfully");
	
	driver.findElement(By.id("newsletter-email")).sendKeys("sujata@test.com");
	driver.findElement(By.id("newsletter-subscribe-button")).click();
	
	driver.close();
	Reporter.log("Subscribe TC completed");
}
}
