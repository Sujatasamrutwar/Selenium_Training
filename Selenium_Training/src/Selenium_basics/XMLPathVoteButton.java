package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XMLPathVoteButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click on Vote Button with combination of AN & AV(and, OR)
		
		driver.findElement(By.xpath("//input[@type='button' and @id='vote-poll-1']")).click();
		
		//driver.findElement(By.xpath("//span[@class='cart-label' or text()='Shopping cart']")).click();
	}

}
