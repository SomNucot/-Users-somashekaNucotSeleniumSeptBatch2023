package LocatorConceptDemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver=new ChromeDriver();
		
		odriver.manage().deleteAllCookies();
		
		odriver.manage().window().maximize();
		
		odriver.get("https://app.hubspot.com/login");
		
		//1.Xpath=//tagname[@attribute='value']
		
		//examp --->  //input[@id='username']
		
		odriver.findElement(By.xpath("//input[@id='username']")).sendKeys("abcwqewrwr");
		
		odriver.findElement(By.xpath("//input[@id='password']")).sendKeys("abcfsdafdsf");
	
		odriver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		Thread.sleep(3000);
		
		odriver.quit();
		
		
		

	}

}
