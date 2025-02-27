package alertsAndNotifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Dismiss {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("9678");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		System.out.println("Alert was handled with dismiss method");
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
