package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AC_M_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);

		Actions action = new Actions(driver);

		// Source Element
		WebElement washington = driver.findElement(By.id("box3"));

		// Target Element
		WebElement us = driver.findElement(By.id("box103"));

		action.dragAndDrop(washington, us).build().perform();

		// Source Element
		WebElement rome = driver.findElement(By.id("box6"));

		// Target Element
		WebElement italy = driver.findElement(By.id("box106"));

		action.dragAndDrop(rome, italy).build().perform();

		WebElement seoul = driver.findElement(By.id("box5"));

		// Target Element
		WebElement southKorea = driver.findElement(By.id("box105"));

		action.dragAndDrop(seoul, southKorea).build().perform();
	}

}
