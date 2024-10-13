package testNGBasic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example_Parameters {

	String sum;
	
	@Parameters({"num1","num2"})
	@Test
	public void testCase(String num1,String num2) {
		
		sum=num1+num2;
		System.out.println(sum);
		
	}
	
}
