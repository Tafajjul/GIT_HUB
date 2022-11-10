package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagelogin {
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement usernametextfield;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	
	public Homepagelogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginmethod() {
		usernametextfield.sendKeys("Admin");
		passwordtextfield.sendKeys("admin123");
		loginbutton.click();
		}

}
