package com.callTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.baseClass.baseClass;
import com.baseClass.performFunctionalities;

public class testCallOne extends performFunctionalities  {
	
	
/*public static void method_one() throws IOException {
		
		configReader();
		intBrowser("chrome");
		invokeUrl();
		selectCountry();
		tripType();
		selectCity();
	}*/
	
	@BeforeSuite
	public static void method_one() throws IOException {
		configReader();
	}
	@BeforeTest
	public static void method_two() {
		intBrowser(System.getProperty("browser"));
		System.out.println("Method_two");
	}
	@Test
	public static void method_three() {
		
		invokeUrl();
	}
	
}
