package Page_Package;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;


public class Swap_Login_Page1 
{
	

	
		
		public Swap_Login_Page1(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}

		
		
		@FindBy(id="user-name")
		WebElement userName;
		
		@FindBy(id="password")
		WebElement password;
		  
		
		@FindBy(id="login-button")
		WebElement login;
		 
		GenericKeywordsWithPage key = new GenericKeywordsWithPage("Swap_Login_Page1");

		public void enterUsername(String enteruserId) 
		{
			
			key.enterData(userName, enteruserId);
		}
	
		
		public void enterPassword(String enterpassword) 
		{
			
			key.enterData(password, enterpassword);
		}
		
		
		

		
		public void loginButton()
		{
			key.click(login);
		}

	}


