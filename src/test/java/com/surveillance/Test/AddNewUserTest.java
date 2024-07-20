
package com.surveillance.Test;

import java.com.surveillance.pages.AddNewUserPage;
import java.com.surveillance.pages.HomePage;
import java.com.surveillance.pages.LoginPage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;

import com.surveillance.utilitiy.GenericKeywords;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class AddNewUserTest extends BaseTest{
	LoginPage login=new LoginPage();
	LoginTest loginTest=new LoginTest();
	HomePage homePage=new HomePage();
	AddNewUserPage addNewUserPage=new AddNewUserPage();
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public AddNewUserTest() throws Throwable {
		_instance = PropertySingleton.getInstance();
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}

	
	@Test(priority = 0, dataProvider = "setData1")
	public void AddNewUserWithMadatoryFields(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("Add User with Madatory Fields");
		loginTest.logintest(h2);
		passLog();
		homePage.clickOnUserAdmin();
		passLog();
		SimpleDateFormat sDate=new SimpleDateFormat("YYYYMMddHHmmss");
		String userDate=sDate.format(new Date());
		addNewUserPage.clickAdminAddNewUser();
		addNewUserPage.enterEmailAddress(h2.get("EmailAddress")+"+"+userDate+"@gmail.com");
		addNewUserPage.selectClients(h2.get("Clients"));
		addNewUserPage.enterName(h2.get("Name"));
		addNewUserPage.selectRole(h2.get("Role"));
		addNewUserPage.clickD3Coomand();
		addNewUserPage.enterDefaultlandingPage(h2.get("DefaultLandingPage"));
		addNewUserPage.selectPolicies(h2.get("Policies"));
		addNewUserPage.clickonPoliciesAdd();
		addNewUserPage.selectQueues(h2.get("Queues"));
		addNewUserPage.clickonQueuesAdd();
		addNewUserPage.clickonAddNewUser();
		addNewUserPage.GetBannerMsg("The User was successfully added and an Email was sent!");//this does do what i want it to do
		//uncomment this out when the bug for activating through emails is fixed
//		addNewUserPage.ActiveAccount();
//		addNewUserPage.enterNewPassword(h2.get("NewPassword"));
//		addNewUserPage.enterConfirmPassword(h2.get("ConfirmPassword"));
//		addNewUserPage.clickonResetSubmit();
			

	}		
	
	@Test(priority = 0, dataProvider = "setData1")
	public void AddNewUserWithAllFields(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("Add User with all Fields");
		loginTest.logintest(h2);
		passLog();
		homePage.clickOnUserAdmin();
		passLog();
		SimpleDateFormat sDate=new SimpleDateFormat("YYYYMMddHHmmss");
		String userDate=sDate.format(new Date());
		addNewUserPage.clickAdminAddNewUser();
		addNewUserPage.enterEmailAddress(h2.get("EmailAddress")+"+"+userDate+"@gmail.com");
		addNewUserPage.selectClients(h2.get("Clients"));
		addNewUserPage.enterName(h2.get("Name"));
		addNewUserPage.enterTitle(h2.get("Title"));
		addNewUserPage.selectSteamingPlayer(h2.get("StreamingPlayerPreference"));
		addNewUserPage.enterStreetAddress(h2.get("StreetAddress"));
		addNewUserPage.enterInternationalQuadrant(h2.get("InternationalQuadrant"));
		addNewUserPage.enterCity(h2.get("City"));
		addNewUserPage.selectState(h2.get("State"));
		addNewUserPage.enterZip(h2.get("Zip"));
		addNewUserPage.selectCountry(h2.get("Country"));
		addNewUserPage.selectTimeZon(h2.get("TimeZone"));
		addNewUserPage.enterPhoneNumber(h2.get("Phone"));
		addNewUserPage.enterMobileNumber(h2.get("Mobile"));
		addNewUserPage.selectExpMonth(h2.get("LoginExpirationMonth"));
		addNewUserPage.selectExpDay(h2.get("LoginExpirationDay"));
		addNewUserPage.selectExpYear(h2.get("LoginExpirationYear"));
		addNewUserPage.selectRole(h2.get("Role"));
		addNewUserPage.clickD3Coomand();
		addNewUserPage.enterDefaultlandingPage(h2.get("DefaultLandingPage"));
		addNewUserPage.selectPolicies(h2.get("Policies"));
		addNewUserPage.clickonPoliciesAdd();
		addNewUserPage.selectQueues(h2.get("Queues"));
		addNewUserPage.clickonQueuesAdd();
		addNewUserPage.clickonAddNewUser();
		addNewUserPage.GetBannerMsg("The User was successfully added and an Email was sent!");//this does do what i want it to do
		//uncomment this out when the bug for activating through emails is fixed
//		addNewUserPage.ActiveAccount();
//		addNewUserPage.enterNewPassword(h2.get("NewPassword"));
//		addNewUserPage.enterConfirmPassword(h2.get("ConfirmPassword"));
//		addNewUserPage.clickonResetSubmit();
			}	

	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("AddNewUser", "AddNewuser", xls);
	}

}
