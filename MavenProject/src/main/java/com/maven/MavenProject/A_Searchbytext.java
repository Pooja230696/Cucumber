package com.maven.MavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_Searchbytext extends A_Login {
	
	@FindBy(name="search_query")
	private WebElement searchfield;
	
	@FindBy(name="submit_search")
	private WebElement searchbtn;

	

	public WebElement getSearchfield() {
		return searchfield;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	public A_Searchbytext() {
		PageFactory.initElements(driver, this);
		
	}

}
