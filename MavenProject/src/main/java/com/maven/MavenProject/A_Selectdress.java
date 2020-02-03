package com.maven.MavenProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_Selectdress extends A_Searchbytext {
	
	@FindBy(xpath="(//a[@class='product_img_link'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//span[text()=' 							Proceed to checkout'] ")
	private WebElement checkout1;
	
	@FindBy(xpath="//span[text()=\"Proceed to checkout\"]")
	private WebElement checkout2;
	
	@FindBy(xpath="//span[text()=\"Proceed to checkout\"]")
	private WebElement checkout3;
	
	@FindBy(id="cgv")
	private WebElement agree;
	
	@FindBy(xpath="(//span[contains(text(),'Proceed')])[2]")
	private WebElement checkout4;
	

	public WebElement getDress() {
		return dress;
	}


	public WebElement getAddtocart() {
		return addtocart;
	}


	public WebElement getCheckout1() {
		return checkout1;
	}

	
	public WebElement getCheckout2() {
		return checkout2;
	}



	
	public WebElement getCheckout3() {
		return checkout3;
	}



	public WebElement getAgree() {
		return agree;
	}



	public WebElement getCheckout4() {
		return checkout4;
	}



public A_Selectdress() {
	PageFactory.initElements(driver, this);
}
}