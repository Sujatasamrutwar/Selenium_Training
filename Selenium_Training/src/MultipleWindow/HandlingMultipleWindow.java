package MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://");
		Thread.sleep(2000);
		
		String parentwindow = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		
		Set<String> childwindow = driver.getWindowHandles();
		
		for (String window : childwindow) {
			driver.switchTo().window(window);
			if(driver.getTitle().contains("Facebook")) {
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("sujata1april@gmail.com");
				driver.close();
			}
		}
		
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit'")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
