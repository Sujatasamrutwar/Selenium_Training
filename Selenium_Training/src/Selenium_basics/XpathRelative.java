package Selenium_basics;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRelative {
	public static void main(String[] args) throws InterruptedException {
		// Launch the chrome browser
					WebDriver driver = new ChromeDriver();

					// Navigate to URL
					driver.get("file:///C:/Users/User/Downloads/xpath1.html");
					driver.manage().window().maximize();
					Thread.sleep(2000);
						
	}
	
			
}
