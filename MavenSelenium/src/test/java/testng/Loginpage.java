package testng;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import poi.Readdata;

public class Loginpage {
	String userchoice = "firefox";
	WebDriver browser;
	@BeforeTest
	public void precondition() {
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
	@AfterTest
	public void closebrowser() {
		//browser.close();
	}
	@Test(priority = 1)
	public void openurl() {
		String Expectedresult = "Login - PHPTRAVELS";
		browser.get("https://www.phptravels.net/login");
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertEquals(browser.getTitle(), Expectedresult);
	}
	@Test(priority =2)
	public void login() throws IOException {
		String Expectedresult = "Dashboard - PHPTRAVELS";
		Readdata xl = new Readdata();
		String username = xl.readrowandcell("C:\\Filehandling\\inputdata.xlsx", "Sheet1", 1, 0);
		String password = xl.readrowandcell("C:\\Filehandling\\inputdata.xlsx", "Sheet1", 1, 1);
		browser.findElement(By.name("email")).sendKeys(username);
		browser.findElement(By.name("password")).sendKeys(password);
		browser.findElement(By.id("cookie_stop")).click();
		browser.findElement(By.cssSelector("#fadein > div.container > div > div.modal-content.col.align-self-center > div.modal-body > div > form > div.btn-box.pt-3.pb-4 > button")).click();
	    Assert.assertEquals(browser.getTitle(), Expectedresult);
	}
	@Test(priority =3)
	public void clickmybookings() {
		browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[2]/a")).click();
	    List<WebElement> type =  browser.findElements(By.xpath("//table[@class = 'table  text-center']/tbody/tr/th[1]"));
	    List<WebElement> price =  browser.findElements(By.xpath("//table[@class = 'table  text-center']/tbody/tr/td[2]"));
	    for(int i=0;i<type.size();i++) {
	    	System.out.print(type.get(i).getText()+"--->");
	    	System.out.println(price.get(i).getText());
	    }
	}
	@Test(priority =4)
	public void logout() {
		String Expectedresult = "Login - PHPTRAVELS";
		browser.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[5]/a")).click();
		Assert.assertEquals(browser.getTitle(), Expectedresult);
	}
}