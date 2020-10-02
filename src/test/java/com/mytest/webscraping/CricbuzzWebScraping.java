package com.mytest.webscraping;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mytest.pages.CricbuzzHomePage;
import com.mytest.services.WebLibrary;

@Listeners(com.mytest.utils.TestListener.class)
public class CricbuzzWebScraping
{
	WebLibrary appLib;
	WebDriver driver;

	@Test
	public void testMethod()
	{
		appLib = new WebLibrary();
		driver = appLib.invokeBrowser("chrome");
		CricbuzzHomePage cbHome = new CricbuzzHomePage(driver);
		cbHome.goToCricbuzzHome();
		cbHome.openFirstOngoingMatch();
		cbHome.clickOnScorecard();
		cbHome.printCompleteScorecard();
		appLib.closeBrowser();
	}
}
