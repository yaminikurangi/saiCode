package java.com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class AdminPage 
{
	PropertySingleton _instance = null;

	public AdminPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("AdminPage");
	
	public AdminPage clickOnUsersLink()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Users"));
		return this;
	}
	
	
	public AdminPage enterTheDataForFiletr(String Data)
	{
		keywords.enterData("xpath", _instance.getValue("AdminPage.Edit_Filter"),Data);
		return this;
	}
	
	public AdminPage clickNotificationFirstLink()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.NotificationFirstLink"));
		return this;
	}
	
	public AdminPage isFilterDisplay()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Edit_Filter"));
		return this;
	}
	
	public AdminPage isAllUsersDisplay()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Radio_AllUsers"));
		return this;
	}
	
	
	public AdminPage isUserExpiredDisplay()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Radio_UserExpired"));
		return this;
	}
	
	public AdminPage isUsersNonExpiredDisplay()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Radio_UsersNonExpired"));
		return this;
	}
	
	public AdminPage ispageTop_AddANewUserDisplay()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.pageTop_AddANewUser"));
		return this;
	}
	
	
	
	public AdminPage ispageTop_AddMultipleUsersDisplay()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.pageTop_AddMultipleUsers"));
		return this;
	}
	
	public AdminPage ispageBottom_AddANewUser()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.pageBottom_AddANewUser"));
		return this;
	}
	
	public AdminPage ispageBottom_AddMultipleUsersDisplay()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.pageBottom_AddMultipleUsers"));
		return this;
	}
	
	
	public AdminPage isLabel_FilterDisplay()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Label_Filter"));
		return this;
	}
	
	public AdminPage isLabel_ResultsperPageDisplay()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Label_ResultsperPage"));
		return this;
	}
	
	public AdminPage isLabel_AllUsersDisplay()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Label_AllUsers"));
		return this;
	}
	
	public AdminPage isLabel_ExpiredUsersDisplay()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Label_ExpiredUsers"));
		return this;
	}
	
	public AdminPage isLabel_NonExpiredUsersDisplay()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Label_NonExpiredUsers"));
		return this;
	}
	
	public AdminPage clickonClients() throws Throwable
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Clients"));
		return this;
	}
	
	public AdminPage clickonRoles() throws Throwable
	{
		keywords.jsClick("xpath", _instance.getValue("AdminPage.Roles"));
		return this;
	}

}
