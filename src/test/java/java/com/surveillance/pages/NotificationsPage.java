package java.com.surveillance.pages;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class NotificationsPage
{
	PropertySingleton _instance = null;
	public NotificationsPage() {
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("NotificationsPage");
	
	//NotificationsPage.DropDown_AvailableLiveUnits
	
	public NotificationsPage clickOnAddLiveUnitNotifications() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("NotificationsPage.BTN_AddLiveUnitNotifications"));
		
		return this;
	}
	
	public NotificationsPage SelectAvailableLiveUnits(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("NotificationsPage.DropDown_AvailableLiveUnits"), Data);
		return this;
	}
	
	public NotificationsPage SelectAvailableLiveUnitsByIdex(int Index) throws Throwable
	{
		
		keywords.SelectDropDownByIndex("xpath", _instance.getValue("NotificationsPage.DropDown_AvailableLiveUnits"), Index);
		return this;
	}
	
	public NotificationsPage SelectDropDown_Client(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("NotificationsPage.DropDown_Client"), Data);
		return this;
	}
	
	public NotificationsPage SelectDropDown_AssignedNotifications(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("NotificationsPage.DropDown_AssignedNotifications"), Data);
		return this;
	}
	
	public NotificationsPage SelectallAssignedNotifications() throws Throwable
	{
		
		keywords.selectAllOptions("xpath", _instance.getValue("NotificationsPage.DropDown_AssignedNotifications"));
		return this;
	}
	
	
	public NotificationsPage DeSelect_AssignedNotifications() throws Throwable
	{
		
		keywords.deSelectAll("xpath", _instance.getValue("NotificationsPage.DropDown_AssignedNotifications"));
		return this;
	}
	
	public NotificationsPage clickOnRemoveLiveUnitNotifications() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("NotificationsPage.BTN_RemoveLiveUnitNotifications"));
		
		return this;
	}
	
	public NotificationsPage clickOnCancel() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("NotificationsPage.BTN_Cancel"));
		
		return this;
	}
	
	public NotificationsPage clickOnUpdateNotifications() throws Throwable {
		keywords.scrollElementfound("xpath", _instance.getValue("NotificationsPage.BTN_UpdateNotifications"));
		keywords.jsClick("xpath", _instance.getValue("NotificationsPage.BTN_UpdateNotifications"));
		
		return this;
	}
	
	public NotificationsPage clickOnSendMotionDetectionPicture() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("NotificationsPage.Check_SendMotionDetectionPicture"));
		
		return this;
	}
	
	public NotificationsPage clickOnSendCameraHealthStatus() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("NotificationsPage.Check_SendCameraHealthStatus"));
		
		return this;
	}
	
	public NotificationsPage clickOnSendDeterrentChange() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("NotificationsPage.Check_SendDeterrentChange"));
		
		return this;
	}
	
	public NotificationsPage clickOnSendMotionDetectionVideo() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("NotificationsPage.Check_SendMotionDetectionVideo"));
		
		return this;
	}
	
	public NotificationsPage clickOnSendCameraRecordingStatus() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("NotificationsPage.Check_SendCameraRecordingStatus"));
		
		return this;
	}
	
	public NotificationsPage clickOnSendPowerLoss() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("NotificationsPage.Check_SendPowerLoss"));
		
		return this;
	}
	
	public String gettextNotificationsConfirmationPopUp() throws Exception {
	String text=	keywords.getText("xpath", _instance.getValue("NotificationsPage.NotificationsConfirmationPopUp"));
		return text;
	}
	
	public NotificationsPage clickonsConfirmationPopUpOk() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("NotificationsPage.BTN_Ok"));
		return this;
	}
	
	/*public NotificationsPage selectAllAssignedNotifications() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("NotificationsPage.DropDown_AssignedNotifications"));
		return this;
	}*/
	
	public boolean isenableSendMotionDetectionPicture() throws Throwable {
		keywords.scrollElementfound("xpath", _instance.getValue("NotificationsPage.BTN_UpdateNotifications"));
		boolean enable=	keywords.isEnabled("xpath", _instance.getValue("NotificationsPage.Check_SendMotionDetectionPicture"));
		return enable;
	}
	
	public boolean isenableSendCameraHealthStatus() throws Exception {
		boolean enable=	keywords.isEnabled("xpath", _instance.getValue("NotificationsPage.Check_SendCameraHealthStatus"));
		return enable;
	}
	
	public boolean isenableSendDeterrentChange() throws Exception {
		boolean enable=	keywords.isEnabled("xpath", _instance.getValue("NotificationsPage.Check_SendDeterrentChange"));
		return enable;
	}
	
	public boolean isenableSendMotionDetectionVideo() throws Exception {
		boolean enable=	keywords.isEnabled("xpath", _instance.getValue("NotificationsPage.Check_SendMotionDetectionVideo"));
		return enable;
	}
	
	public boolean isenableSendCameraRecordingStatus() throws Exception {
		boolean enable=	keywords.isEnabled("xpath", _instance.getValue("NotificationsPage.Check_SendCameraRecordingStatus"));
		return enable;
	}
	
	public boolean isenableCheck_SendPowerLoss() throws Exception {
		boolean enable=	keywords.isEnabled("xpath", _instance.getValue("NotificationsPage.Check_SendPowerLoss"));
		return enable;
	}
	
	

}
