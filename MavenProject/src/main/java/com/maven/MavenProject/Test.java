package com.maven.MavenProject;

import java.io.IOException;

import org.openqa.selenium.By;


public class Test extends Baseclass {
	public static void main(String[] args) throws IOException {
		initializebrowser();
		launchApp("https://www.facebook.com/");
		//enterText(driver.findElement(By.id("email")),"pooja@gmail.com");
		//enterText(driver.findElement(By.id("pass")),"1234564");
	   // clickbutn(driver.findElement(By.xpath("//input[@type='submit']")));
	    enterText(driver.findElement(By.name("firstname")),"Pooja");
	    screenshot("firstname");
	    enterText(driver.findElement(By.name("lastname")),"Varsha");
	    enterText(driver.findElement(By.xpath("(//input[@type='text'])[3]")),"pooja@gmail.com"); 
		enterText(driver.findElement(By.xpath("(//input[@type='text'])[4]")),"pooja@gmail.com");
		enterText(driver.findElement(By.xpath("//input[@id=\"u_0_w\"]")),"Pooja@23");
		dropDown(driver.findElement(By.id("day")),"23","index" );
		dropDown(driver.findElement(By.id("month")),"6","value" );
		dropDown(driver.findElement(By.id("year")),"1996","visibleText" );
		gender(driver.findElement(By.xpath("(//input[@type='radio'])[1]")));
		clickbutn(driver.findElement(By.xpath("(//button[@type='submit'])[1]")));
		screenshot("pooja");

		
	}

	
		
	}

	
	
		
	
	


