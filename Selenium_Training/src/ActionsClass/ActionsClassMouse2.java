package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMouse2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		driver.manage().window().maximize();
		Thread.sleep(1000);

		// Create an object of Actions Class
		Actions action = new Actions(driver);

		// move to element
		WebElement computers = driver.findElement(By.xpath("(//a[contains(text(), 'Computers')]) [1]"));
		action.moveToElement(computers).build().perform();

		WebElement desktops = driver.findElement(By.xpath("(//a[contains(text(),'Desktop')])[1]"));
		action.moveToElement(desktops).click().build().perform();
	}

}
