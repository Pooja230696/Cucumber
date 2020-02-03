package com.maven.MavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword extends FunctionalLibrary {
	

		@FindBy(id = "identify_email")
		private WebElement identifyEmail;
		@FindBy(name = "did_submit")
		private WebElement searchBtn;
		@FindBy(className = "uiButtonText")
		private WebElement cancelBtn;	
		@FindBy(className = "uiHeaderTitle")
		private WebElement findAccountHeaderText;
		public WebElement getIdentifyEmail() {
			return identifyEmail;
		}
		public WebElement getSearchBtn() {
			return searchBtn;
		}
		public WebElement getCancelBtn() {
			return cancelBtn;
		}
		public WebElement getFindAccountHeaderText() {
			return findAccountHeaderText;
		}
		
		public ForgotPassword() {
			PageFactory.initElements(driver, this);
		}

}
