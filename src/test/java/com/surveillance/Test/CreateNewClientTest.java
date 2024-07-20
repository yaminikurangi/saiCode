package com.surveillance.Test;

import java.com.surveillance.pages.AdminPage;
import java.com.surveillance.pages.CreateNewClientPage;
import java.com.surveillance.pages.HomePage;
import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

public class CreateNewClientTest extends BaseTest
{
	SoftAssert s_assert = new SoftAssert();
	PropertySingleton _instance = null;
	
	LoginTest loginTest=new LoginTest();
	HomePage homePage =new HomePage();
	AdminPage adminPage=new AdminPage();
	CreateNewClientPage createNewClientPage=new CreateNewClientPage();
	
	public CreateNewClientTest() throws Throwable 
	{
		_instance = PropertySingleton.getInstance();
	}
	

	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	
	@Test(priority = 0, dataProvider = "setData1",enabled =false)
	public void NewClientwithmandatoryfields(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("New Client with mandatory fields");
	
	loginTest.logintest(h2);
	passLog();
	homePage.clickOnUserAdmin();
	passLog();
	adminPage.clickonClients();
	passLog();
	createNewClientPage.clickOnAddNewClient_clientpage();
	passLog();
	createNewClientPage.enterName(h2.get("Name"));
	passLog();
	createNewClientPage.SelectTimeZone(h2.get("TimeZone"));
	passLog();
	createNewClientPage.SelectAccountRep(h2.get("AccountRep"));
	passLog();
	createNewClientPage.enterVideoTimeout(h2.get("Timeout"));
	passLog();
	}
	
	@DataProvider
	public Object[][] setData1() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\TestData\\testdata.xlsx");
		return ReadData.getData("CreateNewClient", "CreateNewClient", xls);
	}
	
	@Test(priority = 0, dataProvider = "setDataforAllFileds")
	public void createNewClientWithAllFields(Hashtable<String, String> h2) throws Throwable 
	{
	extentLoggerECP = parentExtentLogger.createNode("create NewClient With All Fields");
	loginTest.logintest(h2);
	passLog();
	homePage.clickOnUserAdmin();
	passLog();
	adminPage.clickonClients();
	passLog();
	createNewClientPage.clickOnAddNewClient_clientpage();
	passLog();
	createNewClientPage.enterName(h2.get("Name"));
	passLog();
	createNewClientPage.SelectTimeZone(h2.get("TimeZone"));
	passLog();
	createNewClientPage.SelectAccountRep(h2.get("AccountRep"));
	passLog();
	createNewClientPage.enterVideoTimeout(h2.get("Timeout"));
	passLog();
	createNewClientPage.enterEmailDomain(h2.get("EmailDomain"));
	passLog();
	createNewClientPage.enterStreetAddress(h2.get("StreetAddress"));
	passLog();
	createNewClientPage.enterInternationalQuadrant(h2.get("InternationalQuadrant"));
	passLog();
	createNewClientPage.enterCity(h2.get("City"));
	passLog();
	createNewClientPage.SelectState(h2.get("State"));
	passLog();
	createNewClientPage.enterZip(h2.get("Zip"));
	passLog();
	createNewClientPage.SelectCountry(h2.get("Country"));
	passLog();
	createNewClientPage.SelectTemperatureScale(h2.get("TemperatureScale"));
	passLog();
	createNewClientPage.SelectParentClient(h2.get("ParentClient"));
	passLog();
	createNewClientPage.SelectBillableClient(h2.get("BillableClient"));
	passLog();
	createNewClientPage.SelectSalesRep(h2.get("SalesRep"));
	passLog();
	createNewClientPage.enterWebsite(h2.get("Website"));
	passLog();
	createNewClientPage.SelectSLA(h2.get("SLA"));
	passLog();
	createNewClientPage.SelectNotificationProtocol(h2.get("NotificationProtocol"));
	passLog();
	createNewClientPage.enterSalesContact(h2.get("SalesContact"));
	passLog();
	createNewClientPage.enterSalesPhone(h2.get("SalesPhone"));
	passLog();
	createNewClientPage.enterSalesMobile(h2.get("SalesMobile"));
	passLog();
	createNewClientPage.enterSalesEmail(h2.get("SalesEmail"));
	passLog();
	createNewClientPage.enterBillingContact(h2.get("BillingContact"));
	passLog();
	createNewClientPage.enterBillingPhone(h2.get("BillingPhone"));
	passLog();
	createNewClientPage.enterBillingMobile(h2.get("BillingMobile"));
	passLog();
	createNewClientPage.enterBillingEmail(h2.get("BillingEmail"));
	passLog();
	createNewClientPage.enterTechnicalContact(h2.get("TechnicalContact"));
	passLog();
	createNewClientPage.enterTechnicalPhone(h2.get("TechnicalPhone"));
	passLog();
	createNewClientPage.enterTechnicalMobile(h2.get("TechnicalMobile"));
	passLog();
	createNewClientPage.enterTechnicalEmail(h2.get("TechnicalEmail"));
	passLog();
	createNewClientPage.enterSecurityKey(h2.get("SecurityKey"));
	passLog();
	createNewClientPage.enterMapCenterLatitude(h2.get("MapCenterLatitude"));
	passLog();
	createNewClientPage.enterMapCenterLongitude(h2.get("MapCenterLongitude"));
	passLog();
	createNewClientPage.enterMapZoomLevel(h2.get("MapZoomLevel"));
	passLog();
	createNewClientPage.SelectMapType(h2.get("MapType"));
	passLog();
	createNewClientPage.SelectCameraNavigationMode(h2.get("CameraNavigationMode"));
	passLog();
	createNewClientPage.SelectDefaultView(h2.get("DefaultView"));
	passLog();
	createNewClientPage.enterLogoImageName(h2.get("LogoImageName"));
	passLog();
	createNewClientPage.enterVideoOverlayImage(h2.get("VideoOverlayImage"));
	passLog();
	createNewClientPage.enterAuthenticationEmailLinkDomain(h2.get("AuthenticationEmailLinkDomain"));
	passLog();
	createNewClientPage.enterClientDomainRedirect(h2.get("ClientDomainRedirect"));
	passLog();
	createNewClientPage.SelectStreamingPlayerPreference(h2.get("StreamingPlayerPreference"));
	passLog();
	createNewClientPage.enterPublicVideoTimeout(h2.get("PublicVideoTimeout"));
	passLog();
	createNewClientPage.SelectPublicViewMode(h2.get("PublicViewMode"));
	passLog();
	createNewClientPage.enterOldFTPServer(h2.get("OldFTPServer"));
	passLog();
	createNewClientPage.enterWatermarkTextforImages(h2.get("WatermarkTextforImages"));
	passLog();
	createNewClientPage.enterWelcomeEmailMessage(h2.get("WelcomeEmailMessage"));
	passLog();
	createNewClientPage.SelectRestrictAccesstoSpeakerforthisClientsUsers(h2.get("thisClientsUsers"));
	passLog();
	createNewClientPage.SelectRestrictAccesstoSpeakerforOtherClientsUsers(h2.get("OtherClientsUsers"));
	passLog();
	createNewClientPage.SelectUseStreamingServer(h2.get("StreamingServer"));
	passLog();
    createNewClientPage.SelectPatrolServer(h2.get("PatrolServer"));
	passLog();
	createNewClientPage.enterSensorDataExpiration(h2.get("DataExpiration"));
	passLog();
	createNewClientPage.enterTermsOfServiceText(h2.get("TermsOfServiceText"));
	passLog();
	createNewClientPage.enterNotes(h2.get("Notes"));
	passLog();
	createNewClientPage.ClickonAllowedtouseD3CommandCenter(h2.get("useD3CommandCenter"));
	passLog();
	createNewClientPage.clickOnCancel();
	passLog();
	createNewClientPage.clickOnAddNewClient_clientpage();
	passLog();
	}
	
	
	@DataProvider
	public Object[][] setDataforAllFileds() {
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\TestData\\testdata.xlsx");
		return ReadData.getData("CreateNewClient", "CreateNewClientWithAllFields", xls);
	}
	
	

}
