package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Start of the Suite");
	}
	@BeforeTest
	public void beforeTEST() {
		System.out.println("Preparing the test Environment");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Launching the browser");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Navigating to Demo webshop login page");
		driver.get("https://demowebshop.tricentis.com/");
	}
	@Test(priority=1)
	public void verifyPage() {
		System.out.println("page is displayed");
	}
	@Test(priority=2)
	public void loginTest() {
		System.out.println("performing login");
		driver.findElement(By.id("Email")).sendKeys("korukonda@gmail.com");;
		driver.findElement(By.id("Password")).sendKeys("anu@123");;
		System.out.println(driver.getTitle());
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Logout");
		driver.get("https://demowebshop.tricentis.com/");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Closing the Browser");
		if (driver != null) {
			driver.quit();
		}
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After test method should work");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite method should work");
	}
}
