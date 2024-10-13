 package screenshots;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Implicit wait statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		//Type cast to get the capabilities of takescreenshots interface to the driver instance
		
		//Typecasting
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//Temporary location
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	}

}
