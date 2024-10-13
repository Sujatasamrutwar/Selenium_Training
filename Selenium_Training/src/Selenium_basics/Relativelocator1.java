package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relativelocator1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the chrome browser
				WebDriver driver = new ChromeDriver();

				// Navigate to URL
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				//Thread.sleep(2000);
				
				//Search Field Text Box - toLeftOf (method overriding)
				driver.findElement(RelativeLocator.with(By.tagName("input")).
						toLeftOf(By.xpath("//input[@type='submit']"))).sendKeys("mobiles");
				
				//click on search button - toRightOf
				//driver.findElement(RelativeLocator.with(By.tagName("input"))
						//.toRightOf(By.id("small-searchterms"))).click();
						
				//Click on Excellent radio button - above	
						//driver.findElement(RelativeLocator.with(By.name("pollanswers-1"))
							//	.above(By.id("pollanswers-2"))).click();
				 
				//Click on Good Radio Button - below
						//driver.findElement(RelativeLocator.with(By.tagName("input"))
							//	.below(By.id("pollanswers-1"))).click();
						
						//Click on register Link using near() Locator
						//driver.findElement(RelativeLocator.with(By.name("a"))
								//.near(By.linkText("Log  in"))).click();
	}

}
