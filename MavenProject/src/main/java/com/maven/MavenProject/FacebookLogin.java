package com.maven.MavenProject;

import org.openqa.selenium.WebDriver;

public class FacebookLogin extends SignupPage{
	

		
		public static WebDriver driver;
		public static void main(String[] args) {
				browserLaunch();
				openApp("https://www.facebook.com/");
				SignupPage sn = new SignupPage();
				enterText(sn.getFirstName(), "FirstName");
				enterText(sn.getLastName(), "Lastname");
				enterText(sn.getMobileNumEmailId(), "2345");

			
		}

	

	}

