package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		cd.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		List<WebElement> l = cd.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		//List<WebElement> l2 = cd.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	  
		for(int i=0;i<l.size();i++) {
	    	System.out.print(l.get(i).getText()+"---->");
	    	//System.out.println(l2.get(i).getText());
	    }
	}

}
