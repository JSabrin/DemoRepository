package Framework_Automation.Automation_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	public static WebDriver driver;
	
	String url ="https://www.google.com/";

	// Launching Browser

	@BeforeMethod

	public void launchApplication() {
		
		

		// two parameter, one is specified the browser, path of the browser .exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabrina\\Downloads\\chromedriver.exe");// intenseyet
																											// the
																											// browser
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url); // enter url

	}
	
	@Test(priority=4)
	public void logIn(){
		System.out.println("Log in to the app");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("Log out from the app");
	}
////	
////	try {
////	@Test(priority=1)
////	public void googleTitleTest() {
////		String title = driver.getTitle();
////		System.out.println(title);
////	}
////	}catch (Exception e) {
////		e.getStackTrace();
//	
	
//	@Test 
//	public void googleLogoTest() {
//	boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
//	}
//	@Test(priority=2i, enable = false)
//	public void googleSearch() {
//		driver.findElement(By.xpath("))
//	}
	@Test(priority=6)
	public void titleLogoTest() {
		System.out.println("Logo Title Test");
	}
	
	@Test(priority=3)
	public void googleLogoTest() {
		System.out.println("Test Google Logo");
	}
	@Test(priority=2)
	public void googleSearch (){
		System.out.println("Searching Google");
		
	}
	
	
	// close browser

	
	@AfterMethod
	public void tearDown(){
		driver.close();// only current specify the browser will close
		driver.quit(); // close all open browser within this program
	
	
	}

	}

//public interface sum() {
//}

