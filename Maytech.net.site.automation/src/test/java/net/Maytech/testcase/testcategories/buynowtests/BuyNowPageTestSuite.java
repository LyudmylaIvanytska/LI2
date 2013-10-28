package net.Maytech.testcase.testcategories.buynowtests;
import net.Maytech.pages.enterapp.BuyNowPage;
import net.Maytech.pages.enterapp.HomePage;
import net.Maytech.pages.enterapp.LoginPage;
import net.Maytech.testcase.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

		
public class BuyNowPageTestSuite extends TestBase {
	
	@Test (groups = {"groupLQAS", "all", "mobile"})
	//TS 3.1
	public void enterBuyPage () throws InterruptedException {			
		LoginPage login = home.loginAdminPage(getUsermail(), getPassword());	
		HomePage homePage = accountPage.backToHomePage();
		BuyNowPage wannabuy = home.enterBuyNowPage();
		Assert.assertTrue(buyPage.isbuyNowButtonDisplayed());
	}
	
	@Test (groups = {"groupLQAS", "all", "mobile"})
	//TS 3.2
	public void testButtonsAlignment () throws InterruptedException {			
		BuyNowPage wannabuy = home.enterBuyNowPage(); 
		Assert.assertTrue(wannabuy.buttonsInOneLine());
	}
}



