package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement{

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
		
		//Verification methods
		//if (driver.findElement(By.id("small-searchterms")).isDisplayed()) {
			//driver.findElement(By.id("small-searchterms")).sendKeys("books");}
		
		//check if search button is enabled then click
		//if (driver.findElement(By.xpath("//input[@type='submit']")).isEnabled()) {
		//	driver.findElement(By.xpath("//input[@type='submit']")).click();}
		
		//check if the radio button excellent is checked
		driver.findElement(By.id("pollanswers-1")).click();
		
		//Verify if the radio button is selected
		if(driver.findElement(By.id("pollanswers-1")).isSelected()) {
			System.out.println("The excellent radio button is selected successfully");
		}

		//driver.findElement(By.id("small-searchterms")).sendKeys("Laptops");
		//driver.findElement(By.id("small-searchterms")).clear();
		//driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		
		//driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		//WebElement Getter
		//String text = driver.findElement(By.linkText("Register")).getText();
		//System.out.println(text);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//get the text from search page
		String searchpage_text=driver.findElement(By.xpath("//h1[text()='search']")).getText();
		System.out.println(searchpage_text);
		
		System.out.println("The text displayed is "+searchpage_text);
		
		//get attribute value
		  String subvalue = driver.findElement(By.id("newsletter-subscribe-button")).getAttribute("value");
		  
		  String textfield_value= driver.findElement(By.id("small-searchterms"))
				  .getAttribute("value");
		  System.out.println(textfield_value);
		  
		  driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		  String textfield_value2 = driver.findElement(By.id("small-searchterms"))
				  .getAttribute("value");
		  System.out.println(textfield_value2);
		  

		  driver.quit();
		
	}

}
