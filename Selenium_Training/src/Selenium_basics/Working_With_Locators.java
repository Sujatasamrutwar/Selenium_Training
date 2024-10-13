package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Locators {
	public static void main(String[] args) {

//Launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//Enter the text in search text field
		//WebElement searchfield = driver.findElement(By.name("q"));
		//searchfield.sendKeys("books");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("books"); 
		
	}
}
