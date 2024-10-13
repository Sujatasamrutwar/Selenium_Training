package testNGBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
@Test
public void assertDemo() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	//Assert for the Application launch
	String title = driver.getTitle();
	
	//Assert tool class
	Assert.assertEquals(title, "Demo Web Shop");
	driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	String value = driver.findElement(By.xpath("//h1[text()='Search']")).getText();
	
	//Assert for the given search condition
	//Assert.assertEquals(value, "Search", "Given text in computer search page was not displayed");

	driver.close();
	
	
}
}
