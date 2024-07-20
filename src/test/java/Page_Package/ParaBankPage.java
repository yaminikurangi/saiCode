package Page_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class ParaBankPage 
{
	public ParaBankPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Forgot login info?']")
	WebElement forgotLogin;
	
	@FindBy(id="firstName")
	WebElement fstName;
	
	@FindBy(id="lastName")
	WebElement lstName;
	
	@FindBy(id="address.street")
	WebElement address;
	
	@FindBy(id="address.city")
	WebElement cty;
	
	@FindBy(id="address.state")
	WebElement state;
	
	@FindBy(id="address.zipCode")
	WebElement code;
	
	@FindBy(id="ssn")
	WebElement ssn;
	
	

	@FindBy(xpath = "//input[@value='Find My Login Info']")
	WebElement findmy;
	
	
	GenericKeywordsWithPage key = new GenericKeywordsWithPage("Para_Bank_Page");

	
	public void ForgotLogin() 
	{
		key.click(forgotLogin); 
	}
	public void FirstName(String fname) 
	{
		key.enterData(fstName, fname);
	}	
	public void LastName(String lname) 
	{
		key.enterData(lstName, lname);
	}
	public void addressInput(String addrs) 
	{
		key.enterData(address, addrs);
	}
	public void cityInput(String city) 
	{
		key.enterData(cty, city);
	}
	public void StateInput(String sta) 
	{
		key.enterData(state, sta);
	}
	public void ZipCodeInput(String Zip) 
	{
		key.enterData(code, Zip);
	}
	public void snnInput(String ssnn) 
	{
		key.enterData(ssn, ssnn);
	}
	public void findmyLocation() 
	{
		key.click(findmy); 
	}
	
	
	
}
