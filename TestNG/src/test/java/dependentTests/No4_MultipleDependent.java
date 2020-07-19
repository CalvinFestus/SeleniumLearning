package dependentTests;

import org.testng.annotations.Test;

public class No4_MultipleDependent {
	
	@Test(dependsOnMethods = {"openBrowser","signIn"})
	public void logOut() {
		
		System.out.println("Log Out of Application");

	}
	
	@Test
	public void signIn() {
		
		System.out.println("Sign In to the Application");

	}
	
	@Test
	public void openBrowser() {
		
		System.out.println("Open the Browser");

	}

}
