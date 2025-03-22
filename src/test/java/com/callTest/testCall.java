package com.callTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.baseClass.baseClass;
import com.baseClass.performFunctionalities;

public class testCall extends performFunctionalities  {
	
	
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
		intBrowser("chrome");
	}
	@BeforeClass
	public static void method_three() {
		invokeUrl();
	}
	@Test(groups="CountrySelections")
	public static void method_four() {
		selectCountry();
		
	}
	@Test(groups="CountrySelections")
	public static void method_five() {
		tripType();
	}
	@Test(groups="CountrySelections")
	public static void method_six() {
		selectCity();
	}
	@Test(dependsOnMethods="method_six")
	public static void method_seven() {
		dateselection();
	}
	@Test
	public static void method_eight() {
		scrollToElement();
	}
	@AfterTest
	public static void tear_Down() {
		tearDown();
		System.out.println("Tear Down Complete");
	}
	
}
