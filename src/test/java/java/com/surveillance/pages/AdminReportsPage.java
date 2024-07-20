package java.com.surveillance.pages;

import java.text.ParseException;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class AdminReportsPage 
{
	PropertySingleton _instance = null;

	public AdminReportsPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("AdminReportsPage");
	
	public AdminReportsPage clickonSimpleReport()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminReportsPage.SimpleEventReport"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public AdminReportsPage clickonFrequencybyLocationReport()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminReportsPage.FrequencybyLocationReport"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public AdminReportsPage selectStartDate(String data) throws ParseException
	{
		keywords.jsClick("xpath", _instance.getValue("AdminReportsPage.StartDate"));
		keywords.selectDate(data);
		keywords.jsClick("xpath", _instance.getValue("AdminReportsPage.StartDate"));
		
		return this;
	}
	
	
	public AdminReportsPage clickonstatlable()
	{
		keywords.jsClick("xpath", _instance.getValue("AdminReportsPage.LBL_StartLable"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public AdminReportsPage selectEndDate(String data) throws ParseException
	{
		keywords.click("xpath", _instance.getValue("AdminReportsPage.EndDate"));
		keywords.selectDateNew(data);
		keywords.click("xpath", _instance.getValue("AdminReportsPage.EndDate"));
		return this;
	}
	
	public AdminReportsPage clickOnFetchReport() throws Exception {
		keywords.jsClick("xpath", _instance.getValue("AdminReportsPage.BTN_FetchReport"));
		keywords.waitForPageLoad();
		return this;
	}
	
	public AdminReportsPage SelectQueues(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("AdminReportsPage.DropDownQueues"), Data);
		return this;
	}
	public AdminReportsPage SelectLocations(String Data) throws Throwable
	{
	
		keywords.SelectDropDown("xpath", _instance.getValue("AdminReportsPage.DropDownLocations"), Data);
		return this;
	}
	
	public AdminReportsPage SelectUsers(String Data) throws Throwable
	{
		
		keywords.SelectDropDown("xpath", _instance.getValue("AdminReportsPage.DropDownUsers"), Data);
		return this;
	}
	
	public boolean verifyOverallTotalEvents() throws Throwable
	{
		
		boolean verifyText=keywords.verifyContainsText("xpath", _instance.getValue("AdminReportsPage.LBL_OverallTotalEvents"), "Overall Total Events:");
		return verifyText;
	}
	
	public boolean verifyResolveTimeAverage() throws Throwable
	{
		
	boolean verifyText=	keywords.verifyContainsText("xpath", _instance.getValue("AdminReportsPage.LBL_ResolveTimeAverage"), "Overall Resolve Time Average:");
		return verifyText;
	}
	
	public boolean verifyLocationName() throws Throwable
	{
		
	boolean verifyText=	keywords.verifyContainsText("xpath", _instance.getValue("AdminReportsPage.LBL_LocationName"), "Location Name");
		return verifyText;
	}
	
	public boolean verifyNumberEvents() throws Throwable
	{
		
	boolean verifyText=	keywords.verifyContainsText("xpath", _instance.getValue("AdminReportsPage.LBL_NumberEvents"), "Number Events");
		return verifyText;
	}
	
	public boolean verifyEventswithAudio() throws Throwable
	{
		
	boolean verifyText=	keywords.verifyContainsText("xpath", _instance.getValue("AdminReportsPage.LBL_EventswithAudio"), "Events with Audio");
		return verifyText;
	}

}
