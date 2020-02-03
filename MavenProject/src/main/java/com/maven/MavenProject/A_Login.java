package com.maven.MavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_Login extends FunctionalLibrary {
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement login;
	
	@FindBy(id="email")
	private WebElement emailaddress;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement signin;
	

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmailaddress() {
		return emailaddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}
	
	public A_Login() {
		PageFactory.initElements(driver, this);
	}
	
	
	

}
