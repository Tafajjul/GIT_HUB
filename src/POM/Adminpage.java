package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Adminpage {
	
	int i;


	@FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
	private WebElement PIMlink;
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private WebElement employname;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchbutton;
	
	Robot r ;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement statusdropdown;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employensmetextfield;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement usernsmetextfield;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement confirmpwdtextfield;
	
	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span'])[1]")
	private WebElement searchresult ;
	
	@FindBy(xpath = "(//div[@role='columnheader'])[4]")
	private WebElement employeenme;
	
	
	
	public Adminpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addusermethod() throws AWTException, InterruptedException {
		PIMlink.click();
		employname.sendKeys("Tafajjul Zilani");
		searchbutton.click();
		System.out.println(searchresult.getText());
		//System.out.println(employeenme.getText());
		
		/* for(i =0; i<searchresult.getText();i++)
		    {
		    	String text=searchresult.get(i).getText();
		    	
		    	//Printing all the auto suggestions from search bar.
		    	System.out.println(text);*/
		
		if(employeenme.getText()=="Tafajjul zilani")
		{
		System.out.println("verified user");
		}
		/*else
		{
			System.out.println("not verified");
		}*/
		
		
		
	}
	
	
}
