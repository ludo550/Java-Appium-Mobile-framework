package Page.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class Location {
	private static WebElement element = null;

	public static WebElement adrss(AppiumDriver<WebElement> driver) {
		element = driver.findElement(By.id("address"));
		return element;
	}

	public static WebElement cty(AppiumDriver<WebElement> driver) {
		element = driver.findElement(By.id("city"));
		return element;
	}

	public static WebElement stte(AppiumDriver<WebElement> driver) {
		element = driver.findElement(By.id("state"));
		return element;
	}

	public static WebElement zip(AppiumDriver<WebElement> driver) {
		element = driver.findElement(By.id("zip"));
		return element;
	}

	public static WebElement Srchbtt(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("Search");
		return element;
	}

	public static WebElement curloc(AppiumDriver<WebElement> driver) {
		element = driver.findElement(By.id("current_location"));
		return element;
	}

	public static WebElement brnch(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("(Branch)");
		return element;
	}

	public static WebElement atm(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("Search");
		return element;
	}

	public static WebElement other(AppiumDriver<WebElement> driver) {
		element = driver.findElementByAccessibilityId("Search");
		return element;
	}
}
