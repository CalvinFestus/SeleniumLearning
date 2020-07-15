package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import utils.DataLibrary;

public class CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {
		
		dataSheetName = "createLead";

	}
	
	@Test(dataProvider = "leaftaps")
	public void runCreateLead(String firstName, String lastName, String companyName) throws IOException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		driver.findElementByName("submitButton").click();
		String leadNameID = driver.findElementById("viewLead_companyName_sp").getText();
		String leadID = leadNameID.replaceAll("\\D", "");
		System.out.println(leadID);
		
		DataLibrary.writeExcel("editLead", leadID);
		
	}

}
