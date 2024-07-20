package com.surveillance.Test;

import java.com.surveillance.pages.ViewProfilePage;
import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class ViewProfilePageTest extends BaseTest{
		
		private static final boolean False = false;
		SoftAssert s_assert = new SoftAssert();
			PropertySingleton _instance = null;
			
			LoginTest loginTest=new LoginTest();
			ViewProfilePage viewprofilepage =new ViewProfilePage();
		
		    public ViewProfilePageTest() throws Throwable 
			{
				_instance = PropertySingleton.getInstance();
			}
			@BeforeClass
			public void startReport()
			{
				beforeClassForChild(this);
				
			}
			
			@Test(priority = 0, dataProvider = "setData1",enabled=False)
			
			public void ViewProfile(Hashtable<String, String> h2) throws Throwable 
			{
			extentLoggerECP = parentExtentLogger.createNode("View Profile Page Test For Lable");

			loginTest.logintest(h2);
			passLog();
			viewprofilepage.clickOnViewProfile();
			passLog();
			s_assert.assertTrue(viewprofilepage.isEmailAddressDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isNameDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isTitleDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isClientDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isStreetDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isInternationalQuadrantDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isCityDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isStateDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isZipDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isCountryDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isTimeZoneDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isPhoneDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isMobilePhoneDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isPushNotificationsEnabledDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isLoginExpirationDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isAllowedtouseD3CommandCenterDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isStreamingPlayerPreferenceDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isDefaultLandingPageDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isSecurityDashboardQueueDisplay()==true);

        	s_assert.assertTrue(viewprofilepage.isRequirePasswordChangeDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isSignedClientTOSDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isLoginCountDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isLastLoginDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isToursViewedDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isDateCreatedDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isDateModifiedDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isCreatedByDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isModifiedByDisplay()==true);
			s_assert.assertTrue(viewprofilepage.isModifiedByDisplay()==true);
			s_assert.assertAll();
//			viewprofilepage.clickOnBack();
//			viewprofilepage.clickOnEdit();
//			viewprofilepage.clickOnNotifications();
			}

			@Test(priority = 0, dataProvider = "setData1",enabled = False)
			
			public void ViewProfile1(Hashtable<String, String> h2) throws Throwable 
			{
			extentLoggerECP = parentExtentLogger.createNode("Verify View Profile Page Test Text Lable");

			loginTest.logintest(h2);
			passLog();
			viewprofilepage.clickOnViewProfile();
			passLog();
			Thread.sleep(5000);
			String expectedEmailAddress=viewprofilepage.getEmailAddress();
		    s_assert.assertTrue(expectedEmailAddress.equals("EmailAddress"));
		 
		    passLog();
	       	String expectedName=viewprofilepage.getName();
	        s_assert.assertTrue(expectedName.equals("Name"));
	        passLog();
	    	String expectedTitle=viewprofilepage.getTitle();
	        s_assert.assertTrue(expectedTitle.equals("Title"));
	        passLog();
	        String expectedClient=viewprofilepage.getClient();
	        s_assert.assertTrue(expectedClient.equals("Client"));
	        passLog();
	        String expectedStreet=viewprofilepage.getStreet();
	        s_assert.assertTrue(expectedStreet.equals("Street"));
	        passLog();
	        String expectedInternationalQuadrant=viewprofilepage.getInternationalQuadrant();
	        s_assert.assertTrue(expectedInternationalQuadrant.equals("InternationalQuadrant"));
	        passLog();
	        String expectedCity=viewprofilepage.getCity();
	        s_assert.assertTrue(expectedCity.equals("City"));
	        passLog();
	        String expectedState=viewprofilepage.getState();
	        s_assert.assertTrue(expectedState.equals("State"));
		   
	        passLog();
	        String expectedZip=viewprofilepage.getZip();
	        s_assert.assertTrue(expectedZip.equals("Zip"));
	        passLog();
	        String expectedCountry=viewprofilepage.getCountry();
	        s_assert.assertTrue(expectedCountry.equals("Country"));
	        passLog();
	        String expectedTimeZone=viewprofilepage.getTimeZone();
	        s_assert.assertTrue(expectedTimeZone.equals("TimeZone"));

	        passLog();
	        String expectedTemperatureScale=viewprofilepage.getTemperatureScale();
	        s_assert.assertTrue(expectedTemperatureScale.equals("TemperatureScale"));
		   
	        passLog();
	        String expectedPhone=viewprofilepage.getPhone();
	        s_assert.assertTrue(expectedPhone.equals("Phone"));
		   
	        passLog();
	        String expectedMobilePhone=viewprofilepage.getMobilePhone();
	        s_assert.assertTrue(expectedMobilePhone.equals("MobilePhone"));
		  
	        passLog();
	        String expectedPushNotificationsEnabled=viewprofilepage.getPushNotificationsEnabled();
	        s_assert.assertTrue(expectedPushNotificationsEnabled.equals("PushNotificationsEnabled"));
		   
	        passLog();
	        String expectedLoginExpiration=viewprofilepage.getLoginExpiration();
	        s_assert.assertTrue(expectedLoginExpiration.equals("LoginExpiration"));
		
	        passLog();
	        String expectedRole=viewprofilepage.getRole();
	        s_assert.assertTrue(expectedRole.equals("Role"));
		
	        passLog();
	        String expectedAllowedtouseD3CommandCenter=viewprofilepage.getAllowedtouseD3CommandCenter();
	        s_assert.assertTrue(expectedAllowedtouseD3CommandCenter.equals("AllowedtouseD3CommandCenter"));
		  
	        passLog();
	        String expectedStreamingPlayerPreference=viewprofilepage.getStreamingPlayerPreference();
	        s_assert.assertTrue(expectedStreamingPlayerPreference.equals("StreamingPlayerPreference"));
	        passLog();
	        String expectedDefaultLandingPage=viewprofilepage.getDefaultLandingPage();
	        s_assert.assertTrue(expectedDefaultLandingPage.equals("DefaultLandingPage"));
	        passLog();
	        String expectedSecurityDashboardQueue=viewprofilepage.getSecurityDashboardQueue();
	        s_assert.assertTrue(expectedSecurityDashboardQueue.equals("SecurityDashboardQueue"));
	        passLog();
	        
	        String expectedRequirePasswordChange=viewprofilepage.getRequirePasswordChange();
	        s_assert.assertTrue(expectedRequirePasswordChange.equals("RequirePasswordChange"));
	        passLog();
//	        String expectedSignedClientTOS=viewprofilepage.getSignedClientTOS();
//	        s_assert.assertTrue(expectedSignedClientTOS.equals("SignedClientTOS"));
//		    s_assert.assertTrue(expectedSignedClientTOS.equals(h2.get("SignedClientTOS")));
//	        passLog();
	        String expectedLoginCount=viewprofilepage.getLoginCount();
	        s_assert.assertTrue(expectedLoginCount.equals("LoginCount"));
	        passLog();
	        String expectedLastLogin=viewprofilepage.getLastLogin();
	        s_assert.assertTrue(expectedLastLogin.equals("LastLogin"));
		    s_assert.assertTrue(expectedLastLogin.equals(h2.get("LastLogin")));
	        passLog();
//	        String expectedToursViewed=viewprofilepage.getToursViewed();
//	        s_assert.assertTrue(expectedToursViewed.equals("ToursViewed"));
//		    s_assert.assertTrue(expectedToursViewed.equals(h2.get("ToursViewed")));
//	        passLog();
	        String expectedDateCreated=viewprofilepage.getDateCreated();
	        s_assert.assertTrue(expectedDateCreated.equals("DateCreated"));
		    s_assert.assertTrue(expectedDateCreated.equals(h2.get("DateCreated")));
	        passLog();
	        String expectedDateModified=viewprofilepage.getDateModified();
	        s_assert.assertTrue(expectedDateModified.equals("DateModified"));
	        passLog();
	        String expectedCreatedBy=viewprofilepage.getCreatedBy();
	        s_assert.assertTrue(expectedCreatedBy.equals("CreatedBy"));
	        passLog();
	        String expectedModifiedBy=viewprofilepage.getModifiedBy();
	        s_assert.assertTrue(expectedModifiedBy.equals("ModifiedBy"));
	        passLog();
}
	@Test(priority = 0, dataProvider = "setData1")
			
			public void ViewProfile2(Hashtable<String, String> h2) throws Throwable 
			{
			extentLoggerECP = parentExtentLogger.createNode("Verify View Profile Page Test For Lables");

			loginTest.logintest(h2);
			passLog();
			viewprofilepage.clickOnViewProfile();
			Thread.sleep(3000);
			passLog();
			
			s_assert.assertTrue(viewprofilepage.getTXTEmailAddress().equals(h2.get("EmailAddress")));
			System.out.println(viewprofilepage.getTXTEmailAddress());
			System.out.println(h2.get("EmailAddress"));
			s_assert.assertTrue(viewprofilepage.getTXTName().equals(h2.get("Name")));
			System.out.println(viewprofilepage.getTXTName());
			System.out.println(h2.get("Name"));
			s_assert.assertTrue(viewprofilepage.getTXTTitle().equals(h2.get("Title")));
			System.out.println(viewprofilepage.getTXTTitle());
			System.out.println(h2.get("Title"));
			s_assert.assertTrue(viewprofilepage.getTXTClient().equals(h2.get("Client")));
			System.out.println(viewprofilepage.getTXTClient());
			System.out.println(h2.get("Client"));
			s_assert.assertTrue(viewprofilepage.getTXTStreet().equals(h2.get("Street")));
			System.out.println(viewprofilepage.getTXTStreet());
			System.out.println(h2.get("Street"));
			s_assert.assertTrue(viewprofilepage.getTXTInternationalQuadrant().equals(h2.get("InternationalQuadrant")));
			System.out.println(viewprofilepage.getTXTInternationalQuadrant());
			System.out.println(h2.get("InternationalQuadrant"));
			s_assert.assertTrue(viewprofilepage.getTXTCity().equals(h2.get("City")));
			System.out.println(viewprofilepage.getTXTCity());
			System.out.println(h2.get("City"));
			s_assert.assertTrue(viewprofilepage.getTXTState().equals(h2.get("State")));
			System.out.println(viewprofilepage.getTXTState());
			System.out.println(h2.get("State"));
			s_assert.assertTrue(viewprofilepage.getTXTZip().equals(h2.get("Zip")));
			System.out.println(viewprofilepage.getTXTZip());
			System.out.println(h2.get("Zip"));
			s_assert.assertTrue(viewprofilepage.getTXTCountry().equals(h2.get("Country")));
			System.out.println(viewprofilepage.getTXTCountry());
			System.out.println(h2.get("Country"));
			s_assert.assertTrue(viewprofilepage.getTXTTimeZone().equals(h2.get("TimeZone")));
			System.out.println(viewprofilepage.getTXTTimeZone());
			System.out.println(h2.get("TimeZone"));
			s_assert.assertTrue(viewprofilepage.getTXTTemperatureScale().equals(h2.get("TemperatureScale")));
			System.out.println(viewprofilepage.getTXTTemperatureScale());
			System.out.println(h2.get("TemperatureScale"));
			s_assert.assertTrue(viewprofilepage.getTXTPhone().equals(h2.get("Phone")));
			System.out.println(viewprofilepage.getTXTPhone());
			System.out.println(h2.get("Phone"));
			s_assert.assertTrue(viewprofilepage.getTXTMobilePhone().equals(h2.get("MobilePhone")));
			System.out.println(viewprofilepage.getTXTMobilePhone());
			System.out.println(h2.get("MobilePhone"));
			s_assert.assertTrue(viewprofilepage.getTXTPushNotificationsEnabled().equals(h2.get("PushNotificationsEnabled")));
			System.out.println(viewprofilepage.getTXTPushNotificationsEnabled());
			System.out.println(h2.get("PushNotificationsEnabled"));
			s_assert.assertTrue(viewprofilepage.getTXTLoginExpiration().equals(h2.get("LoginExpiration")));
			System.out.println(viewprofilepage.getTXTLoginExpiration());
			System.out.println(h2.get("LoginExpiration"));
			s_assert.assertTrue(viewprofilepage.getTXTRole().equals(h2.get("Role")));
			System.out.println(viewprofilepage.getTXTRole());
			System.out.println(h2.get("Role"));
			s_assert.assertTrue(viewprofilepage.getTXTAllowedtouseD3CommandCenter().equals(h2.get("AllowedtouseD3CommandCenter")));
			System.out.println(viewprofilepage.getTXTAllowedtouseD3CommandCenter());
			System.out.println(h2.get("AllowedtouseD3CommandCenter"));
			s_assert.assertTrue(viewprofilepage.getTXTStreamingPlayerPreference().equals(h2.get("StreamingPlayerPreference")));
			System.out.println(viewprofilepage.getTXTStreamingPlayerPreference());
			System.out.println(h2.get("StreamingPlayerPreference"));
			s_assert.assertTrue(viewprofilepage.getTXTDefaultLandingPage().equals(h2.get("DefaultLandingPage")));
			System.out.println(viewprofilepage.getTXTDefaultLandingPage());
			System.out.println(h2.get("DefaultLandingPage"));
			s_assert.assertTrue(viewprofilepage.getTXTRequirePasswordChange().equals(h2.get("RequirePasswordChange")));
			System.out.println(viewprofilepage.getTXTRequirePasswordChange());
			System.out.println(h2.get("RequirePasswordChange"));
//			s_assert.assertTrue(viewprofilepage.getTXTSignedClientTOS().equals(h2.get("SignedClientTOS")));
//			System.out.println(viewprofilepage.getTXTSignedClientTOS());
//			System.out.println(h2.get("SignedClientTOS"));
			
//			s_assert.assertTrue(viewprofilepage.getTXTLoginCount().equals(h2.get("LoginCount")));
//			System.out.println(viewprofilepage.getTXTLoginCount());
//			System.out.println(h2.get("LoginCount"));
//			s_assert.assertTrue(viewprofilepage.getTXTLastLogin().equals(h2.get("LastLogin")));
//			System.out.println(viewprofilepage.getTXTLastLogin());
//			System.out.println(h2.get("LastLogin"));
			s_assert.assertTrue(viewprofilepage.getTXTSecurityDashboardQueue().equals(h2.get("SecurityDashboardQueue")));
			System.out.println(viewprofilepage.getTXTSecurityDashboardQueue());
			System.out.println(h2.get("SecurityDashboardQueue"));
//			s_assert.assertTrue(viewprofilepage.getTXTToursViewed().equals(h2.get("ToursViewed")));
//			System.out.println(viewprofilepage.getTXTToursViewed());
//			System.out.println(h2.get("ToursViewed"));
			
			s_assert.assertTrue(viewprofilepage.getTXTDateCreated().equals(h2.get("DateCreated")));
			System.out.println(viewprofilepage.getTXTDateCreated());
			System.out.println(h2.get("DateCreated"));
			s_assert.assertTrue(viewprofilepage.getTXTDateModified().equals(h2.get("DateModified")));
			System.out.println(viewprofilepage.getTXTDateModified());
			System.out.println(h2.get("DateModified"));
			s_assert.assertTrue(viewprofilepage.getTXTCreatedBy().equals(h2.get("CreatedBy")));
			System.out.println(viewprofilepage.getTXTCreatedBy());
			System.out.println(h2.get("CreatedBy"));
			s_assert.assertTrue(viewprofilepage.getTXTModifiedBy().equals(h2.get("ModifiedBy")));
			System.out.println(viewprofilepage.getTXTModifiedBy());
			System.out.println(h2.get("ModifiedBy"));
			s_assert.assertAll();
			
	}
			@DataProvider
			public Object[][] setData1() {
				
				Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\TestData\\testdata.xlsx");
				return ReadData.getData("ViewProfilePage", "ViewProfilePageTest", xls);
			}
}