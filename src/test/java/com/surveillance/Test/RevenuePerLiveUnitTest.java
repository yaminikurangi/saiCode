package com.surveillance.Test;

import java.com.surveillance.pages.LoginPage;
import java.com.surveillance.pages.RevenuePerLiveUnitPage;
import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class RevenuePerLiveUnitTest extends BaseTest
{
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();
	LoginPage login=new LoginPage();
	RevenuePerLiveUnitPage revenuePerLiveUnitPage=new RevenuePerLiveUnitPage();
	
	public RevenuePerLiveUnitTest() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("RevenuePerLiveUnitPage");

	@Test(dataProvider = "setData1")
	public void a_BillableClientTest(Hashtable<String, String> h2) throws Exception
	{
		extentLoggerECP = parentExtentLogger.createNode("To Billable Client data");
	
		login.enterLoginEmail(h2.get("Email"));
		passLog();;
		login.clickOnLogin();
		passLog();
		login.enterPassword(h2.get("Password"));
		passLog();
		login.clickOnLogin();
		passLog();
	
		revenuePerLiveUnitPage.selectBillableClient(h2.get("Billable_Client"));
		revenuePerLiveUnitPage.clickOnApplyFilter();
		boolean dataTest=revenuePerLiveUnitPage.getBillableClient(h2.get("Billable_Client"));
		s_assert.assertEquals(dataTest, true);
		s_assert.assertAll();
				
	}
	
	
	@Test(dataProvider = "setData1")
	public void b_BillableClientTest2(Hashtable<String, String> h2) throws Exception
	{
		extentLoggerECP = parentExtentLogger.createNode("To Billable Client data");
	
		login.enterLoginEmail(h2.get("Email"));
		passLog();;
		login.clickOnLogin();
		passLog();
		login.enterPassword(h2.get("Password"));
		passLog();
		login.clickOnLogin();
		passLog();
	
		revenuePerLiveUnitPage.selectBillableClient(h2.get("Billable_Client"));
		revenuePerLiveUnitPage.clickOnApplyFilter();
		boolean dataTest=revenuePerLiveUnitPage.getBillableClient(h2.get("Billable_Client"));
		s_assert.assertEquals(dataTest, true);
		s_assert.assertAll();
				
	}
	
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "/TestData/testdata.xlsx");
		return ReadData.getData("RevenuePerLiveUnitTest", "RevenuePerLiveUnitTest", xls);
	}
	
	

}
