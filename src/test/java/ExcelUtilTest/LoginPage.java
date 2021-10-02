package ExcelUtilTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Selenium_14_ReadExcel_Using_APACHE_POI_API.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://manishtesting2018.wixsite.com/manishresume/contact");
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.id("input_comp-k5m6p3d8"));
		WebElement pass = driver.findElement(By.id("input_comp-k5m6p3dl"));
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Mitansh\\Desktop\\SampleExcel.xlsx");
		String sheetName = "login";
		
		int rowCount = reader.getRowCount(sheetName);
		
		for (int rowNum=2; rowNum<=rowCount; rowNum++) {
			String loginid = reader.getCellData(sheetName, "username", rowNum);
			String password = reader.getCellData(sheetName, "password", rowNum);
			
			System.out.println(loginid + " " + password);
			
			Thread.sleep(1000);
			
			username.clear();
			username.sendKeys(loginid);
			
			pass.clear();
			pass.sendKeys(password);

		}
		
	}

}
