package com.surveillance.Test;

import java.com.surveillance.pages.ArchivesLiveUnitsPage;
import java.com.surveillance.pages.HomePage;
import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class ArchivesLiveUnitsTest extends BaseTest
{
	
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert(); 
	
	LoginTest loginTest=new LoginTest();
	HomePage homePage=new HomePage();
	ArchivesLiveUnitsPage archivesLiveUnitsPage =new ArchivesLiveUnitsPage();

	public ArchivesLiveUnitsTest() throws Throwable {
		_instance = PropertySingleton.getInstance();
		
	}

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}

	
	@Test(priority = 0, dataProvider = "setData1")
	public void Archivescamera(Hashtable<String, String> h2) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("Verify Archieve Live Unit");
		loginTest.logintest(h2);
		passLog();
		homePage.clickOnArchives();
		passLog();
		archivesLiveUnitsPage.selectLiveUnit(h2.get("LiveUnit"));
		passLog();
		archivesLiveUnitsPage.clickonLiveUnitID();
		passLog();
		archivesLiveUnitsPage.selectCameraLink(h2.get("CameraLink"));
		passLog();
		archivesLiveUnitsPage.selectCameraCalendarDate(h2.get("SelectDate"));
		passLog();
		String display=archivesLiveUnitsPage.getVideoTime();
		System.out.println("Retrodispaly Time : "+display);
		String setTime=archivesLiveUnitsPage.setVideoTime(h2.get("SelectDate"));
		System.out.println("Display Time "+display +"and  "+"SetTime "+setTime);
		s_assert.assertTrue(display.contains(setTime));
		s_assert.assertAll();
	}
	
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("LiveUnits", "ArchiveLiveUnits", xls);
	}

}
