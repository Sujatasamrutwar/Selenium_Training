package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_with_FluentWait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement searchtext = driver.findElement(By.id("small-searchterms"));
		//WebDriverWait is nothing but the explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(searchtext));
		
		 driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 Thread.sleep(1000);
		 
		 WebElement searchpage = driver.findElement(By.xpath("//h1[text()='Search']"));
		 
		 //Synchronization point for search text
		 wait.until(ExpectedConditions.visibilityOf(searchpage));
		 
		 driver.quit();

	}

}
