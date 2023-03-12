package com.demoqa.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demoqa.Base.TestBase;
import com.demoqa.Pages.ElementsPage;
import com.demoqa.Pages.HomePage;
import com.demoqa.Pages.UploadDownloadPage;

public class NewPage extends TestBase{

	SoftAssert softAssert;
	HomePage homePage;
	ElementsPage elementsPage;
	UploadDownloadPage uploadDownloadPage;
	@BeforeMethod
	public void setUp() {
		launchBrowser();
		softAssert = new SoftAssert();
		homePage = new HomePage();
		elementsPage = homePage.clickElementBtn();
		uploadDownloadPage = elementsPage.clickUploadAndDownloadBtn();
	}
	@Test
	public void verifyuploadFunctionality() {
		
	}
	@AfterMethod
	public void tearDown() {
		quitBrowser();
	}
	
}
