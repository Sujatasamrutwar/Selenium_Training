package alertsAndNotifications;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

     //Click on Search button without entering text in search text field
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
    //Handle the alert
		Alert ale = driver.switchTo().alert();
		ale.accept();
		System.out.println("Alert was handled successfully");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Alert was handled");
	}

}
