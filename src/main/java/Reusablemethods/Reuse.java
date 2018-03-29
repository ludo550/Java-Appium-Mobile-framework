package Reusablemethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Data.Data;
import Page.Objects.logintestobjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import testBase.baseTest;

public class Reuse extends baseTest
{

	//protected static AppiumDriver<WebElement> driver;
	private static String refined = null;

	public static String lasty(AppiumDriver<WebElement> driver) {
		WebElement title = logintestobjects.Questn(driver);
		String title2 = title.getAttribute("name");
		String[] parts = title2.split(" ");
		String lastWord = parts[parts.length - 1];
		refined = lastWord.replace("?", "");
		return refined;

	}
	
	public static void print(String Print) {
		System.out.println(Print);
	}

	public static void Login(AppiumDriver<WebElement> driver) {
		try {
			Thread.sleep(2000);
			logintestobjects.Usrnme(driver).sendKeys(Data.UserName);
			driver.navigate().back();
			print("Verified that username is entered");
		} catch (Exception e) {
			print("Username coudn't be verified");
		}
		try {
			Thread.sleep(2000);
			((MobileElement) logintestobjects.Ucontinue(driver)).tap(1, 2);
			;
			print("Verified that continue is tapped");
		} catch (Exception e) {
			print("Continue could not be tapped");
		}
		try {
			Thread.sleep(2000);
			logintestobjects.Questab(driver).click();
			print("Navigated to Questions tab");
		} catch (Exception e) {
			print("Navigation to Questions tab failed");
		}
		try {
			Thread.sleep(2000);
			String Refined = Reuse.lasty(driver);
			logintestobjects.Answr(driver).sendKeys(Refined);
			driver.navigate().back();
			print("Verified that security question is answered");
		} catch (Exception e) {
			print("Security Question was not answered");
		}
		try {
			Thread.sleep(2000);
			((MobileElement) logintestobjects.Acontinue(driver)).tap(1, 2);
			print("Verified that the continue button is tapped");
		} catch (Exception e) {
			print("Continue could not be tapped");
		}
		try {
			Thread.sleep(2000);
			logintestobjects.Password(driver).sendKeys(Data.PassWord);
			print("Verified that the password is set");
		} catch (Exception e) {
			print("Password could not be set");
		}
		try {
			Thread.sleep(2000);
			logintestobjects.LgnBtn(driver).click();
			print("Verified that the Login Button is pressed");
		} catch (Exception e) {
			print("Login button couldn't be pressed");
		}

	}

	
}
