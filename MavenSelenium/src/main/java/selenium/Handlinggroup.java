package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinggroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://echoecho.com/htmlforms09.htm");
		//cd.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/input[3]")).click();
		List<WebElement> l = cd.findElements(By.name("Checkbox"));
	    System.out.println(l.size());
	
	    for(int i=0;i<l.size();i++) {
	        l.get(i).click();
		   	
	    }
	}

}
