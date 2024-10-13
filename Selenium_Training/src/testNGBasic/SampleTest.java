package testNGBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
@Test

public void Demo( ) {//test case
	
	System.out.println("Welcome to TestNG");
	//test steps
}
@Test
public void TC1() {
	Reporter.log("TestCase 1");
}
}
