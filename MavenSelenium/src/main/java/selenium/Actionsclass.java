package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		cd.get("https://www.snapdeal.com/");
		WebElement Mensfashion = cd.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]/a/span[2]"));
		Actions a = new Actions(cd);
		a.moveToElement(Mensfashion).build().perform();
		WebElement officebags = cd.findElement(By.xpath("//*[@id=\"category1Data\"]/div[1]/div/div/p[18]/a/span"));
	    a.moveToElement(officebags).click().build().perform();
	    WebElement leftslider = cd.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[1]"));
	    a.dragAndDropBy(leftslider, 100, 0).build().perform();
	}

}
