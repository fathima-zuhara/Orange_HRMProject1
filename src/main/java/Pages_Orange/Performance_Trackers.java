package Pages_Orange;

import org.openqa.selenium.By;

import Base_Orange.Base_Page;

public class Performance_Trackers extends Base_Page{
	
	
      public void Perform_TrackersPage() {
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();
		 driver.findElement(By.xpath("(//li/a[@role='menuitem'])[2]")).click(); 
	    }
      
      public void Perform_Tracker() {
    	 
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys(prop.getProperty("Name"));
    	  
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
    	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")).click();
	
      }
      
      public void Perform_Add() {
	       driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	       driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(prop.getProperty("Tracker_name")) ;
	       driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys(prop.getProperty("Employee_name")) ;
	       driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[2]")).sendKeys(prop.getProperty("Reviewers"));
	       driver.findElement(By.xpath("//button[@type='submit']")).click() ;
	       driver.findElement(By.xpath("(//button[@type='button'])[3]")).click() ;
	}
}
