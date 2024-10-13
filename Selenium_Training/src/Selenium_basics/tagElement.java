package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch the chrome browser
				WebDriver driver = new ChromeDriver();

				// Navigate to URL
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				//TagName Locator
				//Enter text in Subscribe text field
				//driver.findElement(By.tagName("input")).sendKeys("test@123.com");
				
				driver.findElement(By.id("newsletter-email")).sendKeys("test@123.com");
	}

}
