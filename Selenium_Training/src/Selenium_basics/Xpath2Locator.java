package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// Navigate to URL
		driver.get("file:///C:/Users/User/Downloads/xpath1.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// XPath Locator
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("SST");

		// Lastname field
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("SSTSS");

		// Company Name
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Tek");

		// Location
		driver.findElement(By.xpath("/html/body/input[4]")).sendKeys("Blg");

	}

}
