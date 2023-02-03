package com.pom.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;

	@FindBy(name="password")
	private WebElement password;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement login;

	public WebDriver driver;

	public POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
