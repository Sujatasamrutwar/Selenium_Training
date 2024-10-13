package testNGBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VoteTest {
@Test
public void vote(){ 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Reporter.log("Application launched successfully");
	
	driver.findElement(By.id("pollanswers-1")).click();
	driver.findElement(By.id("vote-poll-1")).click();
	
	Reporter.log("vote TC are completed");
	driver.close();
}
}
