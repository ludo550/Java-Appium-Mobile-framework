package Page.Objects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class Account {
	private static WebElement element = null;

	public static WebElement Acctb(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("MyAccountsV2");
		return element;
	}

	public static WebElement Checking(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("CHECKING");
		return element;
	}

	public static WebElement Savgs(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("SAVINGS");
		return element;
	}

	public static WebElement Crtfct(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("CERTIFICATES");
		return element;
	}

	public static WebElement Loan(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("LOAN");
		return element;
	}

	public static WebElement LOC(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("LINE OF CREDIT");
		return element;
	}

	public static WebElement Mortg(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("LINE OF CREDIT");
		return element;
	}
}
