package com.maven.MavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_Paymentbysearch extends A_Selectdress {

	
	
	@FindBy(xpath="//a[@class=\"bankwire\"]")	
	private WebElement pay;
	
	@FindBy(xpath="//span[text()=\"I confirm my order\"]")
	private WebElement confirm;

	public WebElement getPay() {
		return pay;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	public A_Paymentbysearch() {
		PageFactory.initElements(driver, this);
	}
}
