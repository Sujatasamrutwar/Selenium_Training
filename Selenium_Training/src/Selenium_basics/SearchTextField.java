package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTextField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//Class name locator
		//Enter text in search text field
		driver.findElement(By.className("search-box-text")).sendKeys("books");
	}

}
