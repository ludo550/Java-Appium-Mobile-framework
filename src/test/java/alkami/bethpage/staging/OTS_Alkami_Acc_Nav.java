package alkami.bethpage.staging;

import java.net.MalformedURLException;
//import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import Reusablemethods.Reuse;
import io.appium.java_client.MobileBy;
import testBase.baseTest;


public class OTS_Alkami_Acc_Nav extends baseTest
{
	// region static dependencies
	// endregion

	
	@Test(dataProvider = "Browser")
	public void Met_OTS_Alkami_Acc_Nav(String browser) 
	{   
		
			try 
			{
				Blaunch(browser);
			} 
			catch (MalformedURLException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
			}
			
		
			driver.navigate().to("https://www.howtogeek.com/205253/give-the-gift-of-free-tv-to-your-parents-this-christmas/");
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//tru.isSuccess();
			ClickElement(jilo, driver, MobileBy.IosUIAutomation("milo"), "questions");
			driver.quit();
		}

}
