package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks  {
	
	public static WebDriver driver;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\SDET_COMPLETE_AUTOMATION\\HYBRID_SDET_PRACTICE\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.get("https://demo.guru99.com/test/newtours/");
        
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
