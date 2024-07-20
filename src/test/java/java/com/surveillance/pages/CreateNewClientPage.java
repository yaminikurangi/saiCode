package java.com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class CreateNewClientPage {
	PropertySingleton _instance = null;
	public CreateNewClientPage() {
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("CreateNewClientPage");
	
	public CreateNewClientPage enterName(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_Name"), value);
		return this;
	}
	public CreateNewClientPage enterEmailDomain(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_EmailDomain"), value);
		return this;
	}
	public CreateNewClientPage enterStreetAddress(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_StreetAddress"), value);
		return this;
		
	}
	public CreateNewClientPage enterInternationalQuadrant(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_InternationalQuadrant"), value);
		return this;
	}
	public CreateNewClientPage enterCity(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_City"), value);
		return this;
	}

	public CreateNewClientPage SelectState(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_State"), Data);
		return this;
	}
	public CreateNewClientPage enterZip(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_Zip"), value);
		return this;
	}
	public CreateNewClientPage SelectCountry(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_Country"), Data);
		return this;
	}
	public CreateNewClientPage SelectTimeZone(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_TimeZone"), Data);
		return this;
	}
	public CreateNewClientPage SelectTemperatureScale(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_TemperatureScale"), Data);
		return this;
	}
	public CreateNewClientPage SelectParentClient(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_ParentClient"), Data);
		return this;
	}
	public CreateNewClientPage SelectBillableClient(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_BillableClient"), Data);
		return this;
	}
	public CreateNewClientPage SelectAccountRep(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_AccountRep"), Data);
		return this;
	}
	public CreateNewClientPage SelectSalesRep(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_SalesRep"), Data);
		return this;
	}
	public CreateNewClientPage enterWebsite(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_Website"), value);
		return this;
	}
	public CreateNewClientPage SelectSLA(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_SLA"), Data);
		return this;
	}
	public CreateNewClientPage SelectNotificationProtocol(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_NotificationProtocol"), Data);
		return this;
	}
	public CreateNewClientPage enterSalesContact(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_SalesContact"), value);
		return this;
	}
	public CreateNewClientPage enterSalesPhone(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_SalesPhone"), value);
		return this;
	}
	public CreateNewClientPage enterSalesMobile(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_SalesMobile"), value);
		return this;
	}
	public CreateNewClientPage enterSalesEmail(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_SalesEmail"), value);
		return this;
	}
	public CreateNewClientPage enterBillingContact(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_BillingContact"), value);
		return this;
	}
	public CreateNewClientPage enterBillingPhone(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_BillingPhone"), value);
		return this;
	}
	public CreateNewClientPage enterBillingMobile(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_BillingMobile"), value);
		return this;
	}
	public CreateNewClientPage enterBillingEmail(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_BillingEmail"), value);
		return this;
	}
	public CreateNewClientPage enterTechnicalContact(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_TechnicalContact"), value);
		return this;
	}
	public CreateNewClientPage enterTechnicalPhone(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_TechnicalPhone"), value);
		return this;
	}
	public CreateNewClientPage enterTechnicalMobile(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_TechnicalMobile"), value);
		return this;
	}
	public CreateNewClientPage enterTechnicalEmail(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_TechnicalEmail"), value);
		return this;
	}

	public CreateNewClientPage enterSecurityKey(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_SecurityKey"), value);
		return this;
	}

	public CreateNewClientPage enterMapCenterLatitude(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_MapCenterLatitude"), value);
		return this;
	}
	public CreateNewClientPage enterMapCenterLongitude(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_MapCenterLongitude"), value);
		return this;
	}
	public CreateNewClientPage enterMapZoomLevel(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_MapZoomLevel"), value);
		return this;
	}
	public CreateNewClientPage SelectMapType(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_MapType"), Data);
		return this;
	}
	public CreateNewClientPage SelectCameraNavigationMode(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_CameraNavigationMode"), Data);
		return this;
	}
	public CreateNewClientPage SelectDefaultView(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_DefaultView"), Data);
		return this;
	}
	public CreateNewClientPage enterLogoImageName(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_LogoImageName"), value);
		return this;
	}
	public CreateNewClientPage enterVideoOverlayImage(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_VideoOverlayImage"), value);
		return this;
	}
	public CreateNewClientPage enterAuthenticationEmailLinkDomain(String value) throws Exception {
		System.out.println("enterAuthenticationEmailLinkDomain : " +value);
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_AuthenticationEmailLinkDomain"), value);
		return this;
	}
	public CreateNewClientPage enterClientDomainRedirect(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_ClientDomainRedirect"), value);
		return this;
	}
	public CreateNewClientPage SelectStreamingPlayerPreference(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_StreamingPlayerPreference"), Data);
		return this;
	}
		public CreateNewClientPage enterVideoTimeout(String value) throws Exception {
		keywords.clearEnter("xpath", _instance.getValue("CreateNewClientPage.Edit_VideoTimeout"), value);
		return this;
	}
		public CreateNewClientPage enterPublicVideoTimeout(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_PublicVideoTimeout"), value);
			return this;
	}
		public CreateNewClientPage SelectPublicViewMode(String Data) throws Throwable
		{
			
			keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_PublicViewMode"), Data);
			return this;
		}
		public CreateNewClientPage enterOldFTPServer(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_OldFTPServer"), value);
			return this;
	}
		public CreateNewClientPage enterWatermarkTextforImages(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_WatermarkTextforImages"), value);
			return this;
	}
		public CreateNewClientPage enterWelcomeEmailMessage(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_WelcomeEmailMessage"), value);
			return this;
	}
		public CreateNewClientPage SelectRestrictAccesstoSpeakerforthisClientsUsers(String Data) throws Throwable
		{
			
			keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_RestrictAccesstoSpeakerforthisClientsUsers"), Data);
			return this;
		}
		public CreateNewClientPage SelectRestrictAccesstoSpeakerforOtherClientsUsers(String Data) throws Throwable
		{
			
			keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_RestrictAccesstoSpeakerforOtherClientsUsers"), Data);
			return this;
		}
		public CreateNewClientPage SelectUseStreamingServer(String Data) throws Throwable
		{
			
			keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_UseStreamingServer"), Data);
			return this;
		}
		public CreateNewClientPage SelectPatrolServer(String Data) throws Throwable
		{
			
			keywords.SelectDropDown("xpath", _instance.getValue("CreateNewClientPage.Dropdown_PatrolServer"), Data);
			return this;
		}
		public CreateNewClientPage enterSensorDataExpiration(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_SensorDataExpiration"), value);
			return this;
		}
		public CreateNewClientPage enterTermsOfServiceText(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_TermsOfServiceText"), value);
			return this;
	}
	
		public CreateNewClientPage enterNotes(String value) throws Exception {
			keywords.enterData("xpath", _instance.getValue("CreateNewClientPage.Edit_Notes"), value);
			return this;
	}
		
		public CreateNewClientPage ClickonAllowedtouseD3CommandCenter(String value) throws Exception {
			keywords.checkClick("xpath", _instance.getValue("CreateNewClientPage.Checkbox_AllowedtouseD3CommandCenter"), value);
			return this;
		}
		
		public CreateNewClientPage clickOnCancel() throws Exception {
			keywords.jsClick("xpath", _instance.getValue("CreateNewClientPage.BTN_Cancel"));
			
			return this;
		}
		public CreateNewClientPage clickOnAddNewClient() throws Exception {
			keywords.jsClick("xpath", _instance.getValue("CreateNewClientPage.BTN_AddNewClient"));
			
			return this;
		}
		public CreateNewClientPage clickOnAddNewClient_clientpage() throws Exception {
			keywords.jsClick("xpath", _instance.getValue("CreateNewClientPage.BTN_AddNewClient_clientpage"));
			return this;
		}
		}
