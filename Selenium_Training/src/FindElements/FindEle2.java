package FindElements;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindEle2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();
	
		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//take the radio buttons
		List<WebElement> radio_btn = driver.findElements(By.xpath("//input[@type='radio']"));
		
		//Iterate 
		for(WebElement element: radio_btn) {
			element.click();
			System.out.println(	element.isSelected());
		}
	}
	

}
