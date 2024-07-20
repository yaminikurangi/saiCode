package java.com.surveillance.pages;



import java.util.List;

import org.openqa.selenium.WebElement;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class RevenuePerLiveUnitPage
{
	PropertySingleton _instance = null;

	public RevenuePerLiveUnitPage() {
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("RevenuePerLiveUnitPage");
	
	public RevenuePerLiveUnitPage selectBillableClient(String value)
	{
		keywords.SelectDropDown("xpath", _instance.getValue("RevenuePerLiveUnitPage.DropDown_Billable_client"), value);
		return this;
	}
	
	public RevenuePerLiveUnitPage clickOnApplyFilter()
	{
		keywords.click("xpath", _instance.getValue("RevenuePerLiveUnitPage.BTN_ApplyFilter"));
		return this;
	}
	
	
	public boolean getBillableClient(String Data)
	{
		boolean isData=true;
		 List<WebElement> list=	keywords.elementsFind("xpath", "//*[@id='app_container']/div/div[3]/div[2]/div//div[2]/a[1]");
		 
		 for(int i=0;i<list.size();i++)
		 {
			 System.out.println(list.get(i).getText());
			 if(list.get(i).getText().equals(Data))
			 {
				 System.out.println("Data Matching");
			 }
			 else
			 {
				 isData=false;
				 break;
			 }
		 }
		return isData;
	}
	

}
