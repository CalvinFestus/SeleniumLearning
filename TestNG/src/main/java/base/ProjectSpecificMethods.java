package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.DataLibrary;

public class ProjectSpecificMethods {
	
	public ChromeDriver driver;
	public String dataSheetName;
	
	@Parameters({"url","uName","pass"})
	@BeforeMethod
	public void login(String url, String userName, String pass) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementById("username").sendKeys(userName);
		driver.findElementById("password").sendKeys(pass);	
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();


	}
	
	@AfterMethod
	public void close() {
		
		driver.close();
		
	}
	
	@DataProvider(name = "leaftaps")
	public String[][] sendData() throws IOException {
		
		String[][] data = DataLibrary.readExcelData(dataSheetName);
		return data;
		
	}

}
