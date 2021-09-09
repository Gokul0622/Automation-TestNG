package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	@Test(dataProvider ="sentData")
	@Parameters({"CompanyName", "FirstName", "LastName",  "Phno" })
	public void runCreate(String CompanyName, String FirstName, String LastName, String Phno ) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Phno);
		driver.findElement(By.name("submitButton")).click();

	}
	@DataProvider
	public String[][] sentData(){
		
		return null;
		
	}

}
//		data[0][0] = "GK Tech";
//		data[0][1] = "Gokulraj";
//		data[0][2] = "S";
//		data[0][3] = "99";
//
//		data[1][0] = "GS Tech";
//		data[1][1] = "Raja";
//		data[1][2] = "S";
//		data[1][3] = "98";
