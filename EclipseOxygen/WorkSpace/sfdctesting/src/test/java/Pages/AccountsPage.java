package Pages;

import static Pages.LPage.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountsPage extends LPage {

	public static WebElement account() {
	return driver.findElement(By.xpath("//a[contains(text(),'Accounts')]"));
	}
	public static WebElement lastAct() {
	return driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));	
	}
	public static WebElement LastSaved() {
	return driver.findElement(By.xpath("//h2[@class='pageDescription']"));
	}
	public static WebElement dateField() {
	return driver.findElement(By.xpath("//input[@id='ext-gen20']"));
	}
	public static WebElement createDate() {
	return driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
	}
	public static WebElement fromDt() {
	return driver.findElement(By.xpath("//input[@id='ext-comp-1042']"));
	}
	public static WebElement toDt() {
	return driver.findElement(By.xpath("//input[@id='ext-comp-1045']"));
	}
	public static WebElement save() {
	return driver.findElement(By.xpath("//button[@id='ext-gen49']"));
	}
	public static WebElement reportName() {
	return driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
	}
	public static WebElement reportUniName() {
	return driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
	}
	public static WebElement saveAndRun() {
	return driver.findElement(By.xpath("//*[@id=\"dlgSaveAndRun\"]/tbody/tr[2]/td[2]/em"));
	}
	
	
}
