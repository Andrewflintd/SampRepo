package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public static WebDriver driver;
	String name;
	@When("user open the browser and enter url")
	public void user_open_the_browser_and_enter_url() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://khelo24bet.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//p[@class='skip-button']")).click();
	}

	@When("Enter the Username and password")
	public void enter_the_username_and_password() {
		
	    WebElement loginLink=driver.findElement(By.xpath("(//button[@class='rj__login'])[2]"));
	    loginLink.click();
	    name="gin";
	    WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username/Email']"));
	    username.sendKeys(name);
	    WebElement password=driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]"));
	    password.sendKeys("12345@aA");
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
	    WebElement lgnBtn=driver.findElement(By.id("login_formkhelo"));
	    lgnBtn.click();
	}

	@Then("verify the user logged in or not")
	public void verify_the_user_logged_in_or_not() throws InterruptedException {
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//i[@class='icon closeBtn mdi mdi-close'])[4]")).click();
	WebElement humbtn=driver.findElement(By.xpath("//I[@class='icon rightDrawerIcon mdi mdi-menu']"));
	humbtn.click();
	String userText=driver.findElement(By.xpath("(//p[@class='username jhgkl'])[2]")).getText();
	if(userText.equalsIgnoreCase(name))
	{
		System.out.println("Working as Expected");
	}
	else
	{
		System.out.println("Actual result does not match with expect");
	}
	driver.close();
	}

}
