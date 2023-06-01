package Pages_Orange;

import org.openqa.selenium.By;

import Base_Orange.Base_Page;

public class Login_Orange extends Base_Page {
	
	public void Login() {
	
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	public void Invalid_Login() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("Invalid_username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}
	
	

}
