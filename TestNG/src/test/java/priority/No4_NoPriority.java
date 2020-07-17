package priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class No4_NoPriority {
	
	/*
	 * The test methods with no priority assigned have a default priority equal to 0. 
	 * 
	 * So Test1() which doesnot have any priority will get default priority as 0 and will run first.
	 * Next Test3() and Test2() will run based on their priorities
	 */
	
	@Test(priority = 1)
	public void Test3() {
		
		Assert.assertEquals("TestNG 3", "TestNG 3");
		System.out.println("TestCase 3");

	}
	
	@Test(priority = 2)
	public void Test2() {
		
		Assert.assertEquals("TestNG 2", "TestNG 2");
		System.out.println("TestCase 2");

	}
	
	@Test
	public void Test1() {
		
		Assert.assertEquals("TestNG 1", "TestNG 1");
		System.out.println("TestCase 1");
	
	}	

}
