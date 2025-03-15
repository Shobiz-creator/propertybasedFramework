package com.callTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.baseClass.baseClass;

public class testCall extends baseClass {
	
	@Test
	public static void testCall() throws IOException {
		configReader();
		intBrowser("chrome");
		invokeUrl();
		tearDown();
		
	}

}
