package com.baseClass;

import org.testng.annotations.AfterMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class baseClass {
	public static Properties prop;
	public static WebDriver driver;
	public static String browser;
	

	public static void configReader() throws IOException {
		try {
			FileInputStream file = new FileInputStream("D:\\GitStuff\\Project_Main\\src\\test\\resources\\config.properties");
			prop = new Properties();
			prop.load(file);
				
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void intBrowser(String browser) {
		
		try {
			
			if(browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Project\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver();
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\dell\\Desktop\\Project\\geckodriver-v0.36.0-win32\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void invokeUrl() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}
