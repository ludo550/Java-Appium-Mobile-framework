package Page.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class logintestobjects {
	public static DesiredCapabilities capabilities = new DesiredCapabilities();
	private static WebElement element = null;

	public static WebElement Loctn(AppiumDriver<WebElement> driver) {
		// element = driver.findElementByAccessibilityId(" Locations");
		element = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Locations')]"));
		return element;
	}

	public static WebElement NavBck(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("Navigate up");
		return element;
	}

	public static WebElement Contct(AppiumDriver<WebElement> driver) {
		// element = driver.findElementByAccessibilityId(" Contact");
		element = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Contact')]"));
		return element;
	}

	public static WebElement Suprt(AppiumDriver<WebElement> driver) {
		// element = driver.findElementByAccessibilityId(" Support");
		element = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Support')]"));
		return element;
	}

	public static WebElement Usrnme(AppiumDriver<WebElement> driver) {
		element = driver.findElementByClassName("android.widget.EditText");
		return element;
	}

	public static WebElement Ucontinue(AppiumDriver<WebElement> driver) {
		element = driver.findElementByClassName("android.widget.Button");
		return element;
	}

	public static WebElement Questab(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("Questions");
		return element;
	}

	public static WebElement Questn(AppiumDriver<WebElement> driver) {
		element = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'What')]"));
		return element;
	}

	public static WebElement Answr(AppiumDriver<WebElement> driver) {
		element = driver.findElementByClassName("android.widget.EditText");
		return element;
	}

	public static WebElement Acontinue(AppiumDriver<WebElement> driver) {
		element = driver.findElementByClassName("android.widget.Button");
		return element;
	}

	public static WebElement Password(AppiumDriver<WebElement> driver) {
		element = driver.findElementByClassName("android.widget.EditText");
		return element;
	}

	public static WebElement LgnBtn(AppiumDriver<WebElement> driver) {
		element = driver.findElementByClassName("android.widget.Button");
		return element;
	}

	public static WebElement Mnu(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("Menu open");
		return element;
	}

	public static WebElement Trnsfr(AppiumDriver<WebElement> driver) {
		element = driver.findElementByName("Transfers");
		return element;
	}

	public static WebElement Reasn(AppiumDriver<WebElement> driver) {
		element = driver.findElement(By.xpath("//android.widget.EditText[contains(@text,'Reason')]"));
		return element;
	}

	public static WebElement Frm(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("FROM");
		return element;
	}

	public static WebElement SvngSel(AppiumDriver<WebElement> driver) {
		element = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'Savings')]"));
		return element;
	}

	public static WebElement ChkSel(AppiumDriver<WebElement> driver) {
		element = driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'dianes chkg ')]"));
		return element;
	}

	public static WebElement To(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("TO");
		return element;
	}

	public static WebElement Amnt(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("Enter amount");
		return element;
	}

	public static WebElement CmptTrfr(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("Complete Transfer");
		return element;
	}
}