package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmploye {
	
	@FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
	private WebElement PIMlink;
	
	@FindBy(linkText = "Add Employee")
	private WebElement addemployebutton;
	
	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement addcheckbox;
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[1]")
	private WebElement username;
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[2]")
	private WebElement password;
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[3]")
	private WebElement confirmpwd;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement savebutton;
	
	
	
	public AddEmploye(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Addemploy() {
		PIMlink.click();
		addemployebutton.click();
		firstname.sendKeys("Tafajjul");
		lastname.sendKeys("Zilani");
		addcheckbox.click();
		username.sendKeys("tafajjul Zilani");
		password.sendKeys("Tafajjul@987");
		confirmpwd.sendKeys("Tafajjul@987");
		savebutton.click();
	}
	

}
