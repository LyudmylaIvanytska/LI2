package net.Maytech.testcase.testcategories.hometests;

import org.testng.Assert;
import org.testng.annotations.Test;
import net.Maytech.testcase.TestBase;

//import net.Maytech.testcase.testcategories.HomenPageTest;

public class HomePageTestSuite extends TestBase{
	
	@Test (groups = {"groupLQAS", "all", "mobile"})
	//TS 1.1
	public void enterAdminPageView(){
		Assert.assertTrue(home.isSiteLogoDisplayed());
	}
	
	
	
}
