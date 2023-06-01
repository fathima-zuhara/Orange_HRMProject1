package Pages_Orange;

import org.openqa.selenium.By;

import Base_Orange.Base_Page;

public class Perform_MyTrackers extends Base_Page {

	public void Tracker_View() {
		driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]")).click();
	}
	
	
	public void Add_Log() {
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(prop.getProperty("Log"));
		driver.findElement(By.xpath("((//button[@type='button']))[4]")).click();
		driver.findElement(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")).sendKeys(prop.getProperty("Comment"));
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
}
