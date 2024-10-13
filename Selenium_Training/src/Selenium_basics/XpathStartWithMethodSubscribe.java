package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathStartWithMethodSubscribe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Enter the text in subscribe text field
		
		driver.findElement(By.xpath("//input[starts-with(@name,'News')]")).sendKeys("test@123.com");
		driver.findElement(By.xpath("//input[starts-with(@value,'Subscribe')]")).click();
		
		//driver.findElement(By.xpath("//a[ends-with(text(),'centis')]")).click();
	}

}
