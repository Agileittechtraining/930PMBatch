package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://echoecho.com/htmlforms09.htm");
		List <WebElement> l = cd.findElements(By.tagName("a"));
		System.out.println(l.size());
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i).getText());
		}
	}

}
