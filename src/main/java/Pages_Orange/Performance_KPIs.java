package Pages_Orange;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Base_Orange.Base_Page;

public class Performance_KPIs extends Base_Page{

	
	public void KPIs_Search() {
		
		String job=prop.getProperty("jobTitle");
		WebElement list=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div/div[1]"));
			List<WebElement> drop= driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div/div[1]"));
			for (int i=0;i< drop.size();i++) {
				String Job=drop.get(i).getText();
				System.out.println("Dropdown Text is  "+Job);
				if (Job.contains(prop.getProperty("jobTitle"))) {
					drop.get(i).click();
					break;
				}
				   
		            
			      }
			   driver.findElement(By.xpath("//button[@type='submit']")).click();
			   driver.findElement(By.xpath("//button[@type='reset']")).click();
			   }
		
		public void Add_KeyPerformance() {
			
			driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(prop.getProperty("Key_Per.indicator"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("Min_Rating"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("Max_Rating"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
		
		}
		
		public void KPIs_Selection() {
			 WebElement cb=driver.findElement(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]"));

			        cb.click();
			        
		}
		
		public void KPIs_Deletion() {
			 WebElement cb4=driver.findElement(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[3]"));
			
		    
		        cb4.click();
		
			 driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
			 driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash oxd-button-icon']")).click();
			       
		}
		
		public void Order_KPIs() {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-arrow-down-up oxd-icon-button__icon oxd-table-header-sort-icon']")).click();
			driver.findElement(By.xpath("(//i[@class='oxd-icon bi-sort-alpha-down'])[2]")).click();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}
		
		
		public void Edit_KPIs() {
			driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
			
		
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(prop.getProperty("EditKPI"));
			
			List<WebElement> dropKPI=driver.findElements(By.xpath("//div[@class='oxd-select-text-input']"));
			for (int i=0;i< dropKPI.size();i++) {
				String JobKPI=dropKPI.get(i).getText();
				System.out.println("Dropdown Text is  "+JobKPI);
				if (JobKPI.contains(prop.getProperty("jobTitle"))) {
					dropKPI.get(i).click();
					break;
				}
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys(prop.getProperty("Min_Rate"));
		  // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
//		   JavascriptExecutor jsr=(JavascriptExecutor)driver;
//		   WebElement submit=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
//		   jsr.executeScript("arguments[0].click();",submit);
			
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("Max_Rate"));
		   
			
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
			
			}
		
		}	
}
