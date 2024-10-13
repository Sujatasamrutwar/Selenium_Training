package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class ActionsClass_MouseContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		
		WebElement rightclick_button = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		
		action.contextClick(rightclick_button).build().perform(); //method overloading
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Copy']"))).click().perform();
		
	}

}
