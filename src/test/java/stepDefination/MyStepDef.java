package stepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.XLUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class MyStepDef{

	WebDriver driver;


	String xlfile =  "C:\\Users\\graje\\OneDrive\\Desktop\\SIdata.xlsx";

        //Hi....Hello
        //user is on login page`	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {

		this.driver = Hooks.getDriver();  
		System.out.println(driver.getTitle());

	}

	// verifying logging mechanism/functionality for multiple login credentials
	@When("^user fills the form in login page from given sheetname (.+) and rownumber (.+)$")
	public void user_fills_the_form_in_login_page_from_given_sheetname_and_rownumber(String sheetname, String rownumber) throws Throwable {

		int row = Integer.parseInt(rownumber);

		String username = XLUtils.getCellData(xlfile,sheetname, row, 0);  
		String password = XLUtils.getCellData(xlfile,sheetname, row, 1);
		
		System.out.println(username);
		System.out.println(password);

		driver.findElement(By.xpath("//input[@name ='userName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys(password);


	}


	//Clicking on Send Button
	@And("clicks on send Button")
	public void clicks_on_send_button() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name ='submit']")).click();
		
		Thread.sleep(5000);

	}

        //Login verification
	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {


		System.out.println(driver.getCurrentUrl());
		System.out.println("success");


	}


}
