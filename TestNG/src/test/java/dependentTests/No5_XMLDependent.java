package dependentTests;

import org.testng.annotations.Test;

public class No5_XMLDependent {
	
	@Test(groups = {"logOut"})
	public void logOut() {
		
		System.out.println("Log Out of Application");

	}
	
	@Test(groups = {"signIn"})
	public void signIn() {
		
		System.out.println("Sign In to the Application");

	}
	
	@Test(groups = {"openBrowser"})
	public void openBrowser() {
		
		System.out.println("Open the Browser");

	}

}
