package testNGBasic;

import org.testng.annotations.Test;

public class WorkingWithGrps {
@Test(groups = "SmokeTest")
public void LoginTest() {
	System.out.println("Executing Login Test");
}

@Test(groups = "SmokeTest")
public void Registertest() {
	System.out.println("Executing Register test");
}

@Test
public void SearchTest() {
	System.out.println("executing search test");
}
}
