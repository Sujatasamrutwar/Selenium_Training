package testNGBasic;

import org.testng.annotations.Test;

public class Working_with_grp1 {
	@Test(groups = "SmokeTest")
	public void AddTocart() {
		System.out.println("Executing Cart Test");
	}

	@Test(groups = "SmokeTest")
	public void Subscribetest() {
		System.out.println("Executing Subscribe test");
	}

	@Test
	public void voteTest() {
		System.out.println("executing vote test");
	}
}
