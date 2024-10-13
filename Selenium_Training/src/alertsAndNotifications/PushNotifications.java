package alertsAndNotifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PushNotifications {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//ChromeOptions Class
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications--");
		
		//WebDriver driver = new ChromeDriver();               //push_notification will displayed
		WebDriver driver = new ChromeDriver(option);           //handled push_notifications
		driver.manage().window().maximize();
		driver.get("https://www.easymytrip.com/");
		Thread.sleep(2000);
	}

}
