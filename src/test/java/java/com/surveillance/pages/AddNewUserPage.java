package java.com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class AddNewUserPage 
{
PropertySingleton _instance = null;
	
	public AddNewUserPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("CameraPage");
	
	
	public AddNewUserPage clickAdminAddNewUser()
	{
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.BTN_AddAdminNewUser"));
		return this;
	}
	
	public AddNewUserPage enterEmailAddress(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_EmailAddress"),Data);
		return this;
	}
	
	public AddNewUserPage clickOnOTS()
	{
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.checkTOS"));
		return this;
	}
	
	public AddNewUserPage selectClients(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_Clients"),Data);
		return this;
	}
	
	public AddNewUserPage enterName(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_Name"),Data);
		return this;
	}
	
	public AddNewUserPage enterTitle(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_Title"),Data);
		return this;
	}
	
	public AddNewUserPage selectSteamingPlayer(String Data)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.Dropdown_SteamingPlayer"),Data);
		return this;
	}
	
	public AddNewUserPage enterStreetAddress(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_StreetAddress"),Data);
		return this;
	}
	
	
	public AddNewUserPage enterInternationalQuadrant(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.Edit_InternationalQuadrant"));
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_InternationalQuadrant"),Data);
		return this;
	}
	
	public AddNewUserPage enterCity(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.Edit_City"));
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_City"),Data);
		return this;
	}
	
	public AddNewUserPage selectState(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.DropDown_State"));
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_State"),Data);
		return this;
	}
	
	public AddNewUserPage enterZip(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.Edit_Zip"));
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_Zip"),Data);
		return this;
	}
	public AddNewUserPage selectCountry(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.DropDown_Country"));
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_Country"),Data);
		return this;
	}
	public AddNewUserPage selectTimeZon(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.DropDown_TimeZone"));
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_TimeZone"),Data);
		return this;
	}
	
	public AddNewUserPage enterPhoneNumber(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.Edit_Phone"));
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_Phone"),Data);
		return this;
	}
	
	public AddNewUserPage enterMobileNumber(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.Edit_Mobile"));
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_Mobile"),Data);
		return this;
	}
	
	public AddNewUserPage selectExpMonth(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.DropDown_ExpMonth"));
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_ExpMonth"),Data);
		return this;
	}
	public AddNewUserPage selectExpDay(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.DropDown_ExpDay"));
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_ExpDay"),Data);
		return this;
	}
	public AddNewUserPage selectExpYear(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.DropDown_ExpYear"));
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_ExpYear"),Data);
		return this;
	}
	public AddNewUserPage selectRole(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.DropDown_Role"));
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_Role"),Data);
		return this;
	}
	
	
	public AddNewUserPage selectNotificationProtocol(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.DropDown_NotificationProtocol"));
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_NotificationProtocol"),Data);
		return this;
	}
	
	
	public AddNewUserPage clickD3Coomand() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.Chek_D3Coomand"));
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.Chek_D3Coomand"));
		return this;
	}
	
	public AddNewUserPage enterDefaultlandingPage(String Data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.Edit_DefaultlandingPage"));
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_DefaultlandingPage"),Data);
		return this;
	}
	
	public AddNewUserPage clickonCancel() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.BTN_cancel"));
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.BTN_cancel"));
		return this;
	}
	
	public AddNewUserPage clickonAddNewUser() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.BTN_AddNewUser"));
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.BTN_AddNewUser"));
		return this;
	}
	
	public AddNewUserPage clickonAddNewUserAndEdituserCameraRights() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.BTN_AddNewUserAndEdituserCameraRights"));
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.BTN_AddNewUserAndEdituserCameraRights"));
		return this;
	}
	public AddNewUserPage selectPolicies(String data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.DropDown_Policies"));
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_Policies"),data);
		return this;
	}
	public AddNewUserPage clickonPoliciesAdd() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.BTN_PoliciesAdd"));
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.BTN_PoliciesAdd"));
		return this;
	}
	public AddNewUserPage selectQueues(String data) throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.DropDown_Queues"));
		keywords.SelectDropDown("xpath", _instance.getValue("AddNewUser.DropDown_Queues"),data);
		return this;
	}
	
	public AddNewUserPage clickonQueuesAdd() throws Throwable
	{
		keywords.scrollElementfound("xpath", _instance.getValue("AddNewUser.BTN_QueuesAdd"));
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.BTN_QueuesAdd"));
		return this;
	}
	public AddNewUserPage enterNewPassword(String data) throws Throwable
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_newPassword"),data);
		return this;
	}
	public AddNewUserPage enterConfirmPassword(String data) throws Throwable
	{
		keywords.enterData("xpath", _instance.getValue("AddNewUser.Edit_confirmPassword"),data);
		return this;
	}
	public AddNewUserPage clickonResetSubmit() throws Throwable
	{
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.BTN_SetPassword"));
		return this;
	}
	public AddNewUserPage ActiveAccount() throws Throwable
	{
		keywords.emailValidation();
		return this;
	}
	
	
	public AddNewUserPage SelectAllPoliciesAssigned() throws Throwable
	{
	keywords.selectAllOptions("xpath", _instance.getValue("AddNewUser.DropDown_PoliciesAssigned"));
	return this;
	}
	public AddNewUserPage SelectAllQueuesAssigned() throws Throwable
	{
	keywords.selectAllOptions("xpath", _instance.getValue("AddNewUser.Dropdown_QueuesAssigned"));
	return this;
	}
	public AddNewUserPage clickonRemove() throws Throwable
	{
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.BTN_Remove"));
		return this;
	}
	public AddNewUserPage clickOnUpdateUser()
	{
		keywords.jsClick("xpath", _instance.getValue("AddNewUser.BTN_UpdateUser"));
		return this;
	}
	
	public AddNewUserPage SelectAllQueues() throws Throwable
	{
	keywords.selectAllOptions("xpath", _instance.getValue("AddNewUser.DropDown_Queues"));
	return this;
	}

	public AddNewUserPage GetBannerMsg(String displaymessage) throws Throwable
	{
		keywords.isdisplay("xpath", _instance.getValue("AddNewUser.SucessBanner"), displaymessage);
		return this;
	}
}
