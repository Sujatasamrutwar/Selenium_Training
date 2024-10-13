package testNGBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert2 {
	@Test
	public void assertion2() {

		// create an object for soft assert
		SoftAssert asrt = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

//Assert for the Application launch
		String title = driver.getTitle();
//Assert tool class
//Asserting for the Home page
//Assert.assertEquals(title, "Demo Web Shop");
		asrt.assertEquals(title, "Demo Web Shop");

		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String value = driver.findElement(By.xpath("//h1[text()='Search']")).getText();

//Assert for the given search
//Assert.assertEquals(value, "Search", "Given text in computer search page was not displayed");
		asrt.assertEquals(value, "Search");

		driver.close();

//assert all method is mandatory

//Record all the validations or assertion
		asrt.assertAll();
	}
}
