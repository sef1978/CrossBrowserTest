package com.qa.util;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsManager {

	// get chrome options
	
	public static ChromeOptions getChromeOptions() {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--start-maximized"); // it provides maximize the browser
	//	co.addArguments("--headless");
		co.addArguments("--ignore-certificate-errors");
		co.addArguments("--disable-popup-blocking");
		co.addArguments("--incognito"); // private mode
		
		return co;
		
	}
	
	
	public static FirefoxOptions getFirefoxOptions() {
		
		FirefoxOptions fo = new FirefoxOptions();
		FirefoxProfile ffprofile = new FirefoxProfile();
		ffprofile.setAcceptUntrustedCertificates(true);
		ffprofile.setAssumeUntrustedCertificateIssuer(false);
		fo.setCapability(FirefoxDriver.PROFILE, ffprofile);
		
		return fo;
		
 	}
}
