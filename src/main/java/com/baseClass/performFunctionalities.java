package com.baseClass;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class performFunctionalities extends baseClass {
	public static Actions act;
	public static void selectCountry() {
		
		driver.findElement(By.xpath(prop.getProperty("country"))).sendKeys("IND"); //Entering Keyword to trigger autosuggestive menu.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// implicit wait added so that all the element of the dropdown are loaded into the list
		List <WebElement> options = driver.findElements(By.xpath(prop.getProperty("countryList")));// Created a common xpath which is common and holds all the country values.
		for(WebElement option : options) { //iterated through values that has been stored into 
			if(option.getText().equalsIgnoreCase(prop.getProperty("countryname"))) {
				option.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				break;
			}
		}
		
		
	}
	
	public static void tripType() {
		driver.findElement(By.xpath(prop.getProperty("tripType"))).click(); // selected trip type as one way
		
	}
	
	public static void selectCity() {
		
		driver.findElement(By.xpath(prop.getProperty("fromCity"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath(prop.getProperty("fromCityname"))).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath(prop.getProperty("toCityname"))).click();
		
	}
	
	public static void dateselection() {
		driver.findElement(By.xpath(prop.getProperty("calendartool"))).click();
		driver.findElement(By.xpath(prop.getProperty("monthselection"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath(prop.getProperty("dateselection"))).click();
	}
	
	public static void scrollToElement() {
		act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(prop.getProperty("scrollElement")));
		act.scrollToElement(element).build().perform();
		String validate = element.getText();
		//assert.AssertEquals("Validate","Tax Docs","The label is validated");		
		//Assert.assertEquals(validate,"Tax Docs","Error h nahi chalega");

		
	}
}
