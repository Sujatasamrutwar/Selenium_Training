package testNGBasic;

import org.testng.annotations.Test;

public class IncludeTag {
	@Test
	public void LoginTest() {
		System.out.println("Executing Login Test");
	}

	@Test
	public void Registertest() {
		System.out.println("Executing Register test");
	}

	@Test
	public void SearchTest() {
		System.out.println("executing search test");
	}
	
	@Test
	public void Subscribetest() {
		System.out.println("Executing Subscribe test");
	}

}
