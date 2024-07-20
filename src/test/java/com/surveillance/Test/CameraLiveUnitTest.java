package com.surveillance.Test;

import java.com.surveillance.pages.CameraPage;
import java.com.surveillance.pages.HomePage;
import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class CameraLiveUnitTest extends BaseTest
{
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	
	LoginTest loginTest=new LoginTest();
	HomePage homePage=new HomePage();
	CameraPage cameraPage =new CameraPage();
	
	public CameraLiveUnitTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	public void tillGotoLiveUnit() throws Throwable
	{
		homePage.clickOnCameras();
		passLog();
		cameraPage.clickOnLiveUnit();
		passLog();
		Thread.sleep(5000);
		cameraPage.clickOnSubLiveUnit();
//		cameraPage.clickOnSubLiveUnit();
		passLog();
		Thread.sleep(5000);
		cameraPage.clickOnCameraLink();
//		cameraPage.clickOnCameraLink();
		passLog();
		cameraPage.clickOnAdditionalButtons();
		passLog();
		cameraPage.clickOnGoToLiveUnit();
		passLog();
	
	}
	
	@Test(dataProvider = "setData1")
	public void a_verifyPopUpCancelButton(Hashtable<String, String> h2) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("verify  Popup window cancel option");
		loginTest.logintest(h2);
		passLog();
		tillGotoLiveUnit();
		cameraPage.clickOnDeactive();
		Thread.sleep(5000);
		cameraPage.DismisOrActivePopUp("dismiss");
		Thread.sleep(10000);
		passLog();
		s_assert.assertTrue(cameraPage.verifyDeActiveButton()==true);
		s_assert.assertAll();
				
	}
	@Test(dataProvider = "setData1")
	public void b_verifyCameraLiveUnitDeactive(Hashtable<String, String> h2) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("verify  verifyCameraLiveUnit to Deactive");
		loginTest.logintest(h2);
		passLog();
		tillGotoLiveUnit();
		String serialNumber=cameraPage.getSerialNumber();
		cameraPage.clickOnDeactive();
		Thread.sleep(1000);
		cameraPage.enterSerialNumber(serialNumber);
		Thread.sleep(1000);
		cameraPage.DismisOrActivePopUp(h2.get("ActivePopUps"));
		Thread.sleep(1000);
		passLog();
		s_assert.assertTrue(cameraPage.verifyActiveButton()==true);
		s_assert.assertAll();
		
		}

	@Test(dataProvider = "setData1")//, dependsOnMethods="verifyCameraLiveUnitDeactive"
	public void c_verifyCameraLiveUnitToActive(Hashtable<String, String> h2) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("verify  verifyCameraLiveUnit to Active");
		loginTest.logintest(h2);
		passLog();
		tillGotoLiveUnit();
		String serialNumber=cameraPage.getSerialNumber();
		cameraPage.clickOnActive();
		Thread.sleep(5000);
		cameraPage.enterSerialNumber(serialNumber);
		Thread.sleep(10000);
		cameraPage.DismisOrActivePopUp(h2.get("ActivePopUps"));
		Thread.sleep(10000);
		passLog();
		s_assert.assertTrue(cameraPage.verifyDeActiveButton()==true);
		s_assert.assertAll();
			
	}
	
	@Test(dataProvider = "setData1")//, dependsOnMethods="verifyCameraLiveUnitDeactive"
	public void d_verifyCameraLiveUnitInvoiceDataReport(Hashtable<String, String> h2) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("verify  verifyCameraLiveUnit Invoice Data Report");
		loginTest.logintest(h2);
		passLog();
		tillGotoLiveUnit();
		cameraPage.clickOnInvoiceDataReport();
		cameraPage.verifyInvoicePage();
		cameraPage.clickOnReturntoLiveUnit();
		
		s_assert.assertTrue(cameraPage.verifyInvoiceDataReport()==true);
		s_assert.assertAll();
			
	}

	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("LiveUnits", "CameraLiveUnits", xls);
	}
	}
