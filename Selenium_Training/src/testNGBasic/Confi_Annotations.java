package testNGBasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Confi_Annotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("executing before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("executing after Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("executing before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("executing after test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("executing before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("executing after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("executing before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("executing after Method");
	}
	
@Test
public void TC1() {
	System.out.println("executing TC1");
}
@Test
public void TC2() {
	System.out.println("executing TC2");
}
} 
