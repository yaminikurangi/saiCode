package Test_Package;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

import Page_Package.Swap_Login_Page1;
import ch.qos.logback.core.util.Duration;



public class Swap_Login_Test1 extends BaseTest
{

	WebDriver driver;
	Swap_Login_Page1 p1;
		PropertySingleton _instance = null;
		SoftAssert s_assert = new SoftAssert();

		public void opencart1() throws Throwable 
		{
			_instance = PropertySingleton.getInstance();
			p1 = new Swap_Login_Page1(GenericKeywordsWithPage.driver);
		}

		@BeforeClass
		public void startReport()
		{
			beforeClassForChild(this);

			//driver.manage().timeouts().implicitlyWait(Duration.of)
		}

	//	@Test(dataProvider="setData")
		@Test
		public void Swap_Login_Page1() throws Throwable 
		{
			extentLoggerECP = parentExtentLogger.createNode("login With creditials");
			s_assert = new SoftAssert();
			p1 = new Swap_Login_Page1 (GenericKeywordsWithPage.driver);
			
			
			 p1.enterUsername("standard_user");
			 Thread.sleep(3000);
			 p1.enterPassword("secret_sauce");
			 Thread.sleep(3000);
			 p1.loginButton();
			 Thread.sleep(3000);
			 
			

		}
		
		
//		@DataProvider
//		public Object[][] setData() 
//		{
//			Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//swapTestcaseExcel.xlsx");
//		
//			return ReadData.getData("Swap_Login", "Swap_Login_Test_Cases", xls);
//		}
		
		

		
		

	}


