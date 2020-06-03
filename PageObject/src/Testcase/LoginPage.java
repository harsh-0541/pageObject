package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Objectrepository.RediffLoginpage;



public class LoginPage {
	
	@Test
	public void Login()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rediff.com/");
		RediffLoginpage red=new RediffLoginpage(driver);
		red.Email().sendKeys("harsh@rediff.com");
		red.Password().sendKeys("hello");
		red.Signin().click();
		
		
   
	}

}
