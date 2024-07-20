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

import Page_Package.ParaBankPage;



public class Para_Bank_Test extends BaseTest
{

	WebDriver driver;
	ParaBankPage p1;
		PropertySingleton _instance = null;
		SoftAssert s_assert = new SoftAssert();

		public void Para_Bank_Test() throws Throwable 
		{
			_instance = PropertySingleton.getInstance();
			p1 = new ParaBankPage(GenericKeywordsWithPage.driver);
		}

		@BeforeClass
		public void startReport()
		{
			beforeClassForChild(this);

			//driver.manage().timeouts().implicitlyWait(Duration.of)
		}


	//	@Test(dataProvider="setData")
		@Test
		public void Para_Bank_Page() throws Throwable 
		{
			extentLoggerECP = parentExtentLogger.createNode("login With creditials");
			s_assert = new SoftAssert();
			p1 = new ParaBankPage(GenericKeywordsWithPage.driver);
			
			p1.ForgotLogin();
			 p1.FirstName("charan");	
			 p1.LastName("cherry");
			 p1.addressInput("nallacheruvu");
			 p1.cityInput("Guntur");
			 p1.StateInput("AP");
			 p1.ZipCodeInput("522003");
			 p1.snnInput("123456");
			 passLog();
			 p1.findmyLocation();
			
			 
			

		}
		
		
//		@DataProvider
//		public Object[][] setData() 
//		{
//			Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//swapTestcaseExcel.xlsx");
//		
//			return ReadData.getData("Swap_Login", "Swap_Login_Test_Cases", xls);
//		}
		
		

		
		

	}


