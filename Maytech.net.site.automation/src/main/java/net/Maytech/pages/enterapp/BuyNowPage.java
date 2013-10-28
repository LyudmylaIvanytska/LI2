package net.Maytech.pages.enterapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.Maytech.pages.Page;


public class BuyNowPage extends Page{

	public BuyNowPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
    @FindBy (how = How.CSS, using = "a#FTPS-logo+*+a")
    		public WebElement buyNowButtonOnBuyNowPage;
    @FindBy (how = How.CSS, using = "a#IS-logo+*+a")
            public WebElement contactUsInstantShareButtonOnBuyNowPage;
    @FindBy (how = How.CSS, using = "a#QA-logo+*+a" )
    		public WebElement contactUsQuatrixButtonOnBuyNowPage;

	public boolean isbuyNowButtonDisplayed(){
		return buyNowButtonOnBuyNowPage.isDisplayed();
	}

	public boolean buttonsInOneLine () {
//    	this.
		return (buyNowButtonOnBuyNowPage.getLocation().y == contactUsInstantShareButtonOnBuyNowPage.getLocation().y
				&&
				buyNowButtonOnBuyNowPage.getLocation().y == contactUsQuatrixButtonOnBuyNowPage.getLocation().y);
    }
    
	
	
	}


