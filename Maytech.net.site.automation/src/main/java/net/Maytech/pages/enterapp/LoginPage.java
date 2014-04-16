package net.Maytech.pages.enterapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import net.Maytech.pages.Page;

public class LoginPage extends Page {

	public LoginPage(WebDriver webDriver) {
		super(webDriver);
	}

	

	@FindBy(how = How.CSS, using = ".logo>a")
	public WebElement siteLogoOnLoginPage;
	@FindBy(how = How.NAME, using = "FIRSTNAME")
	public WebElement firstName;
	@FindBy(how = How.NAME, using = "LASTNAME")
	public WebElement lastName;
	@FindBy(how = How.XPATH, using = "//big")
	public WebElement loggedUser;

	public String userFirstName() {
		return firstName.getAttribute("value");
	}

	public String userLastName() {
		return lastName.getAttribute("value");
	}

	public String loggedUser() {
		return loggedUser.getText();
	}

	public HomePage backToHomePage() {
		siteLogoOnLoginPage.click();
		return PageFactory.initElements(webDriver, HomePage.class);

	}

}
