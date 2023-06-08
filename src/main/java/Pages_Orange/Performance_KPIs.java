package Pages_Orange;

import java.lang.StackWalker.Option;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Base_Orange.Base_Page;

public class Performance_KPIs extends Base_Page{

	
	public void KPIs_Search() {
		

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]")).click();	

		
		List<WebElement> drop= driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div[2]/div[2]"));
			Iterator<WebElement> iterator=drop.iterator();
			while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				
				if (webElement.getText().equals(prop.getProperty("jobTitle"))) {
				webElement.click();	
				  }

		        }
			   driver.findElement(By.xpath("//button[@type='submit']")).click();
			   driver.findElement(By.xpath("//button[@type='reset']")).click();
		   }
		
		public void Add_KeyPerformance() {
			
			driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(prop.getProperty("Key_Per.indicator"));
		
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]")).click();
		
			List<WebElement> drop= driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[3]"));
			Iterator<WebElement> iterator=drop.iterator();
			while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if (webElement.getText().equals(prop.getProperty("jobTitleAdd"))) {
				webElement.click();	
				}
			}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement element=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div/label/span"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", element);
		
		WebElement elmt=driver .findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click;", elmt);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[1]")).click();
		
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
			//div[@class='oxd-select-text-input']
		
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]")).click();
			List<WebElement> dropKPI=driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[7]"));
			Iterator<WebElement> iterator=dropKPI.iterator();
			while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if (webElement.getText().equals(prop.getProperty("EditKPI"))) {
				webElement.click();	
				}
			}
			
			
			
		
			
		//	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]"));
		   
			
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div/label/span"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
		WebElement element= driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", element);	
			}
		
		}	

