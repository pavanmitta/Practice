import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gmail_Login {

	public static void main(String[] args) throws Exception {
		ExcelRead ReadData = new ExcelRead();
		String Path = "C:\\Pavan Mitta\\Backup\\Data\\Selenium-WD\\Test\\src\\TestData\\Gmail.xlsx";
	    String SheetName = "TestData";
		ReadData.setExcelFile(Path, SheetName);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(ExcelRead.getCellData(1, 0));
		driver.findElement(By.name("Passwd")).sendKeys(ExcelRead.getCellData(1, 1));
		driver.findElement(By.className("rc-button")).click();
		
//		String strCreate = driver.findElement(By.xpath("//*[@id='link-signup")).getText();
		try{
			String strCompose = driver.findElement(By.xpath("//*[@id=':j2']/div/div")).getText();
			System.out.println(strCompose);
		if(strCompose.equals("COMPOSE"))
		{
			System.out.println("Login Successful");
		}
		}
		catch(Exception e)
		{
			System.out.println("Login not Successful");
		}

	}

}
