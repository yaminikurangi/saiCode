package java.com.surveillance.pages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class ArchivesLiveUnitsPage {

	PropertySingleton _instance = null;
	
	public ArchivesLiveUnitsPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("HomePage");
	
	public ArchivesLiveUnitsPage selectLiveUnit(String LiveUnit)
	{
		keywords.elementFind("xpath", "//div[@class='luNav__liveUnitsGroups']//div[text()='"+LiveUnit+"']").click();
			
		return this;
	}
	
	public ArchivesLiveUnitsPage clickonLiveUnitID()
	{
		keywords.click("xpath", _instance.getValue("Archives.OremOfficeBuildingID"));
		
		return this;
	}
	
	public ArchivesLiveUnitsPage selectCameraLink(String CameraLink)
	{
		keywords.elementFind("xpath", "(//*[@class='selectCamera__container']/a)["+CameraLink+"]").click();
		keywords.waitForPageLoad();
		return this;
	}
	
	public ArchivesLiveUnitsPage selectCameraCalendarDate(String Date) throws ParseException, Throwable
	{
		keywords.waitForPageLoad();
		Thread.sleep(15000);
		keywords.selectCalendarDate(_instance.getValue("Archives.DisplayDate"),_instance.getValue("Archives.PreviousMonthsLink"),_instance.getValue("Archives.NextMonthsLink"), Date);
		
		return this;
	}
	
	public String getTimeFromSelectTime() throws ParseException, Throwable
	{
		String time=keywords.getAttribute("xpath", _instance.getValue("Archives.EDIT_SelectTime"), "value");
		System.out.println(time);
		return time;
	}
	
	public String setVideoTime(String date) throws ParseException, Throwable
	{
		String Sdate=getTimeFromSelectTime();
		System.out.println(Sdate);
		SimpleDateFormat df1= new SimpleDateFormat("M/d/yyyy");
//		String sdate="2/14/2020";
		System.out.println("date: "+date);
		Date dateTobeSelected= df1.parse(date);
		String month=new SimpleDateFormat("MM/d").format(dateTobeSelected);
		System.out.println(month);
       	SimpleDateFormat df = new SimpleDateFormat("h:mm a");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date d1 = df.parse(Sdate); //date 1
        Date d2 = df.parse("1:00 AM"); // date 2
        long sum = d1.getTime() + d2.getTime();
        System.out.println(df.format(new Date(sum)));
        String consolidatedTime=Sdate+" - "+df.format(new Date(sum))+" "+month;;

      System.out.println(consolidatedTime);
		return consolidatedTime;
	}
	
	public String getVideoTime() throws Throwable
	{
		String displayTime=keywords.getText("xpath", _instance.getValue("Archives.VideoRetrieverTime"));
	return displayTime;
	}
}
