package Test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import POM.AddEmploye;
import POM.Adminpage;
import POM.Homepagelogin;

public class LoginHRM {
	@Test
	public void register() throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Homepagelogin login=new Homepagelogin(driver);
		login.loginmethod();
		Thread.sleep(2000);
		
		AddEmploye add=new AddEmploye(driver);
		add.Addemploy();
		Adminpage page=new Adminpage(driver);
		page.addusermethod();
		Thread.sleep(3000);
		//driver.close();

}}
