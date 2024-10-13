package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAbsoluteVote {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// Navigate to URL 
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='pollanswers-2']")).click();
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		
	}

}
