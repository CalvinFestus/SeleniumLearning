package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class EditLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {		
		dataSheetName = "editLead";
	}
	

	@Test(dataProvider = "leaftaps")
	public void runEditLead(String leadID) throws InterruptedException {

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='x-form-item x-tab-item'])[1]/div[1]/input").sendKeys(leadID);
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");
		driver.findElementByName("submitButton").click();
		String compNameText = driver.findElementById("viewLead_companyName_sp").getText();
		String compName = compNameText.replaceAll("\\W", "");

		if(compName.contains("CTS")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		
		
	}

}
