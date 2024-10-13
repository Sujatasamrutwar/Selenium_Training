package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStartsWithMethod {
public static void main(String[] args) throws InterruptedException {
	
	// Launch the chrome browser
	WebDriver driver = new ChromeDriver();

	// Navigate to URL
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[starts-with(text(),'Electro')])[1]")).click();
	
}
}
