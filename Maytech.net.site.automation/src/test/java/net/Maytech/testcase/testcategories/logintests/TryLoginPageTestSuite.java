package net.Maytech.testcase.testcategories.logintests;
import net.Maytech.pages.enterapp.LoginPage;
import net.Maytech.testcase.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;
public class TryLoginPageTestSuite  extends TestBase{
		
		@Test (groups = {"groupLQAS", "all", "mobile"})
		//TS 2.1
		public void enterAdminPageView() throws InterruptedException{
			LoginPage login = home.loginAdminPage(getUsermail(), getPassword());
			//Thread.sleep(4000); to see that it works
			Assert.assertTrue(( login).loggedUser().equals(("alex alex")));
		}
		
		@Test (groups = {"groupLQAS", "all", "mobile"})
		//Test 2.2
		public void checkUserCredentials() throws InterruptedException{
			LoginPage login = home.loginAdminPage(getUsermail(), getPassword());
			Assert.assertTrue(login.userFirstName().equals("alex") && login.userLastName().equals("alex"));
			
		}
		
		
}

