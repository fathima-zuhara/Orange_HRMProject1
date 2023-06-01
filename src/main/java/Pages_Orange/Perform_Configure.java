package Pages_Orange;

import org.openqa.selenium.By;
import Base_Orange.Base_Page;

public class Perform_Configure extends Base_Page{

	public void Configure() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span")).click();
	}
	
	public void KPIs(){
		
		driver.findElement(By.xpath("(//li/a[@role='menuitem'])[1]")).click();
	}
	
}


