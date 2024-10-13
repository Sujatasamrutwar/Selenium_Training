package testNGBasic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Working_With_ParametersBasic {
 String sum;
 //int a = 5;
 //int b = 6;
 
 //you have to execute the test from the testing.xml itself
 
  @Parameters({"num1", "num2"})
	@Test
	public void add(String num1, String num2) {
		sum=num1+num2;
		System.out.println("Sum "+sum);
	}
}

