package testpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver Driver = new FirefoxDriver();
		//WebDriver Driver = new InternetExplorerDriver();
		Driver.get("http://www.google.com");
		String strURL = Driver.getCurrentUrl();
		System.out.println(strURL);
		Thread.sleep(1000);
		//Driver.findElement(By.name("q")).click();
		//Thread.sleep(1000);
		Driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(1000);
		Driver.findElement(By.name("btnG")).click();
		Thread.sleep(1000);
		String strNavigateURL = Driver.getCurrentUrl();
		String strText = Driver.getTitle();
		System.out.println(strNavigateURL);
		System.out.println(strText);
		Driver.findElement(By.id("gb_70")).click();
		Thread.sleep(1000);
		String strLoginURL = Driver.getCurrentUrl();
		String strLoginTitle = Driver.getTitle();
		System.out.println(strLoginURL);
		System.out.println(strLoginTitle);
		Driver.findElement(By.id("Email")).sendKeys("mitta.pavanreddy3");
		Driver.findElement(By.id("Passwd")).sendKeys("pavan143");
		Driver.findElement(By.id("signIn")).click();
		Thread.sleep(1000);
		String strGmailURL = Driver.getCurrentUrl();
		String strGmailTitle = Driver.getTitle();
		System.out.println(strGmailURL);
		System.out.println(strGmailTitle);
		
	}
	
}
