package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AC_KKeyUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().window().maximize();
		Thread.sleep(1000);

		// Create an object of Actions Class
		Actions action = new Actions(driver);
		WebElement searchtext_field = driver.findElement(By.id("small-searchterms"));

		//action.moveToElement(searchtext_field).click().sendKeys("laptops").perform();
		
		//key up and key down
		//action.moveToElement(searchtext_field).click().keyDown(Keys.SHIFT).sendKeys("Laptops")
		//.keyUp(Keys.SHIFT).perform();
	}


}
