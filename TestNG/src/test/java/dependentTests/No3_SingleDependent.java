package dependentTests;

import org.testng.annotations.Test;

public class No3_SingleDependent {
	
	/*
	 * A single dependent test in TestNG is declared when a single test depends on another test
	 */
	
	@Test(dependsOnMethods = {"signIn"})
	public void logOut() {
		
		System.out.println("Log Out of Application");

	}
	
	@Test(dependsOnMethods = {"openBrowser"})
	public void signIn() {
		
		System.out.println("Sign In to the Application");

	}
	
	@Test
	public void openBrowser() {
		
		System.out.println("Open the Browser");

	}	

}
