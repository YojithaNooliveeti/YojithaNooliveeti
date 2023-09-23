package webdriver_manager;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager_5 {

	public static void main(String[] args) {
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com");
		
		/*
		 * avoidShutdownHook:-->
		 * 			Method keep browser open instead on closing it
		 * Create:-->
		 * 			It opens browser 
		 * get:-->
		 * 		   It load webpage to browser window
		 */
		

	}

}
