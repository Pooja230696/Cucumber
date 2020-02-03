package com.maven.MavenProject;

import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	
    public  static  void initializebrowser() {
try {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\Driver\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();


	}catch(Exception e) {
		System.out.println(e.getStackTrace());
	}
	}

		public static  void launchApp(String url) {
	try {
		driver.get(url);
	}catch(Exception s)
	{
		System.out.println(s.getStackTrace());
	}
		}
public static void enterText(WebElement element,String name) {
	try {
		element.sendKeys(name);
	}catch(Exception e) {
		e.getStackTrace();
	}
	
}
public static void clickbutn(WebElement element) {
	try {
		element.click();
	}catch(Exception e2)
	{
e2.getStackTrace();
}
}
public static void dropDown(WebElement element, String value, String options) {
	
	Select s = new Select(element);
	if(options.equalsIgnoreCase("index")) {
		int x= Integer.parseInt(value);
		s.selectByIndex(x);
		
	}else  if(options.equalsIgnoreCase("value")) {
		s.selectByValue(value);
	}
	else  {
		s.selectByVisibleText(value);
	}
	
	
}
public static void gender(WebElement element)
{try {
	element.click();
}catch(Exception e) {
	System.out.println(e.getStackTrace());
}


}
public  static void screenshot(String name) throws IOException {
	
	TakesScreenshot ts=(TakesScreenshot) driver;

File x =  ts.getScreenshotAs(OutputType.FILE);
File x1 = new File("E:\\Screenshots"+name+".png");
FileUtils.copyFile(x, x1);
	
	

}
		
	
	
}


	
	
	


