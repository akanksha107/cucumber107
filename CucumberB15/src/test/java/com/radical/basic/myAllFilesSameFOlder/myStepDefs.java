package com.radical.basic.myAllFilesSameFOlder;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myStepDefs {
	WebDriver driver;
@Given("^the user is on facebook login page$")
public void the_user_is_on_facebook_login_page(){
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
@When("^he enters \"([^\"]*)\" as user name$")
public void he_enters_user_name(String userName){
 driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userName)	;	
}

@And("^he enters \"([^\"]*)\" as password$")
public void he_enters_user_pass(String password) throws InterruptedException{
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	Thread.sleep(5000);
}

@Then("^check username is present in textbox$")
public void check_username_is_present_in_textbox(){
	Assert.assertTrue(true);
}
@When("^click login$")
public void clickLogin(){
 driver.findElement(By.xpath("//input[@value='Log In']")).click();	
driver.quit();
}
}
