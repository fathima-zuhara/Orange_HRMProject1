package Pages_Orange;

import org.openqa.selenium.By;

import Base_Orange.Base_Page;

public class Performance_Orange extends Base_Page{
	
	public void Performance() {
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[7]")).click();
		
	}

}
