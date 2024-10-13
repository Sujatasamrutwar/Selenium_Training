package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AncestorXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch the chrome browser
				WebDriver driver = new ChromeDriver();

				// Navigate to URL
				driver.get("file:///C:/Users/User/Downloads/xpath1.html");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				//Ancestor
				
				driver.findElement(By.xpath("(//input)[1]/../../div[1]/input[1]")).sendKeys("SStS");
				
				//first name
				//driver.findElement(By.xpath("//input)[2]/preceding-sibling::input")).sendKeys("SS");
	          
				//company name
	            //driver.findElement(By.xpath("(//input)[1]/following-sibling::input")).sendKeys("TY");
	
			   //last name
				//driver.findElement(By.xpath("(//input)[4]/parent::div/input[1]")).sendKeys("ram");
	}

}
