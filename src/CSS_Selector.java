import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CSS_Selector {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input#email")).sendKeys("mitta.pavankreddy@gmail.com");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("pavan143");
		driver.findElement(By.cssSelector("#u_0_n")).click();
		

	}

}
