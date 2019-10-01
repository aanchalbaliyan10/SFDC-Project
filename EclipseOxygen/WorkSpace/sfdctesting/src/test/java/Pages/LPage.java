package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LPage {
	protected static WebDriver driver;
		public void init(final String url) { 
		    System.setProperty
		    ("webdriver.chrome.driver","C:\\Testing\\Drivers\\Drivers\\chrome 76\\chromedriver.exe"); 
		    driver = new ChromeDriver();
		    driver.get(url);
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		 }
		@AfterTest
		public void tearDown() {
		    driver.close();
		 }
		
	public static WebElement getUserName() { 
	    return driver.findElement(By.id("username"));
	  }
	  public static WebElement getPassword() { 
	     return driver.findElement(By.id("password"));
	  }
	   public static WebElement getLoginButton() { 
	      return driver.findElement(By.id("Login"));
	   }
	   public static WebElement closewindow() {
		   return driver.findElement(By.xpath("//a[@id='tryLexDialogX']"));
	   }
	   public static WebElement remembermeButton() { 
		      return driver.findElement(By.xpath(" //input[@id='rememberUn']"));
		   }
	   public static WebElement forgotpasslink() { 
		      return driver.findElement(By.xpath("  //a[@id='forgot_password_link']"));
		   }
	  public static WebElement ForgotUsername() {
	         return driver.findElement(By.xpath("//input[@id='un']"));
	  }
	  public static WebElement continueButton() {
	   return driver.findElement(By.xpath("//input[@id='continue']"));
      }
	  public static WebElement pwdMsg() {
	  return driver.findElement(By.xpath("//p[contains(text(),'We’ve sent you an email with a link to finish rese')]"));
	  }
}
