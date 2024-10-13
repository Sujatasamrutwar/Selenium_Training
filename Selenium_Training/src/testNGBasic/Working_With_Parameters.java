package testNGBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_With_Parameters {

	@Parameters({"URL", "Search"})
	
	@Test
public void searchTest(String url, String search) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.findElement(By.id("small-searchterms")).sendKeys(search);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	driver.close();
}
}
