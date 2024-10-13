package ShadowWithElements;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRootEle1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[contains(text(),'Shadow')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//section[contains(text(),'Shadow')])[2]")).click();
		Thread.sleep(2000);
		
		//shadow host -> identify shadow host
		SearchContext shadow_host = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		shadow_host.findElement(By.cssSelector("input[type='text']")).sendKeys("SS");
		
		//shadow host for password
		SearchContext shadow_host_pass = driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		
		shadow_host_pass.findElement(By.cssSelector("input[type='text']")).sendKeys("SSTS");
	}

}
