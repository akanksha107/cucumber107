package com.radical.basic.parametrizedTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class parametrizedTest {
	protected WebDriver driver;

	@Before
	public void setUp() throws InterruptedException {
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("opned browser");
		Thread.sleep(5000);
	}

	@Given("^validate sign up$")
	public void signup(DataTable table) throws InterruptedException {
		System.out.println("in setup");
		driver.get("https://www.facebook.com/");
		List<List<String>> data = table.raw();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(data.get(1).get(1));
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(data.get(2).get(1));
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(data.get(3).get(1));
	}
	@When("^user selects radio button$")
	public void selectGender(){
		driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
		
	}

}
