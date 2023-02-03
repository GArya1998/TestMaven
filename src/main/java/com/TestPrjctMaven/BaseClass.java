package com.TestPrjctMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

//Browserlaunch
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vvmvk\\eclipse-workspace\\TestPrjctMaven\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "Firefox.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("check Browser");
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getTheUrl(String Url) {
		driver.get(Url);
	}

	public static void SendThekeys(WebElement ele, String str) {
		ele.sendKeys(str);

	}

	public static void ClickTheElement(WebElement ele) {
		ele.click();
	}

//dropdown(ele,string value,string i)
	public static void dropdown(WebElement ele, String value, String i) {
		Select s = new Select(ele);
		if (value.equals("index")) {
			s.selectByIndex(Integer.parseInt(i));

		}

		else if (value.equals("value")) {
			s.selectByValue(i);

		} else if (value.equals("text")) {
			s.selectByVisibleText(i);
		}
	}

	public static void RefreshPage() {
		driver.navigate().refresh();
	}
	//getText
		public static void getTheText(WebElement ele) {
			String text = ele.getText();
			System.out.println(text);
		}

	//isSelected
		public static void isSelected(WebElement ele) {
			boolean selected = ele.isSelected();
			System.out.println(selected);
		}

		// isDisplayed
		public static void isDisplayed(WebElement ele) {
			boolean displayed = ele.isDisplayed();
			System.out.println(displayed);
		}
		// getTitle
		public static void getTheTitle() {
			// driver.getTitle();
			String title = driver.getTitle();
			System.out.println(title);
		}

		// getCurrentUrl
		public static void getTheCurrentUrl() {
			String url = driver.getCurrentUrl();
			System.out.println(url);
		}

		// NavigateBack
		public static void navigateBackPage() {
			driver.navigate().back();
		}

		// NavigateTo
		public static void navigateToPage(String url) {
			driver.navigate().to(url);
		}

		// NavigateForward
		public static void NavigateForwardPage() {
			driver.navigate().forward();
		}
		public static void closeThePage() {
			driver.close();
		}

}
