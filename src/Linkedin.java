import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Linkedin {
	
	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver WebDriver = new FirefoxDriver();
		WebDriver.get("http://linkedin.com");
		String strUrl = WebDriver.getCurrentUrl();
		System.out.println(strUrl);
		WebDriver.findElement(By.id("session_key-login")).sendKeys("mitta.pavankreddy@gmail.com");
		Thread.sleep(1000);
		String strUname = WebDriver.findElement(By.id("session_key-login")).getAttribute("value");
		System.out.println("Entered USername as: " + strUname);
		WebDriver.findElement(By.id("session_password-login")).sendKeys("pavan143");
		Thread.sleep(1000);
		String strPwd = WebDriver.findElement(By.id("session_password-login")).getAttribute("value");
		System.out.println("Entered Passowrd as: " + strPwd);
		String strSignIn = WebDriver.findElement(By.name("signin")).getAttribute("value");
		WebDriver.findElement(By.name("signin")).click();
		Thread.sleep(1000);
		
		System.out.println("Clicked on: " + strSignIn );

		
	}

}
