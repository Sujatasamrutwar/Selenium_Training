package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMouse1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Create an object of Actions Class
		Actions action = new Actions(driver);
		
		//move to element
		WebElement computers = driver.findElement(By.xpath("(//a[contains(text(), 'Computers')]) [1]"));
		action.moveToElement(computers).build().perform();
		
		//build - build the mouse action
		//performs - performs the mouse action which is build
	}

}
