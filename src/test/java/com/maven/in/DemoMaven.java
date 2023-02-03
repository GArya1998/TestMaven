package com.maven.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.TestPrjctMaven.BaseClass;
import com.pom.in.POM;

public class DemoMaven extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = browserLaunch("Chrome");
		POM pom = new POM(driver);
		getTheUrl("https://www.instagram.com/");
		Thread.sleep(3000);
		SendThekeys(pom.getUsername(), "TestUser_08798786");
		SendThekeys(pom.getPassword(), "TUR_98nkk6");
		ClickTheElement(pom.getLogin());
		RefreshPage();
		getTheCurrentUrl();
		NavigateForwardPage();
		closeThePage();
	}
}
