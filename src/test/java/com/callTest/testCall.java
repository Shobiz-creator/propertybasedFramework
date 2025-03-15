package com.callTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.baseClass.baseClass;
import com.baseClass.performFunctionalities;

public class testCall extends performFunctionalities  {
	
	@Test()
	public static void method_one() throws IOException {
		
		configReader();
		intBrowser("chrome");
		invokeUrl();
		selectCountry();
		tripType();
		selectCity();
	}
	

	
}
