package Page_Test_Orange;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Orange.Base_Page;
import Pages_Orange.Login_Orange;
import Pages_Orange.Perform_Configure;
import Pages_Orange.Perform_MyTrackers;
import Pages_Orange.Performance_KPIs;
import Pages_Orange.Performance_Orange;
import Pages_Orange.Performance_Trackers;

public class Login_pageTest extends Base_Page{
	
	Login_Orange Lp;
	Performance_Orange Pp;
	Perform_Configure Pc;
	Performance_KPIs Pk;
	Performance_Trackers Pt;
	Perform_MyTrackers Pm;
	
	@BeforeMethod
	public void Browser_config() {
		
		Initialization();
		Lp=new Login_Orange();
		Pp=new Performance_Orange();
		Pc= new Perform_Configure();
		Pk=new Performance_KPIs();
		Pt=new Performance_Trackers();
		Pm=new Perform_MyTrackers();
		
	}
	
	@Test
	public void Validate_Login() {
		Lp.Login();
		
	}
	
	@Test
	public void Validate_Invalid_Login() {
		Lp.Invalid_Login();
	}
	
	@Test
	public void Validate_Performance() {
		Lp.Login();
		Pp.Performance();
	}
	
	@Test
	public void ValidatePerform_Configure() {
		
		Validate_Performance();
		
	    Pc.Configure();	
	    
	}
	@Test
	public void ValidatePerformance_KPIs() {
	   ValidatePerform_Configure();
		
		Pc.KPIs();
		Pk.KPIs_Search();
		Pk.Add_KeyPerformance();
		Pk.KPIs_Deletion();
		Pk.KPIs_Selection();
		Pk.Order_KPIs();
		Pk.Edit_KPIs();
	}
	
	@Test
	public void ValidatePerformance_Trackers() {
		ValidatePerformance_KPIs();
		Pt.Perform_TrackersPage();
		Pt.Perform_Tracker();
	}
	
	@Test
	public void ValidatePerform_MyTrackers() { 
		ValidatePerformance_Trackers();
		Pm.Tracker_View();
		Pm.Add_Log();
	}
	@AfterMethod
	public void Validate_BrowserClosing() {
		TearDown();
	}
}
