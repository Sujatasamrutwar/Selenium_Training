package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch the chrome browser
				WebDriver driver = new ChromeDriver();

				// Navigate to URL
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				
				//LinkText Locator
				//Click on register Link
				driver.findElement(By.linkText("Register")).click();
				
				//Click on Login Link
				driver.findElement(By.linkText("Login")).click();
				
	
	}

}
