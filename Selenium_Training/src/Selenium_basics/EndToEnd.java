package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {
	public static void main(String[] args) throws InterruptedException {
		//Launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click on registration Link
		driver.findElement(By.linkText("Register")).click();
		
		//Enter the first name in text field
		driver.findElement(By.name("FirstName")).sendKeys("Sujata");
		
		//Enter the LastName in text field
		driver.findElement(By.id("LastName")).sendKeys("Samru");
		
		//Enter email in email text field
		driver.findElement(By.id("Email")).sendKeys("sujata@testyantra.com");
		
		//Enter password in the password field
		driver.findElement(By.name("Password")).sendKeys("secret");
		
		//Enter confirm password details in the text field
		driver.findElement(By.id("ConfirmPassword")).sendKeys("secret");
		
		//Click on Registration Button
		driver.findElement(By.id("register-button")).click();
		
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
	}	
	}

