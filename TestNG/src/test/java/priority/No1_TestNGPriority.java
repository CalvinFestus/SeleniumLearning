package priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class No1_TestNGPriority {
	
	/* Prioritization in TestNG is a way to provide a sequence to the methods so that they do not run out of order
	 * Since alphabetically running test cases in TestNG have no logical sequence (concerning the tests and code), 
	 * providing priority to these test cases helps us managing our tests’ execution.
	 * 
	 * Here Test1() will run First and then Test2() as it is the Alphabetical ASCII Sequence, even though Test2() is 
	 * written first
	 */
	
	@Test
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
