package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the chrome browser
				WebDriver driver = new ChromeDriver();

				// Navigate to URL
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				//Click on books
				driver.findElement(By.partialLinkText("Books")).click();
				Thread.sleep(1000);
				
				//sortby dropdown
				WebElement sort = driver.findElement(By.id("products-orderby"));
				
				Select objsel = new Select(sort);
				objsel.selectByVisibleText("Price: Low to High");
				
				//Display dropdown
				WebElement display = driver.findElement(By.id("products-pagesize"));
				Select objsel1 = new Select(display);
				//objsel1.selectByValue("https://demowebshop.tricentis.com/books?pagesize=12");
				objsel1.selectByVisibleText("12");
				Thread.sleep(1000);
				
				//view as dropdowns
				WebElement view = driver.findElement(By.id("product-viewmode"));
				Select objsel2 = new Select(view);
				objsel2.selectByIndex(1);
	}

}
