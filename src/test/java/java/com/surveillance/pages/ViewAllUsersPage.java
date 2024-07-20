package java.com.surveillance.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.surveillance.utilitiy.GenericKeywords;
import com.surveillance.utilitiy.PropertySingleton;

public class ViewAllUsersPage {
	
	PropertySingleton _instance = null;

	public ViewAllUsersPage() 
	{
		_instance = PropertySingleton.getInstance();
	}

	public GenericKeywords keywords = new GenericKeywords("LoginPage");
	
	public String findRole(String columnName,String columndata)
	{
		
		String rowXpath="";
		if(columnName.equalsIgnoreCase("EmailAddress"))
		{
			rowXpath="//table/tbody/tr/td[1]";
		}
		else if(columnName.equalsIgnoreCase("Name"))
		{
			rowXpath="//table/tbody/tr/td[2]";
		}
		else if(columnName.equalsIgnoreCase("Clent"))
		{
			rowXpath="//table/tbody/tr/td[3]";
		}
		else if(columnName.equalsIgnoreCase("Role"))
		{
			rowXpath="//table/tbody/tr/td[4]";
		}
		String roleNumber="";
		List<WebElement> namesList=keywords.elementsFind("xpath", rowXpath);
		
		for(int i=0;i<namesList.size();i++)
		{
			System.out.println(namesList.get(i).getText());
			if(namesList.get(i).getText().equals(columndata))
			{
				roleNumber=i+2+"";
				System.out.println("roleNumber : "+roleNumber);
				break;
			}
			
		}
				
		return roleNumber;
		}

	public ViewAllUsersPage clickOnEmailAddress(String rolename)
	{
		String rowNumber=findRole("EmailAddress",rolename);
			keywords.elementFind("xpath", "//table/tbody/tr["+rowNumber+"]/td[1]/a").click();	


			return this;
		}
	
	public ViewAllUsersPage clickOnName(String rolename)
	{
		String rowNumber=findRole("Name",rolename);
			keywords.elementFind("xpath", "//table/tbody/tr["+rowNumber+"]/td[2]/a").click();	
			return this;
	}

	public ViewAllUsersPage clickonClient(String rolename)
	{
		String rowNumber=findRole("Clent",rolename);
			keywords.elementFind("xpath", "//table/tbody/tr["+rowNumber+"]/td[3]/a").click();	
			return this;
	}
	
	public ViewAllUsersPage clickonRole(String rolename)
	{
		String rowNumber=findRole("Role",rolename);
			keywords.elementFind("xpath", "//table/tbody/tr["+rowNumber+"]/td[4]/a").click();	
			return this;
	}
	
}
