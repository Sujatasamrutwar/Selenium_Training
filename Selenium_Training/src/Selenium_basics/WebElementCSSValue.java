package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCSSValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launch");
		// Navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Navigating to URL");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// get css value
		String registerLink_color = driver.findElement(By.linkText("Register")).getCssValue("color");
		System.out.println(registerLink_color);
		
		String fontValue = driver.findElement(By.linkText("Register")).getCssValue("font-family");
		System.out.println(fontValue);
	}

}
