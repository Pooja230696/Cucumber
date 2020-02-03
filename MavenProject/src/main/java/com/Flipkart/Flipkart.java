package com.Flipkart;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.maven.MavenProject.FunctionalLibrary;

public class Flipkart extends FunctionalLibrary {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch();
		openApp("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	    
	    
	    	List<WebElement> acList= driver.findElements(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
	    	List<WebElement> sub= driver.findElements(By.partialLinkText("otracker=nmenu"));

	    	for (WebElement e : acList) {
	    		
	    			    		Actions ac = new Actions(driver);
	    		ac.moveToElement(e).build().perform();
	    		for(WebElement s : sub) {
	    			ac.moveToElement(e).moveToElement(s).build().perform();
	    		Thread.sleep(2000);
	    	
	    		

//	    	    for(WebElement s : sub) {
//	    	    	    	Actions act = new Actions(driver);
//	      act.moveToElement(e).moveToElement(s).click().build().perform();
	    	    	    	    	    	    	
//	    	    Thread.sleep(3000);
	    	
//	    	for(int i=1;i < 8;i++) {
//	    		WebElement acList = driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8'][" +(i+1)+ "]"));
//	    		Actions ac = new Actions (driver);
//	    		ac.moveToElement(acList).build().perform();
//	    		Thread.sleep(3000);
		
	    		
	    		
	    	
	    	
	    	
	}
}
}
}
	    	
	    	  
	    	   	    	    
	    	    
		
//			Actions ac = new Actions(driver);
//		ac.moveToElement((WebElement) acList).build().perform();
		
		
	

	



