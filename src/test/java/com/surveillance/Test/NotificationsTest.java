package com.surveillance.Test;

import java.com.surveillance.pages.AdminPage;
import java.com.surveillance.pages.HomePage;
import java.com.surveillance.pages.NotificationsPage;
import java.com.surveillance.pages.UserInformationPage;
import java.com.surveillance.pages.ViewAllUsersPage;
import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class NotificationsTest extends BaseTest
{

	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();
	
	HomePage homePage=new HomePage();
	LoginTest loginTest=new LoginTest();
	NotificationsPage notificationsPage=new NotificationsPage();
	AdminPage adminPage=new AdminPage();
	ViewAllUsersPage viewAllUsersPage =new ViewAllUsersPage();
	UserInformationPage userInformationPage=new UserInformationPage();
	public NotificationsTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	
//	@Test(priority = 0, dataProvider = "setData1")
	public void userAdministrator(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("verify D3CommandCenterTest ");
	
		loginTest.logintest(h2);
		passLog();
		homePage.clickOnUserAdmin();
		passLog();
		adminPage.clickOnUsersLink();
		passLog();
		adminPage.enterTheDataForFiletr(h2.get("EmailAddress"));
		passLog();
		adminPage.clickNotificationFirstLink();
		passLog();
		notificationsPage.SelectAvailableLiveUnitsByIdex(0);
		passLog();
		Thread.sleep(15000);
		notificationsPage.clickOnAddLiveUnitNotifications();
		passLog();
	
		notificationsPage.clickOnUpdateNotifications();
		passLog();
		String Actualtext=notificationsPage.gettextNotificationsConfirmationPopUp();
		s_assert.assertEquals(Actualtext, "User notifications updated successfully");
		passLog();
		s_assert.assertAll();
		notificationsPage.clickonsConfirmationPopUpOk();
		passLog();
			
	}

//	@Test(priority = 1, dataProvider = "setData1")
	public void veryFySubscribedNotifications(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("verify D3CommandCenterTest ");
	
		loginTest.logintest(h2);
		passLog();
		homePage.clickOnUserAdmin();
		passLog();
		adminPage.clickOnUsersLink();
		passLog();
		adminPage.enterTheDataForFiletr(h2.get("EmailAddress"));
		passLog();
		adminPage.clickNotificationFirstLink();
		passLog();
		notificationsPage.SelectallAssignedNotifications();
		passLog();
		notificationsPage.clickOnRemoveLiveUnitNotifications();
		passLog();
		s_assert.assertTrue(notificationsPage.isenableCheck_SendPowerLoss()==false);
		s_assert.assertTrue(notificationsPage.isenableSendCameraHealthStatus()==false);
		s_assert.assertTrue(notificationsPage.isenableSendCameraRecordingStatus()==false);
		s_assert.assertTrue(notificationsPage.isenableSendDeterrentChange()==false);
		s_assert.assertTrue(notificationsPage.isenableSendMotionDetectionPicture()==false);
		s_assert.assertTrue(notificationsPage.isenableSendMotionDetectionVideo()==false);
		passLog();
		Thread.sleep(10000);
		s_assert.assertAll();
		}
	
//	@Test(priority = 1, dataProvider = "setData1")
	public void test(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("verify D3CommandCenterTest ");
	
		loginTest.logintest(h2);
		passLog();
		homePage.clickOnUserAdmin();
		passLog();
		adminPage.clickOnUsersLink();
		passLog();
		adminPage.enterTheDataForFiletr(h2.get("EmailAddress"));
		passLog();
		Thread.sleep(5000);
		adminPage.clickNotificationFirstLink();
		passLog();
		notificationsPage.SelectallAssignedNotifications();
		passLog();
		Thread.sleep(5000);
		notificationsPage.clickOnRemoveLiveUnitNotifications();
		Thread.sleep(5000);
//		viewAllUsersPage.clickOnEmailAddress(h2.get(key))
		s_assert.assertAll();
		}
	
	
	@Test(priority = 1, dataProvider = "setData1")
	public void test2(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("verify D3CommandCenterTest ");
	
		loginTest.logintest(h2);
		passLog();
		homePage.clickOnUserAdmin();
		passLog();
		adminPage.clickOnUsersLink();
		passLog();                                    
		viewAllUsersPage.clickOnEmailAddress((h2.get("EmailAddress")));
		passLog();
		Thread.sleep(5000);
		userInformationPage.clickOnNotifications();
		passLog();
		notificationsPage.SelectallAssignedNotifications();
		passLog();
		Thread.sleep(5000);
		notificationsPage.clickOnRemoveLiveUnitNotifications();
		Thread.sleep(5000);
		
		s_assert.assertAll();
		}
	
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("Notifications", "Notifications", xls);
	}
	
}
