package com.maven.MavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends  FunctionalLibrary{
	

	

		@FindBy(id="email")
		private WebElement emailId;
		
		@FindBy(id="pass")
		private WebElement password;

		public WebElement getEmailId() {
			return emailId;
		}

		public WebElement getPassword() {
			return password;
		}
		
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
}


