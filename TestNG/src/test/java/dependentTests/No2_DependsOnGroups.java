package dependentTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class No2_DependsOnGroups {
	
	/*The dependsOnGroups attribute lets us make a test depend on a whole group rather than a single test
	 * 
	 */
	
	@Test(dependsOnGroups = {"smoke"})
	public void Test4() {
		
		Assert.assertEquals("TestNG 4", "TestNG 4");
		System.out.println("TestCase 4");

	}
	
	@Test(groups = {"smoke"})
	public void Test3() {
		
		Assert.assertEquals("TestNG 3", "TestNG 3");
		System.out.println("TestCase 3");

	}
	
	@Test(groups = {"smoke"})
	public void Test2() {
		
		Assert.assertEquals("TestNG 2", "TestNG 2");
		System.out.println("TestCase 2");

	}
	
	@Test(groups = {"smoke"})
	public void Test1() {
	
		Assert.assertEquals("TestNG 1", "TestNG 1");
		System.out.println("TestCase 1");
	
	}	

}
