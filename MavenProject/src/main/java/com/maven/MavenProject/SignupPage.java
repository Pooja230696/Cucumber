package com.maven.MavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends FunctionalLibrary {

		@FindBy(name="firstname")
		private WebElement firstName;
		@CacheLookup
		@FindBy(name="lastname")
		private WebElement lastName;
		@CacheLookup
		@FindBy(xpath="//input[@name='reg_email__' and @aria-label='Mobile number or email address']")
		private WebElement mobileNumEmailId;
		public WebElement getFirstName() {
			return firstName;
		}
		public WebElement getLastName() {
			return lastName;
		}
		public WebElement getMobileNumEmailId() {
			return mobileNumEmailId;
		}

		public SignupPage() {
		PageFactory.initElements(driver, this);
		}
	}



