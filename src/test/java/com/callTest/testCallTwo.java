package com.callTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class testCallTwo extends testCallOne {
	
	
	
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
	}
	@AfterSuite
	public static void close() {
		System.out.println("TearDown Complete");
	}
}
