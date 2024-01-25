package Genric;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest extends UtilityMethod {


	
	@BeforeSuite
	public void connectServer() {
		Reporter.log("Connection to the server",true);
	}
	@AfterSuite
	public void disconnectServer() {
		Reporter.log("Disconnect to the server",true);
	}
	@BeforeTest
	public void connectDB() {
		Reporter.log("Connect the data",true);
	}
	@AfterTest
	public void disconnectDB() {
		Reporter.log("Disconnect the data",true);
	}
	@BeforeClass
	public void lauchBrowser() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(prop().getProperty("url"));
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login......",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logot.....",true);
	}
}
