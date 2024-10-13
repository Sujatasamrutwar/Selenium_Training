package AutoSuggestion_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		Thread.sleep(5000);

		// flipkart search text field

		driver.findElement(By.name("q")).sendKeys("puma");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'puma')])[2]")).click();
	}

}
