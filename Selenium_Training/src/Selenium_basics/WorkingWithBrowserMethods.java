package Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithBrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Launch a Chrome Browser
		//Selenium 4.12.0
		
		//Create an object of ChromeDriver Class
		//ChromeDriver driver = new ChromeDriver();
		
		//Launch a Chrome Browser
		
		WebDriver driver = new ChromeDriver();
		
		//Navigate to URL
		
		driver.get("https://www.google.co.in");
		
		//to print the title of the URL
		String title = driver.getTitle();
		System.out.println(title);
		
		//get the current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//to print the page source
		String pagesrc = driver.getPageSource();
		System.out.println(pagesrc); 
		
		//Close the browser
		//driver.close();
		
		//another method to navigate to a URL
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		 
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.shoppersstack.com/");
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//to maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//to minimize window
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//Close the browser
		//driver.close();
		driver.quit();
	}

}
