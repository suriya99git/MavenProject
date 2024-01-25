package fuctionalTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Genric.BaseTest;
import Genric.ReadExcel;
import Pom.LoginPage;
import Pom.WelcomePage;

public class TC002_Test extends BaseTest {

	@Test(dataProvider = "logindata")
	public void testCase(String un,String ps){
		
		WelcomePage w = new WelcomePage(driver);
		
		w.getLogin_link().click();
		
		LoginPage l = new LoginPage(driver);
		
		l.getUserName().sendKeys(un);
		l.getPassword().sendKeys(ps);
		l.getLoginButton().click();
		
		
		
	}
	
	@DataProvider(name = "logindata")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		
		return ReadExcel.fetchData("sheet2");
	}
}
