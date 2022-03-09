package selenium;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Openurl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FirefoxOptions fo =  new FirefoxOptions();
ChromeOptions chrome =  new ChromeOptions();
WebDriver c1 = new RemoteWebDriver(new URL("http://localhost:4444/"), fo);
WebDriver c2 = new RemoteWebDriver(new URL("http://localhost:4444/"), chrome);
//c.get("https://www.facebook.com/");
c1.navigate().to("https://www.facebook.com/");
c1.quit();
c2.navigate().to("https://www.facebook.com/");
c2.quit();
	}

}
