package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objects.RediffLoginpage;

public class Loginapplication {

	// Login page class implemented in normal page object pattern style
		
		// Home page class implemented in Page object factory methdos
		@Test
		public void Login()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mtrej\\Desktop\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			RediffLoginpage rd=new RediffLoginpage(driver);
			rd.Emaild().sendKeys("hello");
			rd.Password().sendKeys("hello");
			rd.Home().click();			
		
			
		}

}
