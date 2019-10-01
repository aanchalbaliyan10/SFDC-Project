package testscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LPage;


public class TestCase1 extends LPage {
	
	
	@BeforeTest
	public void setUp() {
		init("https://login.salesforce.com/");
	}
	
	@Test(priority = 1)
	public void testLogin() { 
	    LActions loginAction = new LActions();
	    loginAction.login("aarohiguptajune28-29k4@force.com","windows8");
	 }
	
	public void forgotpassword() {
		LActions loginAction = new LActions();
	    loginAction.forgotpassword("aarohiguptajune28-29k4@force.com");
	}
	@Test (priority = 2)
	public void rememberme() {
		LActions loginAction = new LActions();
	    loginAction.rememberme();
	}
	@Test (priority =3)
	public void createaccount() {
		LActions loginAction = new LActions();
		loginAction.login("aarohiguptajune28-29k4@force.com","windows8");
		
		AccountsAction accountaction = new AccountsAction();
		accountaction.createaccount("MyReport", "MyUniqueReport");
		}
}
