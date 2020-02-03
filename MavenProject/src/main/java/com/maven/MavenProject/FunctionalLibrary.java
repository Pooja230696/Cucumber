package com.maven.MavenProject;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FunctionalLibrary {
											
	 

		public static WebDriver driver;

		public static WebDriver browserLaunch() {
			try {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Driver\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();

				driver.manage().window().maximize();
			} catch (Exception e) {
				System.out.println(e.getStackTrace());
			}return driver;
		}

		public static void openApp(String url) {
			try {
				driver.get(url);
			} catch (Exception e) {
				System.out.println(e.getStackTrace());
			}
		}

		public static void enterText(WebElement element, String value) {
			try {
				element.sendKeys(value);
			} catch (Exception e) {
				System.out.println(e.getStackTrace());
			}

		}

		public static void clickBtn(WebElement element) {
			try {
				element.click();
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		
		public static void dismiss() {
			
			driver.switchTo().alert().dismiss();

		}

		public static void dropDown(WebElement element, String value, String options) {
			Select s = new Select(element);
			if (options.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (options.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
			} else {
				s.selectByVisibleText(value);
			}
		}
		
			// TODO Auto-generated method stub

		public static void windowHandle() {
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
		}
		public static void windowHandles() {
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
		}

		public static void screenshot(String image) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File f1 = ts.getScreenshotAs(OutputType.FILE);
			File f2 = new File("D:\\Screenshot\\" + image + ".png");
			FileUtils.copyFile(f1, f2);
		}

		public static void scroll(WebElement element) {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0],scrollIntoView();",element);
		}
		
		public static void  mouseHover(WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
			

		}

	}


