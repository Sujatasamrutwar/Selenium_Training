package SelectClass;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the chrome browser
				WebDriver driver = new ChromeDriver();
				System.out.println("Browser launch");
				// Navigate to URL
				driver.get("https://demowebshop.tricentis.com/");
				System.out.println("Navigating to URL");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
				//Click on books
				driver.findElement(By.partialLinkText("Books")).click();
				Thread.sleep(1000);
				
				//sortby dropdown
				WebElement sort = driver.findElement(By.id("products-orderby"));
				
				Select objsel = new Select(sort);
				
				
				//Get options methods
				List<WebElement>sortby_values=objsel.getOptions();
				
				//iterate on the list to print the values
				for(WebElement value:sortby_values) {
					System.out.println(value.getText());
				}
				
				WebElement display = driver.findElement(By.id("products-pagesize"));
				
				Select display_dropdown = new Select(display);
				
				List<WebElement>display_values=display_dropdown.getOptions();
				
				for(WebElement display_val: display_values) {
					System.out.println(display_val.getText());
				}
				
				
	}

}
