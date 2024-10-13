package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorNew {
public static void main(String[] args) throws InterruptedException {
	//Launch the chrome browser
	WebDriver driver = new ChromeDriver();

	// Navigate to URL
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//CSS Selector
	driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("books");
	driver.findElement(By.cssSelector(".button-1.search-box-button]")).click();
}
}
