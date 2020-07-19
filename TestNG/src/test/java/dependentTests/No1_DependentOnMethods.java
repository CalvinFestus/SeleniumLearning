package dependentTests;

import org.testng.annotations.Test;

public class No1_DependentOnMethods {
	
	/*The dependsOnMethods lets us make a test depend on a particular method.
	 * 
	 */
	
	@Test(dependsOnMethods = {"openBrowser"})
	public void signIn() {
		
		System.out.println("Sign In to the Application");

	}
	
	@Test
	public void openBrowser() {
		
		System.out.println("Open the Browser");

	}

}
