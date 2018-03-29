package testBase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;

import Page.Objects.logintestobjects;
import Reusablemethods.ListenerClass;
import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseTest extends ListenerClass
{
	protected static AppiumDriver<WebElement> driver;
	public static List<String> ji;
	public static String lio = "Note 5,emu";
    public static ITestResult tru;
	//@SuppressWarnings("null")
    
	@DataProvider(name = "Browser")
	public String[] createData1()
	{
		String[] mal = lio.split(",");
		return mal;
	}
	
		//String[] ret = lio.split(",");
		//for(String b: ret)
		//{
			//ji.add(b);
		//}
		//return ji;
	public static String elementset1 = "questions,text,security"; 
	public static String[] jilo = elementset1.split(",");
	
	
	public static void ClickElement(String[] bullo,AppiumDriver<WebElement> driver, By by, String lino)
	{
		int ctr = 0;
		List<WebElement> milko = driver.findElements(by);
		for(WebElement kilo:milko)
		{
				if(bullo[ctr] == lino)
				{
					int x = kilo.getLocation().x;
					int y = kilo.getLocation().y;
					driver.tap(1, x, y, 1);
					break;
				}
			ctr++;
		}
		
	}


	

	public static AppiumDriver<WebElement> Blaunch(String clio) throws MalformedURLException {
		if (clio.equals("Note 5")) {
			
			logintestobjects.capabilities.setCapability("browserName", "chrome");
			logintestobjects.capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "0915f9758bb21b05");
			logintestobjects.capabilities.setCapability("device", "Android");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			// mandatory Obj.capabilities
			logintestobjects.capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			logintestobjects.capabilities.setCapability("platformVersion", "7.0");
			//logintestobjects.capabilities.setCapability("locationServicesAuthorized", true);
			//logintestobjects.capabilities.setCapability("autoGrantPermissions", true);
			driver = new AndroidDriver<WebElement>(url, logintestobjects.capabilities);
		} else if (clio.equals("emu")) {
			logintestobjects.capabilities.setCapability("browserName", "chrome");
			logintestobjects.capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_7_2012_API_26:5554");
			logintestobjects.capabilities.setCapability("device", "Android");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			// mandatory Obj.capabilities
			logintestobjects.capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			logintestobjects.capabilities.setCapability("platformVersion", "8.0");
			//logintestobjects.capabilities.setCapability("locationServicesAuthorized", true);
			//logintestobjects.capabilities.setCapability("autoGrantPermissions", true);
			driver = new AndroidDriver<WebElement>(url, logintestobjects.capabilities);
		}
		return driver;
	}
}
