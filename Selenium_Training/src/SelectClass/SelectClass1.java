package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch the chrome browser
				WebDriver driver = new ChromeDriver();
			
				// Navigate to URL
				driver.get("https://");
				
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
				//Identify the WebElement
				WebElement cars = driver.findElement(By.id("standard_cars"));
				
				//Create an object of select class
				Select objsel = new Select(cars);
				
				//select by visible text
				objsel.selectByVisibleText("Toyota");
				
				Thread.sleep(1000);
				objsel.selectByValue("mercedes");
				
				Thread.sleep(1000);
				
				//Select by index
				objsel.selectByIndex(4);
	}

}
