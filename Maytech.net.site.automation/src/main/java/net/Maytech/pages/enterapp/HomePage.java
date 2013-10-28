package net.Maytech.pages.enterapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.Maytech.pages.Page;


public class HomePage extends Page{

	public HomePage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (how = How.CSS, using = "#logo-box")
	public WebElement siteLogo;
	
	@FindBy (how = How.CSS, using = "#returning-user")
	public WebElement signInButton;
	
	@FindBy (how = How.CSS, using = ".login-block.block")
	public WebElement signInMenu;
	
	@FindBy (how = How.CSS, using = "#txvUsername")
	public WebElement loginTextBox;
	
	@FindBy (how = How.CSS, using = "#txvPassword")
	public WebElement passwordTextBox;
	
	@FindBy (how = How.NAME, using = "submitButton")
	public WebElement loginButton;
	
	@FindBy (how = How.XPATH, using = "//a[contains(@href,'buy-now.html')]")
	public WebElement buyNowButton;
	
	public boolean isSiteLogoDisplayed(){
		return siteLogo.isDisplayed();
	}
	
	public LoginPage loginAdminPage(String loginName, String password){
		signInButton.click();
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		wait.until(ExpectedConditions.visibilityOf(signInMenu));
		loginTextBox.clear();
		passwordTextBox.clear();
		loginTextBox.sendKeys(loginName);
		passwordTextBox.sendKeys(password);
		loginButton.click();
		return PageFactory.initElements(webDriver, LoginPage.class);
	}
      public BuyNowPage enterBuyNowPage () {
    	  buyNowButton.click ();
    	  return PageFactory.initElements(webDriver, BuyNowPage.class);
    	  //WebDriverWait wait = new WebDriverWait(webDriver, 10);
    	  //wait.until(ExpectedConditions.visibilityOf(buyNowButtonOnBuyNowPage));
      }

}
