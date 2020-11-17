package com.def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	public  WebDriver d;
	@Given(": User is on facebook page")
	public void user_is_on_facebook_page() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vignesh\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");

		 d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.facebook.com/");
	   
	}

	@When(": user should be enter the {string} and {string}")
	public void user_should_be_enter_the_and(String uname, String pass) {
		
		WebElement name = d.findElement(By.id("email"));
		name.sendKeys(uname);
		WebElement id = d.findElement(By.name("pass"));
		id.sendKeys(pass);
		
		
		
	}

	@Then(": user should click login button")
	public void user_should_click_login_button() {
		
		WebElement lo = d.findElement(By.name("login"));
		lo.click();
	   
	}



}
