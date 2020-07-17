package priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class No2_WithTestGPriority {
	
	/* Definition of Priority in TestNG test methods can only be the @Test methods.
	 * Lower the priority number; higher is the priority of the test case method.
	 * Priority in TestNG contains only integer value. The value can be negative, zero, or positive.
	 * If a tester defines a priority in decimal in TestNG, it needs to convert first to Integer (through typecasting).
	 * One method is allowed to have only one priority in TestNG.
	 * Priority cannot pass through the XML files.
	 * 
	 * Now Test1() will run ahead of Test2() 
	 */
	
	@Test(priority = 1)
	public void Test2() {
		
		Assert.assertEquals("TestNG 2", "TestNG 2");
		System.out.println("TestCase 2");
		
	}
	
	@Test(priority = 0)
	public void Test1() {
		
		Assert.assertEquals("TestNG 1", "TestNG 1");
		System.out.println("TestCase 1");

	}

}
