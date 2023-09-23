package hrm.Testcases;

import org.openqa.selenium.WebDriver;

import hrm.Pages.HomePageHRM;
import hrm.Pages.MenuTabs;
import hrm.Pages.PIM_AddEmployee;

public class PIM_Tests 
{
	WebDriver driver;
	HomePageHRM home;
	MenuTabs tabs;
	PIM_AddEmployee pim;
	
	public PIM_Tests(WebDriver driver) 
	{
		this.driver=driver;
		home=new HomePageHRM(driver);
		tabs=new MenuTabs(driver);
		pim=new PIM_AddEmployee(driver);
	}
	
	
	public void addinginvalidemployeename()
	{
		home.userlogin("Admin", "admin123");
		tabs.clickpimtab();
		pim.AddNewEmplyeeDetails("1234", "kumar", "Hi", "0012");
	}
	
	public void creatingemployeewithfirstnameempty()
	{
		home.userlogin("Admin", "admin123");
		tabs.clickpimtab();
		pim.AddNewEmplyeeDetails("", "kumar", "Hi", "0012");
		if(pim.verifyFirstnamerrorLabelPresented())
			System.out.println("Tetspass, Error Presnted");
		else
			System.out.println("Testfail, Error Not presnted");
	}
	
	

}
