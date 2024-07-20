package com.surveillance.Test;

import java.com.surveillance.pages.AddNewRolePage;
import java.com.surveillance.pages.AdminPage;
import java.com.surveillance.pages.HomePage;
import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class AddNewRoleTest  extends BaseTest{

	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	
	LoginTest loginTest=new LoginTest();
	HomePage homePage =new HomePage();
	AdminPage adminPage=new AdminPage();
	AddNewRolePage addNewRolePage=new AddNewRolePage();
	
	public AddNewRoleTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}
	

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
		
	}
	
	
	@Test(priority = 0, dataProvider = "setData1")
	public void CancelCreateNewRoleTest(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("AddNewRoleTest");

	loginTest.logintest(h2);
	passLog();
	homePage.clickOnUserAdmin();
	passLog();
	adminPage.clickonRoles();
	passLog();
	addNewRolePage.clickOnAddaRole();
	passLog();
	addNewRolePage.enterName(h2.get("Name"));
	passLog();
	addNewRolePage.enterDescription(h2.get("Description"));
	passLog();
	addNewRolePage.ClickonViewCameraVideo("ON");
	passLog();
	addNewRolePage.ClickonViewCameraArchives("ON");
	passLog();
	addNewRolePage.ClickonSecurityEventOperator("ON");
	passLog();
	addNewRolePage.ClickonControlCameraPresets("ON");
	passLog();
	addNewRolePage.ClickonControlCameraPTZF("ON");
	passLog();
	addNewRolePage.ClickonSuspendPatrol("ON");
	passLog();
	addNewRolePage.ClickonManageCameraPresets("ON");
	passLog();
	addNewRolePage.ClickonManageSecurityDeterrenceMode("On");
	passLog();
	addNewRolePage.ClickonAdministerUsers_ClientLevel("ON");
	passLog();
	addNewRolePage.ClickonAdministerUserRoles_ClientLevel("ON");
	passLog();
	addNewRolePage.ClickonViewSystemAnalytics("ON");
	passLog();
	addNewRolePage.ClickonViewSystemSettings_DistributorLevel("ON");
	passLog();
	addNewRolePage.ClickonAdministerUsers_DistributorLevel("ON");
	passLog();
	addNewRolePage.ClickonAdministerSystemSettings_DistributorLevel("ON");
	passLog();
	addNewRolePage.ClickonViewSystemSettings("ON");
	passLog();
	addNewRolePage.ClickonAdministerUsers_SystemLevel("ON");
	passLog();
	addNewRolePage.ClickonAdministerSecuritySystems("ON");
	passLog();

	addNewRolePage.ClickonAdministerSystemSettings("ON");
	passLog();
	addNewRolePage.enterDefaultLandingPage(h2.get("DefaultLandingPage"));
	passLog();
	addNewRolePage.clickOnAddNewRole();
	passLog();
	}
	
	@Test(priority = 0, dataProvider = "setData1")
	public void CreateNewRoleTest(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("AddNewRoleTest");

	loginTest.logintest(h2);
	passLog();
	homePage.clickOnUserAdmin();
	passLog();
	adminPage.clickonRoles();
	passLog();
	addNewRolePage.clickOnAddaRole();
	passLog();
	addNewRolePage.enterName(h2.get("Name"));
	passLog();
	addNewRolePage.enterDescription(h2.get("Description"));
	passLog();
	addNewRolePage.ClickonViewCameraVideo("ON");
	passLog();
	addNewRolePage.ClickonViewCameraArchives("ON");
	passLog();
	addNewRolePage.ClickonSecurityEventOperator("ON");
	passLog();
	addNewRolePage.ClickonControlCameraPresets("ON");
	passLog();
	addNewRolePage.ClickonControlCameraPTZF("ON");
	passLog();
	addNewRolePage.ClickonSuspendPatrol("ON");
	passLog();
	addNewRolePage.ClickonManageCameraPresets("ON");
	passLog();
	addNewRolePage.ClickonManageSecurityDeterrenceMode("On");
	passLog();
	addNewRolePage.ClickonAdministerUsers_ClientLevel("ON");
	passLog();
	addNewRolePage.ClickonAdministerUserRoles_ClientLevel("ON");
	passLog();
	addNewRolePage.ClickonViewSystemAnalytics("ON");
	passLog();
	addNewRolePage.ClickonViewSystemSettings_DistributorLevel("ON");
	passLog();
	addNewRolePage.ClickonAdministerUsers_DistributorLevel("ON");
	passLog();
	addNewRolePage.ClickonAdministerSystemSettings_DistributorLevel("ON");
	passLog();
	addNewRolePage.ClickonViewSystemSettings("ON");
	passLog();
	addNewRolePage.ClickonAdministerUsers_SystemLevel("ON");
	passLog();
	addNewRolePage.ClickonAdministerSecuritySystems("ON");
	passLog();

	addNewRolePage.ClickonAdministerSystemSettings("ON");
	passLog();
	addNewRolePage.enterDefaultLandingPage(h2.get("DefaultLandingPage"));
	passLog();
	addNewRolePage.clickOnCancel();
	passLog();
	
	}
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\TestData\\testdata.xlsx");
		return ReadData.getData("AddNewRoleTest", "AddNewRole", xls);
	}
	}


	


