package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_IF_Name {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:////C");
		Thread.sleep(2000);

		//Switch to frame by index
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Google")).click();
	}

}
