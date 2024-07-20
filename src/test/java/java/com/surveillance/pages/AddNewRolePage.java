package java.com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class AddNewRolePage {
	PropertySingleton _instance = null;
	public AddNewRolePage() {
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("AddNewRolePage");
	
	public AddNewRolePage enterName(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddNewRolePage.Edit_Name"), value);
		return this;
}
	public AddNewRolePage enterDescription(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddNewRolePage.Edit_Description"), value);
		return this;
	}
	public AddNewRolePage ClickonViewCameraVideo(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_ViewCameraVideo"), value);
		return this;
	}
	public AddNewRolePage ClickonViewCameraArchives(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_ViewCameraArchives"), value);
		return this;
	}
	public AddNewRolePage ClickonSecurityEventOperator(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_SecurityEventOperator"), value);
		return this;
	}
	public AddNewRolePage ClickonControlCameraPTZF(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_ControlCameraPresets"), value);
		return this;
	}
	public AddNewRolePage ClickonControlCameraPresets(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_ControlCameraPTZF"), value);
		return this;
	}
	public AddNewRolePage ClickonSuspendPatrol(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_SuspendPatrol"), value);
		return this;
	}
	public AddNewRolePage ClickonManageCameraPresets(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_ManageCameraPresets"), value);
		return this;
	}
	public AddNewRolePage ClickonManageSecurityDeterrenceMode(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_ManageSecurityDeterrenceMode"), value);
		return this;
	}
	public AddNewRolePage ClickonAdministerUsers_ClientLevel(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_AdministerUsers_ClientLevel"), value);
		return this;
	}
	public AddNewRolePage ClickonAdministerUserRoles_ClientLevel(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_AdministerUserRoles_ClientLevel"), value);
		return this;
	}
	public AddNewRolePage ClickonViewSystemAnalytics(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_ViewSystemAnalytics"), value);
		return this;
	}
	public AddNewRolePage ClickonViewSystemSettings_DistributorLevel(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_ViewSystemSettings_DistributorLevel"), value);
		return this;
	}
	public AddNewRolePage ClickonAdministerUsers_DistributorLevel(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_AdministerUsers_DistributorLevel"), value);
		return this;
	}
	public AddNewRolePage ClickonAdministerSystemSettings_DistributorLevel(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_AdministerSystemSettings_DistributorLevel"), value);
		return this;
	}
	public AddNewRolePage ClickonViewSystemSettings(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_ViewSystemSettings"), value);
		return this;
	}
	public AddNewRolePage ClickonAdministerUsers_SystemLevel(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_AdministerUsers_SystemLevel"), value);
		return this;
	}
	public AddNewRolePage ClickonAdministerSecuritySystems(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_AdministerSecuritySystems"), value);
		return this;
	}
	public AddNewRolePage ClickonAdministerSystemSettings(String value) throws Exception {
		keywords.checkClick("xpath", _instance.getValue("AddNewRolePage.Check_AdministerSystemSettings"), value);
		return this;
	}

	public AddNewRolePage enterDefaultLandingPage(String value) throws Exception {
		keywords.enterData("xpath", _instance.getValue("AddNewRolePage.Edit_DefaultLandingPage"), value);
		return this;
	}
	public AddNewRolePage clickOnCancel() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("AddNewRolePage.BTN_Cancel"));
		
		return this;
	}
	public AddNewRolePage clickOnAddNewRole() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("AddNewRolePage.BTN_AddNewRole"));
		
		return this;
	}
	public AddNewRolePage clickOnAddaRole() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("AddNewRolePage.BTN_AddaRole"));
		
		return this;
	}



}
