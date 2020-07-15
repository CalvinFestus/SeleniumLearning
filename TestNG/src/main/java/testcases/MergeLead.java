package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import utils.DataLibrary;

public class MergeLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {		
		dataSheetName = "duplicateLead";
	}
	
	@Test(dataProvider = "leaftaps")
	public void runMergeLead(String leadID, String dupLeadID) throws IOException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//input[@class='XdijitInputField dijitInputFieldValidationNormal'])[1]").sendKeys(leadID);
		driver.findElementByXPath("(//input[@class='XdijitInputField dijitInputFieldValidationNormal'])[2]").sendKeys(dupLeadID);
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		
		String mergedLeadIDText = driver.findElementById("viewLead_companyName_sp").getText();
		String mergedLeadID = mergedLeadIDText.replaceAll("\\D", "");
		System.out.println(mergedLeadID);
		
		DataLibrary.writeExcel("mergeLead", mergedLeadID);

	}

}
