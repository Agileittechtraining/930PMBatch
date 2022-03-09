package cucumber;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import poi.Readdata;

public class Login {
	String userchoice = "firefox";
	WebDriver browser;
@Given("To Open a browser")
public void openbrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium Installations\\geckodriver.exe");
	System.setProperty("webdriver.edge.driver", "C:\\Selenium Installations\\msedgedriver.exe");
    if(userchoice=="chrome") {
    	browser = new ChromeDriver();
    }else if(userchoice=="firefox") {
    	browser = new FirefoxDriver();
    }else if(userchoice=="edge") {
    	browser = new EdgeDriver();
    }
	}	

@And("I want to open Login page of  PHP Travels")
public void openurl() {
	String Expectedresult = "Login - PHPTRAVELS";
	browser.get("https://www.phptravels.net/login");
	browser.manage().window().maximize();
	browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Assert.assertEquals(browser.getTitle(), Expectedresult);
}
@When("I Enter Username")
public void username() throws IOException {
	
	Readdata xl = new Readdata();
	String username = xl.readrowandcell("C:\\Filehandling\\inputdata.xlsx", "Sheet1", 1, 0);
	browser.findElement(By.name("email")).sendKeys(username);
}
@And("I Enter Password")
public void password() throws IOException {
	Readdata xl = new Readdata();
	String password = xl.readrowandcell("C:\\Filehandling\\inputdata.xlsx", "Sheet1", 1, 1);
	browser.findElement(By.name("password")).sendKeys(password);
}
@And("I click on Login Button")
public void clicklogin() {
	browser.findElement(By.id("cookie_stop")).click();
	browser.findElement(By.cssSelector("#fadein > div.container > div > div.modal-content.col.align-self-center > div.modal-body > div > form > div.btn-box.pt-3.pb-4 > button")).click();
}
@Then("Dashboard in login page must open")
public void opendashboard() {
	String Expectedresult = "Dashboard - PHPTRAVELS";
	Assert.assertEquals(browser.getTitle(), Expectedresult);
}
}
