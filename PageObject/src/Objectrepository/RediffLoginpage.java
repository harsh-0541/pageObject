package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
   
	WebDriver driver;
	public RediffLoginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
		
	By username=By.xpath("//*[@id=\'login1\']");
	By password=By.name("passwd"); 
	By signin=By.name("proceed");

	public WebElement Email()
	
	{
		return driver.findElement(username);
	}
	public WebElement Password()
	{
		return	driver.findElement(password);
	}

	public WebElement Signin()
	{
		return	driver.findElement(signin);
		}
	
	}





