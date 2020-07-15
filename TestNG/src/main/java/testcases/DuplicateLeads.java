package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import utils.DataLibrary;

public class DuplicateLeads extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {		
		dataSheetName = "editLead";
	}

	@Test(dataProvider = "leaftaps")
	public void runDuplicateLeads(String leadID) throws InterruptedException, IOException {

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='x-form-item x-tab-item'])[1]/div[1]/input").sendKeys(leadID);
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		Thread.sleep(2000);
		driver.findElementByName("submitButton").click();
		Thread.sleep(2000);
		String dupLeadText = driver.findElementById("viewLead_companyName_sp").getText();
		String dupLeadID = dupLeadText.replaceAll("\\D", "");
		System.out.println(dupLeadID);
		
		DataLibrary.writeExcel("duplicateLead", leadID, dupLeadID);

	}

}
