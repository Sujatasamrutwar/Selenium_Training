package testNGBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWS2 {
	public WebDriver driver;

	@BeforeTest
	public void testName() {
		// launch application code

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Execution of before test is completed");
	}

	@AfterTest
	public void closeApp() {
		// code to close the application
		driver.quit();
		System.out.println("execution of after test is completed");
	}

	@Test
	public void searchTc() throws InterruptedException {
		// search test code
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']"));
		System.out.println("execution of search test is completed");
	}
	
	@Test
	public void Subscribe() {
		System.out.println("Executing subscribe test");
	}
}
