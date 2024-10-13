package testNGBasic;

import org.testng.annotations.Test;

public class DWSPriority {
	@Test (priority = 1)
	public void RegisterTest() {
		System.out.println("Executing Register TC");
	}
	@Test (priority = 2)
	public void LoginTest( ) {//test case
		
		System.out.println("Executing Login TC");
	}
	@Test (priority = 3)
	public void Search( ) {//test case
		
		System.out.println("Executing Search TC");
		
	}
	}


