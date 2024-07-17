package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {				
	
	
	WebDriver driver;
     
    @Given("I am on the login page")				
    public void i_am_on_the_login_page() throws Throwable							
    {		
    
    	
    	driver = new ChromeDriver();    	
        driver.get("https://ifwms.prmgroup.in/");
        driver.manage().window().maximize();
    }		

    @When("I enter valid credentials")					
    public void i_enter_valid_credentials() throws Throwable 							
    {		
    	WebElement username = driver.findElement(By.id("txtUser"));
        WebElement password = driver.findElement(By.id("txtPass"));
        username.sendKeys("PRM000175");
        password.sendKeys("Pass@12345");					
    }		
    
    @When("I click the login button")					
    public void i_click_the_login_button() throws Throwable 							
    {		
    	WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();			
    }	
    
    @Then("I should see the homepage")					
    public void i_should_see_the_homepage() throws Throwable 							
    {    		
    	Assert.assertTrue(driver.getTitle().contains("Homepage"));
        driver.quit();					
    }		

}