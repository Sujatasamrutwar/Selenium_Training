package MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingMultipleWindow2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://");
		Thread.sleep(2000);
		
		//Identify the parent window
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		//Execute the functionality which will open the child window
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(2000);
		//get all the windows opened (Identify all windows including child windows)
		
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(childwindow);
		
		//Iterate on the set of child windows using switch to method
		for(String window: childwindow) {
			driver.switchTo().window(window);
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		//switch back to parent window
		driver.switchTo().window(parentwindow);
		driver.close();
	}

}
