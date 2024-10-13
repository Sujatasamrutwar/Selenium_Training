package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_IF_WebDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:////C");
		Thread.sleep(2000);

		//Switch to frame by WebElement
		driver.switchTo().frame(driver.findElement(By.id("FR1")));
		
		driver.findElement(By.id("newsletter-email")).sendKeys("aaa@test.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
	}

}
