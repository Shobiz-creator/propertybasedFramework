package com.baseClass;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class performFunctionalities extends baseClass {
	//public static WebDriverWait wait;
	//Code For AutoSuggestive dropdown country
	
	
	public static void selectCountry() {
		
		driver.findElement(By.xpath(prop.getProperty("country"))).sendKeys("IND"); //Entering Keyword to trigger autosuggestive menu.
		//System.out.println(prop.getProperty("country"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// implicit wait added so that all the element of the dropdown are loaded into the list
		List <WebElement> options = driver.findElements(By.xpath(prop.getProperty("countryList")));// Created a common xpath which is common and holds all the country values.
		for(WebElement option : options) { //iterated through values that has been stored into 
			if(option.getText().equalsIgnoreCase(prop.getProperty("countryname"))) {
				option.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				break;
			}else {
				System.out.println("Our service to the mentioned Location is yet to be initiated");
			}
		}
		
		
	}
	
	public static void tripType() {
		driver.findElement(By.xpath(prop.getProperty("tripType"))).click(); // selected trip type as one way
		
	}
	
	public static void selectCity() {
		//imported select class to select city from an static dropdown element.
		
		/*WebElement drop = driver.findElement(By.xpath(prop.getProperty("fromCity")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select dropdown = new Select(drop);
		dropdown.selectByValue("fromCityname");*/
		
		driver.findElement(By.xpath(prop.getProperty("fromCity"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath(prop.getProperty("fromCityname"))).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath(prop.getProperty("toCityname"))).click();
		
		/*WebElement down = driver.findElement(By.xpath(prop.getProperty("toCity")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select opt = new Select(down);
		opt.selectByValue("toCityname");*/
		
		
		
		
	}
	
	

}
