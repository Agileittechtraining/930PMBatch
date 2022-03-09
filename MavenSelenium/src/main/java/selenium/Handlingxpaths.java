package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingxpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Installations\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//cd.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Hello hi how are you");
	    cd.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("how are you");
	    cd.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(7) > td:nth-child(3) > input[type=text]:nth-child(1)")).sendKeys("Hello Hi How are you");
	    String str =  cd.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[5]")).getText();
	    System.out.println(str);
	}
	

}
