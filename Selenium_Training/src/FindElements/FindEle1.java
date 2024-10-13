package FindElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindEle1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Launch the chrome browser
				WebDriver driver = new ChromeDriver();
			
				// Navigate to URL
				driver.get("https://demowebshop.tricentis.com/");
				
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
				//get all the links on the webpage
				List<WebElement>links = driver.findElements(By.xpath("//a"));
				
				//Iterate over the collection of links
				for(int i=0; i<=links.size()-1;i++) {
					String linktext = links.get(i).getText();
					System.out.println(linktext);
				}
				
				//Iterate on the list of links
				for(WebElement element:links) {
					String url = element.getAttribute("href");
					System.out.println(url);
				}
				driver.close();
	}

}
