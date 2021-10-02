package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver (); // 1. Open the Browser	
		driver.get("https://manishtesting2018.wixsite.com/manishresume"); 	// 2. Enter URL
		
		String title = driver.getTitle(); 	// 3. Get the page title.
		System.out.println(title);			// Google
		
		//Validation point
		if (title.equals("Google")) {
			System.out.println("Title is correct");		
		}
		else {
			System.out.println("Incorrect titel");
		}
		
		System.out.println(driver.getCurrentUrl());		// https://www.google.com/
		//System.out.println(driver.getPageSource());
		
		Thread.sleep(2000);
		;
		//driver.quit();// close the browser	Interview Question 
		driver.close();	// close the browser
		
		//System.out.println(driver.getTitle()); //Session ID is null. Using WebDriver after calling quit()?
		
	}

}
