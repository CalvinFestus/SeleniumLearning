package priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class No3_SameTestNGPriority {
	
	/* If two or more methods have the same priorities in TestNG, then their running test sequence is alphabetic 
	 * 
	 * So Test1() will run first, followed by Test2() and Test3() as Test2() is alpahbetically first
	 * 
	 * 
	 * */
	
	@Test(priority = 1)
	public void Test3() {
		
		Assert.assertEquals("TestNG 3", "TestNG 3");
		System.out.println("TestCase 3");

	}
	
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
