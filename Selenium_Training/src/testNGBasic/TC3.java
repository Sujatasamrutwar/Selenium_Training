package testNGBasic;

import org.testng.annotations.Test;

public class TC3 {
@Test(dataProvider = "TestData", dataProviderClass = WorkingWithDataProvider.class) 
public void testCase3(String Firstname, String Lastname) {
	System.out.println(Firstname);
	System.out.println(Lastname);
	
}
}
