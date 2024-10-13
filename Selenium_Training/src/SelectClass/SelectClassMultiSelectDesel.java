package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMultiSelectDesel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the chrome browser
				WebDriver driver = new ChromeDriver();

				// Navigate to URL
				driver.get("https:");
			
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
				//WebElement cars = driver.findElement(By.id("standard_cars"));
				
				//Select objsel = new Select(cars);
				//System.out.println(objsel.isMultiple());    //false
				
				
				WebElement Mul_cars = driver.findElement(By.id("multiple_cars"));
				Select selobj1 = new Select(Mul_cars);
				System.out.println(selobj1.isMultiple());     //true
				
				selobj1.selectByVisibleText("Audi");
				Thread.sleep(1000);
				
				selobj1.selectByVisibleText("Ford");
				Thread.sleep(1000);
				
				selobj1.selectByVisibleText("Jaguar");
				Thread.sleep(1000);
				
				//deselect methods
				selobj1.deselectByVisibleText("Jaguar");
				Thread.sleep(1000);
				
				selobj1.deselectByVisibleText("Ford");
				Thread.sleep(1000);
				
				selobj1.deselectByValue("Aud");
				
				//deselect all methods
				//selobj1.deselectAll();
				
			
				
				
	}

}
