package java.com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class ViewProfilePage {
PropertySingleton _instance = null;
	
	public ViewProfilePage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("CameraPage");
	
	public boolean isEmailAddressDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_EmailAddress"),"display");
		return flag;
	}
	public String getTXTEmailAddress() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_EmailAddress"));
		return text;
}
	public String getEmailAddress() throws Throwable 
{	
	String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_EmailAddress"));
	return text;
}
	public boolean isNameDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_Name"),"display");
		return flag;
	}
	public String getName() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_Name"));
		return text;
}
	public String getTXTName() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_Name"));
		return text;
}
	public boolean isTitleDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_Title"),"display");
		return flag;
	}
	public String getTitle() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_Title"));
		return text;
}
	public String getTXTTitle() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_Title"));
		return text;
}
	public boolean isClientDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_Client"),"display");
		return flag;
	}
	public String getClient() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_Client"));
		return text;
}
	public String getTXTClient() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_Client"));
		return text;
}
	public boolean isStreetDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_Street"),"display");
		return flag;
	}
	public String getStreet() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_Street"));
		return text;
}
	public String getTXTStreet() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_Street"));
		return text;
}
	public boolean isInternationalQuadrantDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_InternationalQuadrant"),"display");
		return flag;
	}
	public String getInternationalQuadrant() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_InternationalQuadrant"));
		return text;
}
	public String getTXTInternationalQuadrant() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_InternationalQuadrant"));
		return text;
}
	public boolean isCityDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_City"),"display");
		return flag;
	}
	public String getCity() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_City"));
		return text;
}
	public String getTXTCity() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_City"));
		return text;
}
	public boolean isStateDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_State"),"display");
		return flag;
	}
	public String getState() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_State"));
		return text;
}
	public String getTXTState() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_State"));
		return text;
}
	public boolean isZipDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_Zip"),"display");
		return flag;
	}
	public String getZip() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_Zip"));
		return text;
}
	public String getTXTZip() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_Zip"));
		return text;
}
	public boolean isCountryDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_Country"),"display");
		return flag;
	}
	public String getCountry() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_Country"));
		return text;
}
	public String getTXTCountry() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_Country"));
		return text;
}
	public boolean isTimeZoneDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_TimeZone"),"display");
		return flag;
	}
	public String getTimeZone() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_TimeZone"));
		return text;
}
	public String getTXTTimeZone() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_TimeZone"));
		return text;
}
	public boolean isTemperatureScaleDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_TemperatureScale"),"display");
		return flag;
	}
	public String getTemperatureScale() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_TemperatureScale"));
		return text;
}
	public String getTXTTemperatureScale() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_TemperatureScale"));
		return text;
}
	public boolean isPhoneDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_Phone"),"display");
		return flag;
	}
	public String getPhone() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_Phone"));
		return text;
}
	public String getTXTPhone() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_Phone"));
		return text;
}
	public boolean isMobilePhoneDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_MobilePhone"),"display");
		return flag;
	}
	public String getMobilePhone() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_MobilePhone"));
		return text;
}
	public String getTXTMobilePhone() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_MobilePhone"));
		return text;
}
	public boolean isPushNotificationsEnabledDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_PushNotificationsEnabled"),"display");
		return flag;
	}
public String getPushNotificationsEnabled() throws Throwable 
{	
	String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_PushNotificationsEnabled"));
	return text;
}
public String getTXTPushNotificationsEnabled() throws Throwable 
{	
	String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_PushNotificationsEnabled"));
	return text;
}
	public boolean isLoginExpirationDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_LoginExpiration"),"display");
		return flag;
	}

	public String getLoginExpiration() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_LoginExpiration"));
		return text;
	}
	public String getTXTLoginExpiration() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_LoginExpiration"));
		return text;
	}

	public boolean isRoleDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_Role"),"display");
		return flag;
	}
	public String getRole() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_Role"));
		return text;
	}
	public String getTXTRole() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_Role"));
		return text;
	}
	public boolean isAllowedtouseD3CommandCenterDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_AllowedtouseD3CommandCenter"),"display");
		return flag;
	}
	public String getAllowedtouseD3CommandCenter() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_AllowedtouseD3CommandCenter"));
		return text;
	}
	public String getTXTAllowedtouseD3CommandCenter() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_AllowedtouseD3CommandCenter"));
		return text;
	}

	public boolean isStreamingPlayerPreferenceDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_StreamingPlayerPreference"),"display");
		return flag;
	}
	public String getStreamingPlayerPreference() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_StreamingPlayerPreference"));
		return text;
	}
	public String getTXTStreamingPlayerPreference() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_StreamingPlayerPreference"));
		return text;
	}
	public boolean isDefaultLandingPageDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_DefaultLandingPage"),"display");
		return flag;
	}
	public String getDefaultLandingPage() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_DefaultLandingPage"));
		return text;
	}
	public String getTXTDefaultLandingPage() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_DefaultLandingPage"));
		return text;
	}

	public boolean isRequirePasswordChangeDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_RequirePasswordChange"),"display");
		return flag;
	}
	public String getRequirePasswordChange() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_RequirePasswordChange"));
		return text;
	}
	public String getTXTRequirePasswordChange() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_RequirePasswordChange"));
		return text;
	}
	public boolean isSignedClientTOSDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_SignedClientTOS"),"display");
		return flag;
	}
	public String getSignedClientTOS() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_SignedClientTOS"));
		return text;
	}
	public String getTXTSignedClientTOS() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_SignedClientTOS"));
		return text;
	}
	public boolean isLoginCountDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_LoginCount"),"display");
		return flag;
	}

public String getLoginCount() throws Throwable 
{	
	String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_LoginCount"));
	return text;
}
public String getTXTLoginCount() throws Throwable 
{	
	String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_LoginCount"));
	return text;
}
	public boolean isLastLoginDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_LastLogin"),"display");
		return flag;
	}
	public String getLastLogin() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_LastLogin"));
		return text;
	}
	public String getTXTLastLogin() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_LastLogin"));
		return text;
	}
	public boolean isSecurityDashboardQueueDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_SecurityDashboardQueue"),"display");
		return flag;
	}
	public String getSecurityDashboardQueue() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_SecurityDashboardQueue"));
		return text;
	}
	public String getTXTSecurityDashboardQueue() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_SecurityDashboardQueue"));
		return text;
	}


	public boolean isToursViewedDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_ToursViewed"),"display");
		return flag;
	}
	public String getToursViewed() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_ToursViewed"));
		return text;
	}
	public String getTXTToursViewed() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_ToursViewed"));
		return text;
	}
	public boolean isDateCreatedDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_DateCreated"),"display");
		return flag;
	}
	public String getDateCreated() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_DateCreated"));
		return text;
	}
	public String getTXTDateCreated() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_DateCreated"));
		return text;
	}
	public boolean isDateModifiedDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_DateModified"),"display");
		return flag;
	}
	public String getDateModified() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_DateModified"));
		return text;
	}
	public String getTXTDateModified() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_DateModified"));
		return text;
	}
	public boolean isCreatedByDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_CreatedBy"),"display");
		return flag;
	}
	public String getCreatedBy() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_CreatedBy"));
		return text;
	}
	public String getTXTCreatedBy() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_CreatedBy"));
		return text;
	}
	public boolean isModifiedByDisplay() throws Throwable
	{
		boolean flag=keywords.isdisplay("xpath", _instance.getValue("ViewProfilePage.LBL_ModifiedBy"),"display");
		return flag;
	}
	public String getModifiedBy() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.LBL_ModifiedBy"));
		return text;
	}
	public String getTXTModifiedBy() throws Throwable 
	{	
		String text=keywords.getText("xpath", _instance.getValue("ViewProfilePage.TXT_ModifiedBy"));
		return text;
	}
	public ViewProfilePage clickOnBack()
	{
		keywords.jsClick("xpath", _instance.getValue("ViewProfilePage.BTN_Back"));
		return this;
	}
	public ViewProfilePage clickOnEdit()
	{
		keywords.jsClick("xpath", _instance.getValue("ViewProfilePage.BTN_Edit"));
		return this;
	}
	public ViewProfilePage clickOnNotifications()
	{
		keywords.jsClick("xpath", _instance.getValue("ViewProfilePage.BTN_Notifications"));
		return this;
	}
	public ViewProfilePage clickOnViewProfile()
	{
		keywords.jsClick("xpath", _instance.getValue("ViewProfilePage.BTN_ViewProfile"));
		return this;
	}
	}
