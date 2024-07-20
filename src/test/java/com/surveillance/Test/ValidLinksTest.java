package com.surveillance.Test;

import java.com.surveillance.pages.CameraPage;
import java.com.surveillance.pages.HomePage;
import java.com.surveillance.pages.LoginPage;
import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class ValidLinksTest extends BaseTest{
	LoginPage login=new LoginPage();
	LoginTest loginTest=new LoginTest();
	HomePage homePage=new HomePage();
	CameraPage CameraPage=new CameraPage();
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public ValidLinksTest() throws Throwable {
		_instance = PropertySingleton.getInstance();
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}

	
	@Test(priority = 0, dataProvider = "setData1")
	public void EndDemoToday(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("Login Test");
		loginTest.logintest(h2);
		CameraPage.keywords.openURL("https://qa.liveviewtech.com/live_units/view/1526");
		CameraPage.clickOnSetDemo();
		s_assert.assertTrue(CameraPage.gettextDemoDateCalender());
		CameraPage.SelectSetDemoDate();
		s_assert.assertTrue(CameraPage.verifyLBLDemoEndDate());
		passLog();
		s_assert.assertAll();
	}
	
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\TestData\\testdata.xlsx");
		return ReadData.getData("AddNewUser", "AddNewuser", xls);
	}
}
