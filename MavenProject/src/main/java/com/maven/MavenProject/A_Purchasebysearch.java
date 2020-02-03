package com.maven.MavenProject;

import org.openqa.selenium.WebDriver;

public class A_Purchasebysearch extends A_Paymentbysearch {
	
	public static void main(String[] args) {
		browserLaunch();
		
		openApp("http://automationpractice.com/index.php");
		
		A_Login al = new A_Login();
		enterText(al.getEmailaddress(), "viruraj16@gmail.com");
		enterText(al.getPassword(), "12345");
		clickBtn(al.getSignin());
		
		A_Searchbytext asrch = new A_Searchbytext();
		enterText(asrch.getSearchfield(), "dresses");
		clickBtn(asrch.getSearchbtn());
		
		A_Selectdress asd = new A_Selectdress();
		clickBtn(asd.getDress());
		clickBtn(asd.getAddtocart());
		clickBtn(asd.getCheckout1());
	    clickBtn(asd.getCheckout2());
	    clickBtn(asd.getCheckout3());
	    clickBtn(asd.getAgree());
	    clickBtn(asd.getCheckout4());
	    
	    A_Paymentbysearch aps = new A_Paymentbysearch();
	    clickBtn(aps.getPay());
	    clickBtn(aps.getConfirm());

}
	
}
