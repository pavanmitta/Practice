import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropdown {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
		String strPageTitle = driver.getTitle();   // Print Page Title
		System.out.println("The title of the page is: "+ strPageTitle);
		String strEnterKeyword = "Selenium";
		Thread.sleep(1000);
		driver.findElement(By.id("qp")).sendKeys(strEnterKeyword);	// Enter Keyword to search
		Thread.sleep(100);
		String strEnterKeyword_Exp = driver.findElement(By.id("qp")).getAttribute("value");  // Retrieving entered keyword
		System.out.println(strEnterKeyword_Exp);
			if(strEnterKeyword_Exp.equals(strEnterKeyword)) 	// Comparing Keywords
			{
				System.out.println("The entered keyword is: "+ strEnterKeyword);
			}
			else
			{
				System.out.println("The entered keyword is: "+ strEnterKeyword_Exp);
				driver.quit();
			}
			
		String strLocation = "Hyderabad";
		driver.findElement(By.name("ql")).sendKeys(strLocation);	// Enter Location
		String strLocation_Exp = driver.findElement(By.name("ql")).getAttribute("value");	// Retrieve Location
			if(strLocation_Exp.equals(strLocation))	// Comparing location entered
			{
				System.out.println("The entered Location is: "+ strLocation);
			}
			else
			{
				System.out.println("The entered location is: "+ strLocation_Exp);
				driver.quit();
			}
		driver.findElement(By.xpath("//*[@id='spanid_farea']/em")).click();
		Thread.sleep(500);
		//new Select(driver.findElement(By.xpath("//*[@id='farea']"))).selectByVisibleText("Shipping");
//		System.out.println("" + driver.findElement(By.id("farea")).getSize());
		driver.findElement(By.xpath("//*[@id='farea']")).clear();
		driver.findElement(By.xpath("//*[@id='farea']")).sendKeys("Shipping");
		driver.findElement(By.xpath("//*[@id='farea']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='exp']")).clear();
		driver.findElement(By.xpath("//*[@id='exp']")).sendKeys("4");
		driver.findElement(By.xpath("//*[@id='exp']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='minSal']")).clear();
		driver.findElement(By.xpath("//*[@id='minSal']")).sendKeys("5");
		driver.findElement(By.xpath("//*[@id='minSal']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='maxSal']")).clear();
		driver.findElement(By.xpath("//*[@id='maxSal']")).sendKeys("7");
		driver.findElement(By.xpath("//*[@id='maxSal']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='search']")).click();
		Thread.sleep(1000);
		strPageTitle = driver.getTitle();   // Print Page Title
		System.out.println("The title of the page is: "+ strPageTitle);
			
//		new Select(driver.findElement(By.id("fareaSL"))).selectByVisibleText("Shipping");
	}

}
