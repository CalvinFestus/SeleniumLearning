package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class DeleteLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setData() {		
		dataSheetName = "mergeLead";
	}
	
	
	@Test(dataProvider = "leaftaps")
	public void runDeleteLead(String leadID) throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='x-form-item x-tab-item'])[1]/div[1]/input").sendKeys(leadID);
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("(//div[@class='x-form-item x-tab-item'])[1]/div[1]/input").sendKeys("10958");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String errorMessage = driver.findElementByClassName("x-paging-info").getText();
		System.out.println(errorMessage);

	}

}
